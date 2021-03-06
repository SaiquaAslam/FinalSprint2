package com.cg.main.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.main.exception.RegistrationNotFoundException;
import com.cg.main.model.LoginDetails;
import com.cg.main.service.IServiceLayer;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author Saiqua Aslam
 *
 */
@Api(value="Controller",description="Handler Methods Related To Plants Module!!!!")
@RestController
@RequestMapping("/api")
public class LoginController {
	@Autowired
	IServiceLayer service;

	/**
	 * calling service layer method to to add login details
	 */
	@ApiOperation(value="Click here for new registration !!!")
	@PostMapping("/newRegistration")
	public LoginDetails addLoginDetails(@Valid @RequestBody LoginDetails details) throws Exception {
		List<LoginDetails> list = service.getAllLoginDetails();
		LoginDetails newDetails = null;
		for (LoginDetails l : list) {
			if (l.getEmailId().equals(details.getEmailId())) {

				throw new Exception("The given email-id - " + details.getEmailId() + " is already registered");
			}
		}
		newDetails = service.addLoginDetails(details);
		return newDetails;
	}

	/**
	 * calling service layer method to view all the login details present in
	 * database
	 */
	@ApiOperation(value="Click here to get all login details !!!")
	@GetMapping("/getAllDetails")
	public ResponseEntity<List<LoginDetails>> getAllDetails() throws Exception {
		List<LoginDetails> list = service.getAllLoginDetails();
		if (list.size() == 0) {
			throw new Exception("We have no Details of Login yet!!!!!");
		} else
			return new ResponseEntity<List<LoginDetails>>(list, HttpStatus.OK);
	}

	/**
	 * calling service layer method to upadte login details
	 */
	@ApiOperation(value="Click here to update your login details using id !!!")
	@PutMapping("/updateDetails")
	public ResponseEntity<LoginDetails> updateDetails(@Valid @RequestBody LoginDetails details) throws Exception {
		List<LoginDetails> list = service.getAllLoginDetails();
		LoginDetails newDetails = null;
		for (LoginDetails l : list) {
			if (l.getRegistrationId() == details.getRegistrationId()) {
				newDetails = service.updateLoginDetails(details);
				return new ResponseEntity<LoginDetails>(newDetails, HttpStatus.OK);

			}
		}

		throw new Exception("No Details present with the given id: " + details.getRegistrationId()
				+ "  to update......please login!!!");

	}

	/**
	 * calling service layer method to view login details using id
	 */
	@ApiOperation(value="Click here to get your login details using id !!!")
	@GetMapping("/getDetails/{id}")
	public ResponseEntity<LoginDetails> getDetails(@PathVariable("id") int id) {

		LoginDetails details = service.getLoginDetails(id);
		if (details == null) {
			throw new RegistrationNotFoundException("No Details present with the given id: " + id);
		}
		return new ResponseEntity<LoginDetails>(details, HttpStatus.OK);
	}

	/**
	 * calling service layer method to delete login details using id
	 */
	@ApiOperation(value="Click here to delete your login details using id !!!")
	@DeleteMapping("/deleteDetails/{id}")
	public String delete(@PathVariable int id) {

		LoginDetails details = service.getLoginDetails(id);
		if (details == null) {
			throw new RegistrationNotFoundException("No Details present with the given id: " + id);
		}
		String message = service.deleteLoginDetails(id);
		return message;
	}

	/**
	 * method for logging in
	 */
	@ApiOperation(value="Click here to login  !!!")
	@PutMapping("/LoginHere")
	public String Login(@Valid @RequestBody LoginDetails details) throws Exception {
		List<LoginDetails> list = service.getAllLoginDetails();

		String message = "WELCOME TO OUR HOME PAGE";
		for (LoginDetails l : list) {
			if (l.getRegistrationId() == details.getRegistrationId()) {
				return message;
			}
		}

		throw new Exception(
				"No Details present with the given id: " + details.getRegistrationId() + " , Please Register !!!");

	}

}
