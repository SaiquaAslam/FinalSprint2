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

import com.cg.main.exception.SeedNotFoundException;
import com.cg.main.model.Seed;
import com.cg.main.service.ISeedService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
/**
*
* @author manasa
* SeedController class that handles all the methods and operations of seed module
*/
@Api(value = "Controller", description = "Handler Methods Related To Seeds Module!!!")
@RestController
@RequestMapping("/api")
public class SeedController {
	
		@Autowired
		ISeedService service;
		
		/**
		 * getSeedByName operation operates in viewing seed data using common name
		 * @param commanName
		 * @return
		 */
		@ApiOperation(value = "Click here to view Seed data using common name")
		@GetMapping("/getSeedByName/{commanName}")
		public ResponseEntity<List<Seed>> getSeedName(@PathVariable String commanName) {
			List<Seed> seed = service.getSeedName(commanName);
			if(seed.isEmpty()) {
					throw new SeedNotFoundException("No Seed present with the given Name : " + commanName);
			}
			return new ResponseEntity<List<Seed>>(seed, HttpStatus.OK);
		}
		
		/**
		 * getSeed operation operates in viewing seed data using seed id
		 * @param commanName
		 * @return
		 */
		@ApiOperation(value = "Click here to view Seed data using seed id")
		@GetMapping("/getSeed/{id}")
		public ResponseEntity<Seed> getSeed(@PathVariable int id) {
		Seed seed = service.getSeed(id);
		if (seed== null) {
			throw new SeedNotFoundException("No Seed present with the given id: " + id);
		}
			return new ResponseEntity<Seed>(seed, HttpStatus.OK);
		}

		/**
		 * getAllSeeds operation operates in viewing all the seed data 
		 * @param commanName
		 * @return
		 */
		@ApiOperation(value = "Click here to view all Seed data")
		@GetMapping("/getAllSeeds")
		public ResponseEntity<List<Seed>> getAllSeeds() {
			List<Seed> seed = service.getAllSeeds();
			return new ResponseEntity<List<Seed>>(seed, HttpStatus.OK);
		}
		
		/**
		 * addSeed operation operates in adding seed value
		 * @param commanName
		 * @return
		 */
		@ApiOperation(value = "Click here to add Seed data")
		@PostMapping("/addSeed")
		public ResponseEntity<Seed> addSeed(@Valid @RequestBody Seed seed) {
			Seed seedInfo = service.addSeed(seed);
			return new ResponseEntity<Seed>(seedInfo, HttpStatus.OK);
		}
		/**
		 * updateSeed operation operates in updating seed value
		 * @param commanName
		 * @return
		 */
		@ApiOperation(value = "Click here to update Seed data")
		@PutMapping("/updateSeed")
		public ResponseEntity<Seed> updateSeed(@RequestBody Seed seed) {
			Seed seedInfo = service.updateSeed(seed);
			return new ResponseEntity<Seed>(seedInfo, HttpStatus.OK);
		}

		/**
		 * deleteSeed operation operates in adding seed value
		 * @param commanName
		 * @return
		 */
		@ApiOperation(value = "Click here to delete Seed data")
		@DeleteMapping("/deleteSeed/{id}")
		public ResponseEntity<List<Seed>> deleteSeed(@PathVariable int id) {
			List<Seed> seed = service.deleteSeed(id);
			if (seed.isEmpty()) {
				throw new SeedNotFoundException("No Seed present with the given id: " + id);
			}
			return new ResponseEntity<List<Seed>>(seed, HttpStatus.OK);
		}
		
}