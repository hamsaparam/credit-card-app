/**
 * 
 */
package com.hamsa.javatraining.service.impl;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.hamsa.javatraining.dao.CreditCardDao;
import com.hamsa.javatraining.daoimpl.CreditCardDaoImpl;
import com.hamsa.javatraining.model.CardApplication;
import com.hamsa.javatraining.service.CreditCardService;

/**
 * @author hamsa
 *
 */
public class CreditCardServiceImpl implements CreditCardService {

	private static volatile CreditCardServiceImpl instance = null;

	private static Object key = new Object();

	private CreditCardServiceImpl() {
	}

	public static CreditCardServiceImpl getInstance() {
		if (instance == null) {
			synchronized (key) {
				instance = new CreditCardServiceImpl();
			}
		}
		return instance;

	}

	CreditCardDao dao = CreditCardDaoImpl.getInstance();

	public CardApplication processCreditApp(CardApplication cardApplication) {
		System.out.println("Processing: " + cardApplication.getFirstName());
		long age = calculateAge(cardApplication.getDateOfBirth());
		BigDecimal annualSalary = cardApplication.getAnnualSalary();

		if ((age > 30L) && (annualSalary.compareTo(BigDecimal.valueOf(50000L)) > 0)) {

			cardApplication.setApplicationStatus(true);
			cardApplication.setApprovedCreditLimit(BigDecimal.valueOf(5000L));
		} else {
			cardApplication.setApplicationStatus(false);
		}

		dao.saveCreditApp(cardApplication);
		return cardApplication;
	}

	private long calculateAge(String dateOfBirth) {
		long age = 0;
		if (dateOfBirth != null) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("M/d/yyyy");
			try {

				Date date = simpleDateFormat.parse(dateOfBirth);
				Calendar dob = new GregorianCalendar();
				// System.out.println(date);
				dob.setTime(date);
				LocalDate birthday = LocalDate.of(dob.get(Calendar.YEAR), dob.get(Calendar.MONTH),
						dob.get(Calendar.DAY_OF_MONTH));
				age = birthday.until(LocalDate.now(), ChronoUnit.YEARS);

			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return age;

	}

	public List<CardApplication> retrieveCardApplications() {

		return dao.retrieveAllCreditApps();

	}
}
