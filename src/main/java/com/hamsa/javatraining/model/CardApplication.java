/**
 * 
 */
package com.hamsa.javatraining.model;

import java.math.BigDecimal;

/**
 * @author hamsa
 *
 */
public class CardApplication {
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param dateOfBirth
	 * @param annualSalary
	 * @param requestedCreditLimit
	 */
	public CardApplication(String firstName, String lastName, String dateOfBirth, BigDecimal annualSalary,
			BigDecimal requestedCreditLimit) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.annualSalary = annualSalary;
		this.requestedCreditLimit = requestedCreditLimit;
	}
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private BigDecimal annualSalary;
	private BigDecimal requestedCreditLimit;
	private boolean applicationStatus;
	private BigDecimal approvedCreditLimit;
	/**
	 * @return the applicationStatus
	 */
	public boolean isApplicationStatus() {
		return applicationStatus;
	}
	/**
	 * @param applicationStatus the applicationStatus to set
	 */
	public void setApplicationStatus(boolean applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	/**
	 * @return the approvedCreditLimit
	 */
	public BigDecimal getApprovedCreditLimit() {
		return approvedCreditLimit;
	}
	/**
	 * @param approvedCreditLimit the approvedCreditLimit to set
	 */
	public void setApprovedCreditLimit(BigDecimal approvedCreditLimit) {
		this.approvedCreditLimit = approvedCreditLimit;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * @return the annualSalary
	 */
	public BigDecimal getAnnualSalary() {
		return annualSalary;
	}
	/**
	 * @param annualSalary the annualSalary to set
	 */
	public void setAnnualSalary(BigDecimal annualSalary) {
		this.annualSalary = annualSalary;
	}
	/**
	 * @return the requestedCreditLimit
	 */
	public BigDecimal getRequestedCreditLimit() {
		return requestedCreditLimit;
	}
	/**
	 * @param requestedCreditLimit the requestedCreditLimit to set
	 */
	public void setRequestedCreditLimit(BigDecimal requestedCreditLimit) {
		this.requestedCreditLimit = requestedCreditLimit;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CardApplication [firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
				+ ", annualSalary=" + annualSalary + ", requestedCreditLimit=" + requestedCreditLimit
				+ ", applicationStatus=" + applicationStatus + ", approvedCreditLimit=" + approvedCreditLimit + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((annualSalary == null) ? 0 : annualSalary.hashCode());
		result = prime * result + (applicationStatus ? 1231 : 1237);
		result = prime * result + ((approvedCreditLimit == null) ? 0 : approvedCreditLimit.hashCode());
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((requestedCreditLimit == null) ? 0 : requestedCreditLimit.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CardApplication other = (CardApplication) obj;
		if (annualSalary == null) {
			if (other.annualSalary != null)
				return false;
		} else if (!annualSalary.equals(other.annualSalary))
			return false;
		if (applicationStatus != other.applicationStatus)
			return false;
		if (approvedCreditLimit == null) {
			if (other.approvedCreditLimit != null)
				return false;
		} else if (!approvedCreditLimit.equals(other.approvedCreditLimit))
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (requestedCreditLimit == null) {
			if (other.requestedCreditLimit != null)
				return false;
		} else if (!requestedCreditLimit.equals(other.requestedCreditLimit))
			return false;
		return true;
	}
	
	
	
	

}
