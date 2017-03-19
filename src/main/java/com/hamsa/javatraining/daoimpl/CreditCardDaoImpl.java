package com.hamsa.javatraining.daoimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.hamsa.javatraining.dao.CreditCardDao;
import com.hamsa.javatraining.model.CardApplication;

public class CreditCardDaoImpl implements CreditCardDao {

	private static volatile CreditCardDaoImpl instance = null;

	private static Object key = new Object();

	private CreditCardDaoImpl() {
	}

	public static CreditCardDaoImpl getInstance() {
		if (instance == null) {
			synchronized (key) {
				instance = new CreditCardDaoImpl();
			}
		}
		return instance;

	}

	private final ConcurrentHashMap<String, CardApplication> db = new ConcurrentHashMap<String, CardApplication>();

	public void saveCreditApp(CardApplication cardApplication) {
		db.putIfAbsent(cardApplication.toString(), cardApplication);

	}

	public List<CardApplication> retrieveAllCreditApps() {
		List<CardApplication> list = new ArrayList<CardApplication>();
		Set<Entry<String, CardApplication>> row = db.entrySet();
		Iterator<Entry<String, CardApplication>> iter = row.iterator();
		while (iter.hasNext()) {
			Entry<String, CardApplication> entry = iter.next();
			list.add(entry.getValue());

		}
		return list;
	}

}
