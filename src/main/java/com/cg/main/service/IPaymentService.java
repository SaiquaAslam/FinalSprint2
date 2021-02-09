package com.cg.main.service;

import java.util.List;


import javax.validation.Valid;

import com.cg.main.model.Payment;



/**
 * 
 * @author dishani
 * IPaymentService interface has addUPIPayment, addCardPayment, 
 * getAllPaymentStatus and getPaymentStatusById service declaration
 */
public interface IPaymentService{
	/**
	 * 
	 * @param payment
	 * @return
	 */
	Payment addUPIPayment(@Valid Payment payment);
	/**
	 * 
	 * @param payment
	 * @return
	 */
	Payment addCardPayment(@Valid Payment payment);
	/**
	 * 
	 * @return
	 */
	List<Object[]> getAllPaymentStatus();
	/**
	 * 
	 * @param id
	 * @return
	 */
	Object getPaymentStatusById(int id);

}
