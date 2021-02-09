package com.cg.main.service;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.main.model.Payment;
import com.cg.main.repository.PaymentRepository;


/**
 * 
 * @author dishani
 * PaymentService implements IPaymentService has addUPIPayment, addCardPayment, 
 * getAllPaymentStatus and getPaymentStatusById service methods
 *
 */
@Service
@Transactional
public class PaymentService implements IPaymentService{
    @Autowired
    PaymentRepository repository;

	@Override
	public Payment addUPIPayment(@Valid Payment payment) {
		return repository.save(payment);
	}
	@Override
	public Payment addCardPayment(@Valid Payment payment) {
		return repository.save(payment);
	}

	@Override
	public Object getPaymentStatusById(int id) {
		return repository.findStatusById(id);
	}
	@Override
	public List<Object[]> getAllPaymentStatus() {
		return repository.findAllStatus();
	}
}
