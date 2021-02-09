package com.cg.main.exception;

/**
*
* @author dishani
* 
* SeedNotFoundException class that handles the exception raised by the payment module
*/
public class PaymentNotFoundException extends RuntimeException {
	public PaymentNotFoundException() {

	}
	
	/**
	 * 
	 * @param message
	 */
	public PaymentNotFoundException(String message) {
		super(message);
	}
}
