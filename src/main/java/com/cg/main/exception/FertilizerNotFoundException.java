package com.cg.main.exception;

public class FertilizerNotFoundException extends RuntimeException {

	public FertilizerNotFoundException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param message
	 */
	public FertilizerNotFoundException(String message) {
		super(message);
	}
}