package com.cg.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.main.model.Seed;



/**
 * 
 * @author manasa
 *SeedRepository class extends JpaRepository
 *customized repository function named as findAllByCommonName is defined below
 */
@Repository
public interface SeedRepository  extends JpaRepository<Seed, Integer>{

	/**
	 * findAllByCommonName function is used by the service class to view seed data using common name
	 * @param commanName
	 * @return
	 */
	public List<Seed> findAllByCommonName(String commanName);
}
