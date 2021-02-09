package com.cg.main;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.main.model.Payment;
import com.cg.main.service.IPaymentService;



/**
 * 
 * @author manasa
 *paymentTestCase class where all the test cases for payment module are processed
 */
@SpringBootTest
class PaymentServiceTestCase {

	@Autowired
	private IPaymentService service;
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println(".........***TEST STARTED***.......");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("......***TEST FINISHED***.........");
	}
	
	/**
	 * test case to add card payment
	 */
	@Test
	void addCardTestCase() {
		Payment payment =service.addCardPayment(new Payment("1520000000000162", 542));
		assertEquals("1520000000000162", payment.getCardNo());
	}
	
	/**
	 * test case to add upi payment 
	 */
	@Test
	void addUpiTestCase() {
		Payment payment =service.addUPIPayment(new Payment("7845", "upinum"));
		assertEquals("7845", payment.getUpiId());
	}
	/**
	 * test case to view all payment status
	 */
	@Test
	void getAllPaymentStatusTestCase() {
		List<Object[]> payment= service.getAllPaymentStatus();
		boolean result = true;
		if (payment.equals(null)) {
			result = false;
		}
		assertTrue(result);	
	}
	
	/**
	 * test case to get Payment Status By Id
	 */
	@Test
	void test1() {
		Object payment=service.getPaymentStatusById(26);
		assertEquals("Successful", payment);
	}
	
}
