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

import com.cg.main.exception.GardenDecorNotFoundException;
import com.cg.main.model.GardenDecor;
import com.cg.main.service.IDecorService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(value="controller",description="Handler Methods Related To Plants Module!!!!")
@RestController
@RequestMapping("/api")
public class GardenDecorController {
	//AutoWire IDecorService Class
	@Autowired
	IDecorService service;
/**
 * 
 * @param productname
 * @return getGardenDecorByName
 */
	@ApiOperation(value="Click here to Get GardenDecor Using ProductName!!")
	@GetMapping("/GardenDecorgetByName/{productName}") //Annotation for mapping HTTP GET request onto getGardenDecorByName
	public ResponseEntity<List<GardenDecor>> getAllGardenDecorName(@PathVariable String productName) {
		List<GardenDecor> gardendecors = service.getAllGardenDecorName(productName);
		return new ResponseEntity<List<GardenDecor>>(gardendecors, HttpStatus.OK);
	}
	/**
	 * 
	 * @param productId
	 * @return getGardenDecorById
	 */
	
    @ApiOperation(value="Click here to Get GardenDecor Using Product Id !!")
	@GetMapping("/GardenDecorgetById/{productId}")//Annotation for mapping HTTP GET request onto getGardenDecorById
	public ResponseEntity<GardenDecor> getGardenDecor(@PathVariable int productId) {
		GardenDecor gardendecor = service.getGardenDecor(productId);
	
		if (gardendecor == null) {
			throw new GardenDecorNotFoundException("No GardenDecor present with the given id: " + productId);
		}
		return new ResponseEntity<GardenDecor>(gardendecor, HttpStatus.OK);
	}
	/**
	 * 
	 * @return getAllGardenDecor
	 */
    @ApiOperation(value="Click here to Get All GardenDecors!!")
	@GetMapping("/GardenDecorsgetAll") //Annotation for mapping HTTP GET request onto getGardenDecors
	public ResponseEntity<List<GardenDecor>> getGardenDecors() {
		List<GardenDecor> gardendecors = service.getAllGardenDecors();
		return new ResponseEntity<List<GardenDecor>>(gardendecors, HttpStatus.OK);
	}
	/**
	 * 
	 * @param gardendecor
	 * @return addGardenDecor
	 */
    @ApiOperation(value="Click here to Add GardenDecor!!")
	@PostMapping("/GardenDecoradd") //Annotation for mapping HTTP POST request onto addGardenDecor
	public ResponseEntity<Integer> addGardenDecor(@Valid @RequestBody GardenDecor gardendecor) {
		GardenDecor gardendecorInfo = service.addGardenDecor(gardendecor);
		return new ResponseEntity<Integer>(gardendecorInfo.getProductId(), HttpStatus.OK);
	}
	/**
	 * 
	 * @param gardendecor
	 * @return updateGardenDecor
	 */
    @ApiOperation(value="Click here to Update GardenDecor!!")
	@PutMapping("/GardenDecorupdate") //Annotation for mapping HTTP PUT request onto updateGardenDecor
	public ResponseEntity<GardenDecor> updateGardenDecor(@RequestBody GardenDecor gardendecor) {
		GardenDecor gardendecorInfo = service.updateGardenDecor(gardendecor);
		return new ResponseEntity<GardenDecor>(gardendecorInfo, HttpStatus.OK);
	}
	/**
	 * 
	 * @param productId
	 * @return deleteGardenDecor
	 */
    @ApiOperation(value="Click here to Delete GardenDecor!!")
	@DeleteMapping("/GardenDecordeleteById/{productId}")//Annotation for mapping HTTP DELETE request onto deleteGardenDecor
	public ResponseEntity<List<GardenDecor>> deleteGardenDecor(@PathVariable int productId) {
		List<GardenDecor> gardendecors = service.deleteGardenDecor(productId);
		if (gardendecors.isEmpty()) {
			throw new GardenDecorNotFoundException("No GardenDecor present with the given id: " + productId);
		}
		return new ResponseEntity<List<GardenDecor>>(gardendecors, HttpStatus.OK);
	}

}