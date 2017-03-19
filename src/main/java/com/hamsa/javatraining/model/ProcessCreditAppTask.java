/**
 * 
 */
package com.hamsa.javatraining.model;

import com.hamsa.javatraining.service.CreditCardService;
import com.hamsa.javatraining.service.impl.CreditCardServiceImpl;

/**
 * @author hamsa
 *
 */
public class ProcessCreditAppTask implements Runnable {

	CardApplication cardApplication = null;
	
	/**
	 * @return the cardApplication
	 */
	public CardApplication getCardApplication() {
		return cardApplication;
	}

	/**
	 * @param cardApplication the cardApplication to set
	 */
	public void setCardApplication(CardApplication cardApplication) {
		this.cardApplication = cardApplication;
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		CreditCardService creditcardservice = CreditCardServiceImpl.getInstance();
		creditcardservice.processCreditApp(cardApplication);
	}

}
