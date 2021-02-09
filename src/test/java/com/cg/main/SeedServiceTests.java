package com.cg.main;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.main.model.Seed;
import com.cg.main.service.ISeedService;


/**
 * 
 * @author manasa
 *JunitTestCases where all the testcases for seed module are processed
 */
@SpringBootTest
class SeedServiceTests {

	@Autowired
	private ISeedService service;
	@BeforeEach
	void setUp() throws Exception {
		System.out.println(".........***TEST STARTED***.......");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("......***TEST FINISHED***.........");
	}

	/**
	 * test case for add method
	 */
	@Test
	void addTestCase() {
		Seed seed =service.addSeed(new Seed("rose", "evening", "trice a day", "easy", "46 F", "vegetable", "corn is of type vegetable", 10, 20, 15));
		assertEquals("rose", seed.getCommonName());
	}
	
	/**
	 * test cases for viewing seed data using seed id
	 */
	@Test 
	void getSeedTestCase() {
		Seed seed = service.getSeed(3);
		assertEquals(3, seed.getSeedId());
	}
	
	/**
	 * test cases for delete method
	 */
	@Test
	void deleteTestCase() {
		List<Seed> seed = service.deleteSeed(15);
		assertNotNull(seed);	
	}
	
	/**
	 * test cases for update method
	 */
	@Test
	void updateTestCase() {
		Seed seed = service.updateSeed(new Seed("corn", "morning", "twice day", "easy", "46 F", "vegetable", "corn is of type vegetable", 10, 20, 15));
		assertEquals("corn", seed.getCommonName());
	}

	/**
	 * test case to view all seed data
	 */
	@Test
	void getAllSeedTestCase() {
		List<Seed> seed= service.getAllSeeds();
		boolean result = true;
		if (seed.equals(null)) {
			result = false;
		}
		assertTrue(result);	
	}
	
	/**
	 * test case to view seed data using seed name
	 */
	@Test
	void getSeedName() {
		List<Seed> seed= service.getSeedName("corn");
		boolean result = true;
		if (seed.equals(null)) {
			result = false;
		}
		assertTrue(result);	
	}
}
