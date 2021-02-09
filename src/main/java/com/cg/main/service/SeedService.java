package com.cg.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.main.model.Seed;
import com.cg.main.repository.SeedRepository;



/**
 * 
 * @author manasa
 *
 * service class coded for add, update, delete and view the seed data by implementing 
 * and repository class data will be autowired. 
 * 
 **/
@Service
@Transactional
public class SeedService implements ISeedService{

	@Autowired
	SeedRepository repository;
	
	@Override
	public Seed getSeed(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<Seed> getAllSeeds() {
		return repository.findAll();
	}

	@Override
	public Seed addSeed(Seed seed) {
		return repository.save(seed);
	}

	@Override
	public List<Seed> getSeedName(String commanName) {
		return repository.findAllByCommonName(commanName);
	}

	@Override
	public Seed updateSeed(Seed seed) {
		return repository.save(seed);
	}

	@Override
	public List<Seed> deleteSeed(Integer id) {
		List<Seed> list = new ArrayList<>();
		Seed s = repository.findById(id).orElse(null);
		if (s == null) {
			return list;

		} else {
			repository.deleteById(id);
			return repository.findAll();
		}
	}
}
