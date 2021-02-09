package com.cg.main.exception;

/**
 * @author Saiqua Aslam
 *
 */

//customise exception class
public class RegistrationNotFoundException extends RuntimeException {

	public RegistrationNotFoundException() {
		// TODO Auto-generated constructor stub
	}

	public RegistrationNotFoundException(String message) {
		super(message);
	}
}