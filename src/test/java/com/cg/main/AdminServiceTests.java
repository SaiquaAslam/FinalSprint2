package com.cg.main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.main.model.*;
import com.cg.main.service.*;
import com.cg.main.repository.*;

@SpringBootTest
class AdminServiceTests {

	@Autowired
	IAdminService s;

	/*
	 * @BeforeEach is used to signal that the annotated method should be executed
	 * before each @Test
	 */

	@BeforeEach
	void setUp() throws Exception {
	}

	/*
	 * @AfterEach is used to signal that the annotated method should be executed
	 * after each @Test
	 */

	@AfterEach
	void tearDown() throws Exception {
	}

	/*
	 * method for testing the service layer
	 */
	@Test
	void test() {
		Admin admin = s.addAdmin(new Admin("HARRY", "Hari32876@"));
		assertEquals("Hari32876@",admin.getAdminPassword());
	}
	@Test
	void test1() {
		Admin admin = s.addAdmin(new Admin("HARRY", "Hari32876@"));
		assertEquals("HARRY", admin.getAdminName());
	}
}