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

import com.cg.main.exception.FertilizerNotFoundException;
import com.cg.main.model.Fertilizer;
import com.cg.main.service.IFertilizerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Controller class
 * 
 * @author Shweta
 *
 */
@Api(value = "controller", description="Handler Methods Related To Fertilizer Module !!!!")
@RestController
@RequestMapping("/api")
public class FertilizerController {

	@Autowired // Marks IFertilizer Service layer method as to be autowired by Spring's
				// dependency injection.
	IFertilizerService service;

	/**
	 * @param productName
	 * @return getAllFertilizer(productName)
	 */
	@ApiOperation(value="Click here to get Fertilizer by Product Name!!!")
	@GetMapping("/FertilizergetByName/{productName}")  // Annotation for mapping HTTP GET requests onto getFertilizerByname
	public ResponseEntity<List<Fertilizer>> getAllFertilizer(@PathVariable String productName) {
		List<Fertilizer> fertilizers = service.getAllFertilizer(productName);
		return new ResponseEntity<List<Fertilizer>>(fertilizers, HttpStatus.OK);
	}

	/**
	 * @param productId
	 * @return getFertilizer(productId)
	 */
	@ApiOperation(value="Click here to get Fertilizer by Product Id!!!")
	@GetMapping("/FertilizergetByProductId/{productId}") // Annotation for mapping HTTP GET requests onto getFertilizerByproductId
	public ResponseEntity<Fertilizer> getFertilizer(@PathVariable int productId) {
		Fertilizer fertilizer = service.getFertilizer(productId);
		if (fertilizer == null) {
			throw new FertilizerNotFoundException("No Fertilizer present with the given id: " + productId);
		}
		return new ResponseEntity<Fertilizer>(fertilizer, HttpStatus.OK);
	}

	/** 
	 * @return getAllFertilizer
	 */
	@ApiOperation(value="Click here to get all Fertilizer list!!!")
	@GetMapping("/FertilizergetAll")  //Annotation for mapping HTTP GET requests onto getAllFertilizer 
	public ResponseEntity<List<Fertilizer>> getFertilizer() {
		List<Fertilizer> fertilizer = service.getAllFertilizer();
		return new ResponseEntity<List<Fertilizer>>(fertilizer, HttpStatus.OK);
	}

	/**
	 * @param fertilizer
	 * @return addFertilizer
	 */
	@ApiOperation(value="Click here to add Fertilizer!!!")
	@PostMapping("/Fertilizeradd") //Annotation for mapping HTTP GET requests onto addFertilizer
	public Fertilizer addFertilizer(@Valid @RequestBody Fertilizer fertilizer) {
		Fertilizer fertilizerInfo = service.addFertilizer(fertilizer);
		return fertilizerInfo;
	}

	/**
	 * @param fertilizer
	 * @return updateFertilizer
	 */
	@ApiOperation(value="Click here to update Fertilizer!!!")
	@PutMapping("/Fertilizerupdate") //Annotation for mapping HTTP GET requests onto updateFertilizer
	public ResponseEntity<Fertilizer> updateFertilizer(@RequestBody Fertilizer fertilizer) {
		Fertilizer fertilizer2 = service.updateFertilizer(fertilizer);
		return new ResponseEntity<Fertilizer>(fertilizer2, HttpStatus.OK);
	}

	/**
	 * @param productId
	 * @return updateFertilizer
	 */
	@ApiOperation(value="Click here to delete Fertilizer by Product Id!!!")
	@DeleteMapping("/FertilizerdeleteByProductId/{productId}") //Annotation for mapping HTTP GET requests onto deleteFertilizer
	public ResponseEntity<List<Fertilizer>> deleteFertilizer(@PathVariable int productId) {
		List<Fertilizer> fertilizers = service.deleteFertilizer(productId);
		if (fertilizers.isEmpty()) {
			throw new FertilizerNotFoundException("No Book present with the given id: " + productId);
		}
		return new ResponseEntity<List<Fertilizer>>(fertilizers, HttpStatus.OK);
	}

}