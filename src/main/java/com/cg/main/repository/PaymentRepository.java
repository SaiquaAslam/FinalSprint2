package com.cg.main.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.main.model.Payment;



/**
 * 
 * @author dishani
 * PaymentRepository extends JpaRepository
 * customized method functions are declared here
 */
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer>{
    @Query(nativeQuery =true, value = "select status, id from payment_table p")
	List<Object[]> findAllStatus();
    @Query(nativeQuery =true, value = "select status from payment_table p where p.id=:id")
	Object findStatusById(@Param("id") int id);
}
