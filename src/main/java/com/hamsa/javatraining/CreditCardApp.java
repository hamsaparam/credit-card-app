/**
 * 
 */
package com.hamsa.javatraining;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import com.hamsa.javatraining.model.CardApplication;
import com.hamsa.javatraining.model.ProcessCreditAppTask;
import com.hamsa.javatraining.service.CreditCardService;
import com.hamsa.javatraining.service.impl.CreditCardServiceImpl;

/**
 * @author hamsa
 *
 */
public class CreditCardApp {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		CreditCardService creditcardservice = CreditCardServiceImpl.getInstance();
		/*		creditcardservice.processCreditApp(new CardApplication("Test", "User", "7/10/1990", BigDecimal.valueOf(100000L),
				BigDecimal.valueOf(5000L)));
		creditcardservice.processCreditApp(new CardApplication("Test", "User", "7/10/1970", BigDecimal.valueOf(100000L),
				BigDecimal.valueOf(5000L)));
*/
		for (int i = 0; i < 100; i++) {
			ProcessCreditAppTask task = new ProcessCreditAppTask();
			task.setCardApplication(new CardApplication("Test" + i, "User" + i, "7/10/1970",
					BigDecimal.valueOf(100000L), BigDecimal.valueOf(5000L)));
			new Thread(task).start();
		}
		Thread.sleep(15000L);
		List<CardApplication> list = creditcardservice.retrieveCardApplications();
		Iterator<CardApplication> iter = list.iterator();
		int i = 0;

		while (iter.hasNext()) {
			++i;
			CardApplication application = iter.next();
			System.out.println("Applicant# :" + i + " Details: " + application.toString());
		}
	}

}
