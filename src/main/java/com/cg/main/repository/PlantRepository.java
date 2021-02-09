package com.cg.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.main.model.Plant;



/**
 * @author Saiqua Aslam
 *
 */

public interface PlantRepository extends JpaRepository<Plant, Integer> {
	public List<Plant> findAllByName(String name);// customise method to view all plants in database using name

	public List<Plant> findAllByType(String type);// customise method to view all plants in database using type
}
