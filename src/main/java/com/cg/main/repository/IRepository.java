/**
 * 
 */
package com.cg.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.main.model.Order;


/**
 * @author Apala Das
 *
 */
@Repository
public interface IRepository extends JpaRepository<Order, Integer>{
}
