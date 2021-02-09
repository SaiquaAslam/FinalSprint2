package com.cg.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.main.model.LoginDetails;



/**
 * @author Saiqua Aslam
 *
 */

public interface Repository extends JpaRepository<LoginDetails, Integer>{

}
