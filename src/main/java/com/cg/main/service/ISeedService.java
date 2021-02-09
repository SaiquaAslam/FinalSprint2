package com.cg.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.main.model.Seed;



/**
 * interface service coded for add, update, delete and view the seed data
 * */
@Service
public interface ISeedService {
	
	Seed addSeed(Seed seed);
	
	Seed updateSeed(Seed seed);

	Seed getSeed(Integer id);
	
	List<Seed> getAllSeeds();
		
	List<Seed> getSeedName(String commanName);
		
	List<Seed> deleteSeed(Integer id);
}
