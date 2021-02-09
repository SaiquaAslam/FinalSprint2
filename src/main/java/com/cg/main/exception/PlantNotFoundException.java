package com.cg.main.exception;

/**
 * @author Saiqua Aslam
 *
 */

//customise exception class
public class PlantNotFoundException extends RuntimeException {

	public PlantNotFoundException() {
		// TODO Auto-generated constructor stub
	}

	public PlantNotFoundException(String message) {
		super(message);
	}
}