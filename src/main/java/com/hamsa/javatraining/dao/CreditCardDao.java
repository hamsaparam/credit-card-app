/**
 * 
 */
package com.hamsa.javatraining.dao;

import java.util.List;

import com.hamsa.javatraining.model.CardApplication;

/**
 * @author hamsa
 *
 */
public interface CreditCardDao {

	void saveCreditApp(CardApplication cardApplication);
	List<CardApplication> retrieveAllCreditApps();
	
	
}
