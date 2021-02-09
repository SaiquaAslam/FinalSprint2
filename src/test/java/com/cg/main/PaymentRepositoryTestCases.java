package com.cg.main;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.main.repository.PaymentRepository;



/**
 * 
 * @author manasa
 * RepositoryTestCase class includes testcases for customized repository function 
 */
@SpringBootTest
class PaymentRepositoryTestCases {

	@Autowired
	private PaymentRepository repository;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * test case to view all payment status
	 */
	@Test
	void getAllPaymentStatusTestCase() {
		List<Object[]> payment=repository.findAllStatus();
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
		Object payment=repository.findStatusById(26);
		assertEquals("Successful", payment);
	}
	
}
