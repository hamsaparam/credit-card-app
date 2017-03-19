/**
 * 
 */
package com.hamsa.javatraining.service;

import java.util.List;

import com.hamsa.javatraining.model.CardApplication;

/**
 * @author hamsa
 *
 */
public interface CreditCardService {

	CardApplication processCreditApp(CardApplication cardApplication);
	List<CardApplication> retrieveCardApplications();
	
	
}
