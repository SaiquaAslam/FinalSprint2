package com.cg.main;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;


import com.cg.main.model.*;
import com.cg.main.repository.*;
import com.cg.main.service.*;
@SpringBootTest
class OrderRepositoryTest {
	@Autowired
	OrderService service;


	/**
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Test start...");
	}


	/**
	 * @throws Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Test end...");
	}

	//Test for addOrder
	@Test
	void test1() {
		Order returnOrder = service.addOrder(new Order("12/05/2020", "upi", 5, 2500.00));
		assertEquals(5, returnOrder.getQuantity());
	}

	//Test for deleteOrder
	@Test
	void test2() {
		List<Order> list = service.deleteOrder(77);
		assertNotNull(list);

	}

	//Test for viewAllOrders
	@Test
	void test3() {
		List<Order> list = service.viewAllOrders();
		assertFalse(list.isEmpty());
	}

	//Test for viewOrder
	@Test
	void test4() {
		assertEquals("credit card", service.viewOrder(1).getTransactionMode());
	}

	//Test for updateOrder
	@Test
	void test5() {
		assertEquals("upi", service.updateOrder(new Order("12/05/2020", "upi", 5, 2500.00)).getTransactionMode());
	}

}
