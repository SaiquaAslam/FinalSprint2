package com.cg.main;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.cg.main.model.*;
import com.cg.main.service.*;

@SpringBootTest
class GardenDecorServiceTest {
	//AutoWire IDecorService Class
	@Autowired
	IDecorService service;

	/**
	 * 
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("TEST STARTED...");
	}

	/**
	 * 
	 * @throws Exception
	 */

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("TEST FINISHED...");
	}

	/**
	 * Test 1 addGardenDecor
	 */

	@Test
	void test1() {
		GardenDecor gardendecor = service
				.addGardenDecor(new GardenDecor("Stones", 350.0, 10, "transparent", "Light Glass"));
		assertEquals("Stones", gardendecor.getProductName());
	}

	/**
	 * Test 2 view GardenDecor using productId
	 */

	@Test
	void test2() {
		GardenDecor gardendecor = service.getGardenDecor(52);
		assertEquals(52, gardendecor.getProductId());
	}

	/**
	 * Test 3 UpdateGardenDecor
	 */

	@Test
	void test3() {
		GardenDecor gardendecor = service.updateGardenDecor(new GardenDecor("lamp", 400.0, 10, "Two colour", "Wooden"));
		assertEquals("lamp", gardendecor.getProductName());
	}

	/**
	 * Test 4 Delete GardenDecor
	 */

	@Test
	void test4() {
		List<GardenDecor> gardendecor = service.deleteGardenDecor(52);
		assertNotNull(gardendecor);
	}

	/**
	 * Test 5 Get All GardenDecor
	 */

	@Test
	void test5() {
		List<GardenDecor> gardendecor = service.getAllGardenDecors();
		boolean result = true;
		if (gardendecor.equals(null)) {
			result = false;
		}
		assertTrue(result);

	}

	/**
	 * Test 6 view GardenDecor Using productName
	 */

	@Test
	void test6() {
		List<GardenDecor> gardendecor = service.getAllGardenDecorName("lamp");
		boolean result = true;
		if (gardendecor.equals(null)) {
			result = false;
		}
		assertTrue(result);

	}

}
