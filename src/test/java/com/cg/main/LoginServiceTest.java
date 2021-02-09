package com.cg.main;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.main.model.*;
import com.cg.main.service.*;


/**
 * @author Saiqua Aslam
 *
 */
@SpringBootTest
class LoginServiceTest {

	@Autowired
	private ServiceLayer service;

	/**
	 * testing service layer method to to add a login details
	 */
	@Test
	void testAddMethod() {
		LoginDetails details = service.addLoginDetails(new LoginDetails("CHAHAT", "Nisha11@gmail.com", "Nisha@123"));

		assertEquals("CHAHAT", details.getUserName());

	}

	/**
	 * testing service layer method to upadte login details
	 */
	@Test
	void testUpdateMethod() {
		LoginDetails details = service
				.updateLoginDetails(new LoginDetails(1, "SAIQUAASLAM", "Saiqua1999@gmail.com", "Saiqua@123"));
		assertEquals("Saiqua@123", details.getPassword());
	}

	/**
	 * testing service layer method to delete login details using id
	 */
	@Test
	void testDeleteMethod() {
		String message = service.deleteLoginDetails(46);
		boolean result = false;
		if (message.equals(null))
			result = true;
		assertFalse(result);
	}

	void testGetDetails() {
		LoginDetails details = service.getLoginDetails(1);
		assertEquals("saiquaaslam1711@gmail.com", details.getEmailId());
	}

	/**
	 * testing service layer method to view all the login details present in
	 * database
	 *
	 */
	@Test
	void testgetAllDetailss() {
		List<LoginDetails> list = service.getAllLoginDetails();
		boolean result = true;
		if (list.isEmpty()) {
			result = false;
		}
		assertTrue(result);
	}

}
