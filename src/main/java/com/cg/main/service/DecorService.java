package com.cg.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.main.model.GardenDecor;
import com.cg.main.repository.DecorRepository;


@Service // Indicates that an annotated class is a Service.
@Transactional // Describes a transaction attribute on an individual method or on a class.
public class DecorService implements IDecorService {
	// AutoWire DecorRepository Class
	@Autowired
	DecorRepository repository;

	/**
	 * method to view GardenDecor using productId
	 */
	@Override
	public GardenDecor getGardenDecor(Integer productId) {
		return repository.findById(productId).orElse(null);
	}

	/**
	 * method to view AllGardenDecors
	 */

	@Override
	public List<GardenDecor> getAllGardenDecors() {
		return repository.findAll();
	}

	/**
	 * method to Add GardenDecor Data
	 */

	@Override
	public GardenDecor addGardenDecor(GardenDecor gardendecor) {
		return repository.save(gardendecor);
	}

	/**
	 * method to view All GardenDecor using productName
	 */

	@Override
	public List<GardenDecor> getAllGardenDecorName(String productName) {
		return repository.findAllByProductName(productName);
	}

	/**
	 * method to Update GardenDecor Data
	 */

	@Override
	public GardenDecor updateGardenDecor(GardenDecor gardendecor) {
		return repository.save(gardendecor);
	}

	/**
	 * method to Delete GardenDecor Data using productId
	 */

	@Override
	public List<GardenDecor> deleteGardenDecor(Integer productId) {
		List<GardenDecor> list = new ArrayList<>();

		GardenDecor b = repository.findById(productId).orElse(null);
		if (b == null) {
			return list;

		} else {
			repository.deleteById(productId);
			return repository.findAll();
		}
	}

}
