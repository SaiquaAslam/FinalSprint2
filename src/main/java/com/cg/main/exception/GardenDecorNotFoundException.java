package com.cg.main.exception;

public class GardenDecorNotFoundException extends RuntimeException {

	public GardenDecorNotFoundException() {
		
	}
	/**
	 * 
	 * @param message
	 */

	public GardenDecorNotFoundException(String message) {
		super(message);
	}
}
