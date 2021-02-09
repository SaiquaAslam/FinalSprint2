package com.cg.main;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import com.cg.main.model.Plant;
import com.cg.main.service.PlantService;




/**
 * @author Saiqua Aslam
 *
 */
@SpringBootTest
class PlantServiceTestCases {
	@Autowired
	private PlantService service;

	/**
	 * testing service layer method to to add a plant
	 */

	@Test
	void testAddPlant() {
		Plant plant = service.addPlant(new Plant(8.0, "Coriander leaves", "Improves Digestion", 22.9, 5, 150.0, "Herbs"));
		assertEquals("Coriander leaves", plant.getName());

	}

	/**
	 * testing service layer method to upadte plant
	 */
	@Test
	void testUpdatePlant() {
		Plant plant = service.updatePlant(new Plant(30, 20.0, "Tulsi", "Immunity Booster", 22.9, 5, 170.0, "shurb"));
		assertEquals(170.0, plant.getCost());
	}

	/**
	 * testing service layer method to delete plant using id
	 */
	@Test
	void testDeletePlant() {
		List<Plant> plant = service.deletePlant(43);
		assertFalse(plant.isEmpty());
	}

	/**
	 * testing service layer method to view plant using id
	 */
	@Test
	void testGetPlant() {
		Plant plant = service.getPlant(44);
		assertNotEquals("Rose", plant.getName());
	}

	/**
	 * testing service layer method to view all the plants present in database
	 *
	 */
	@Test
	void testgetAllPlants() {
		List<Plant> plantlist = service.getAllPlant();
		boolean result = true;
		if (plantlist.isEmpty()) {
			result = false;
		}
		assertTrue(result);
	}

	/**
	 * testing service layer method to view all the plants present in database using
	 * plant name
	 * 
	 */
	@Test
	void testGetAllByName() {
		List<Plant> plant = service.getAllByName("Tulsi");
		String name = plant.get(0).getName();
		assertEquals("Tulsi", name);
	}

	/**
	 * testing service layer method to view all the plants present in database using
	 * plant type
	 * 
	 */
	@Test
	void testGetAllByType() {
		List<Plant> plant = service.getAllByType("Shurbs");
		String type = plant.get(0).getType();
		assertEquals("Shurbs", type);
	}

}
