package com.cg.main;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.main.controller.*;




@SpringBootTest
class ControllerApplicationTests {
	@Autowired
	private PlantController plantcontroller;

	/**
	 * mehtod for testing the plant plantcontroller
	 */
	@Test
	void plantContextLoads() {
		boolean result=true;
		if(plantcontroller.equals(null)) {
		result =false;
		}
		assertTrue(result);
	}
	

	@Autowired
	private LoginController logincontroller;

	/**
	 * mehtod for testing the login controller
	 */
	@Test
	void loginContextLoads() {
		boolean result=true;
		if(logincontroller.equals(null)) {
		result =false;
		}
		assertTrue(result);
	}

	@Autowired
	private SeedController seedcontroller;

	/**
	 * mehtod for testing the seed controller
	 */
	@Test
	void seedContextLoads() {
		boolean result=true;
		if(seedcontroller.equals(null)) {
		result =false;
		}
		assertTrue(result);
	}
	
	@Autowired
	private AdminController admincontroller;

	/**
	 * mehtod for testing the admin controller
	 */
	@Test
	void adminContextLoads() {
		boolean result=true;
		if(admincontroller.equals(null)) {
		result =false;
		}
		assertTrue(result);
	}
	
	@Autowired
	private FertilizerController fertilizercontroller;

	/**
	 * mehtod for testing the fertilizer controller
	 */
	@Test
	void fertilizerContextLoads() {
		boolean result=true;
		if(fertilizercontroller.equals(null)) {
		result =false;
		}
		assertTrue(result);
	}
	
	@Autowired
	private GardenDecorController garderdecorcontroller;

	/**
	 * mehtod for testing the garderdecor controller
	 */
	@Test
	void garderdecorContextLoads() {
		boolean result=true;
		if(garderdecorcontroller.equals(null)) {
		result =false;
		}
		assertTrue(result);
	}
	
	@Autowired
	private OrderController ordercontroller;

	/**
	 * mehtod for testing the order controller
	 */
	@Test
	void orderContextLoads() {
		boolean result=true;
		if(ordercontroller.equals(null)) {
		result =false;
		}
		assertTrue(result);
	}
	 
	@Autowired
	private PlanterContoller plantercontroller;

	/**
	 * mehtod for testing the planter controller
	 */
	@Test
	void planterContextLoads() {
		boolean result=true;
		if(plantercontroller.equals(null)) {
		result =false;
		}
		assertTrue(result);
	}
	
	
	@Autowired
	private PaymentController paymentcontroller;

	/**
	 * mehtod for testing the payment controller
	 */
	@Test
	void paymentContextLoads() {
		boolean result=true;
		if(paymentcontroller.equals(null)) {
		result =false;
		}
		assertTrue(result);
	}
	@Autowired
	private CustomerController customercontroller;

	/**
	 * mehtod for testing the customer controller
	 */
	@Test
	void customerContextLoads() {
		boolean result=true;
		if(customercontroller.equals(null)) {
		result =false;
		}
		assertTrue(result);
	}

}
