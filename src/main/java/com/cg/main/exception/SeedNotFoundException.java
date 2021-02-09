package com.cg.main.exception;
/**
*
* @author manasa
* 
* SeedNotFoundException class that handles the exception raised by the seed module
*/
public class SeedNotFoundException extends RuntimeException {

	public SeedNotFoundException() {
		// TODO Auto-generated constructor stub

	}

	/**
	 * 
	 * @param message
	 */
	public SeedNotFoundException(String message) {
		super(message);
	}

}
