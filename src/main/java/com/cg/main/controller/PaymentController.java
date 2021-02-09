package com.cg.main.controller;

import java.util.List;
import javax.validation.Valid;

import org.aspectj.weaver.ast.Call;
import org.hibernate.mapping.Set;
import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cg.main.exception.PaymentNotFoundException;
import com.cg.main.model.Payment;
import com.cg.main.service.IPaymentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "controller", description = "Handler Methods Related To Payment Module!!!")
@RestController
@RequestMapping("/api")
public class PaymentController {
	@Autowired
	IPaymentService service;

	@ApiOperation(value = "click here to proceed with UPI payment")
	@PostMapping("/add_UPI_Payment")
	public Payment addUPIPayment(@Valid @RequestBody Payment payment) {
		Payment paymentInfo = service.addUPIPayment(payment);
		return paymentInfo;
	}
	@ApiOperation(value = "click here to proceed with CARD payment")
	@PostMapping("/add_Card_Payment")
	public Payment addCardPayment(@Valid @RequestBody Payment payment) {
		Payment paymentInfo = service.addCardPayment(payment);
		return paymentInfo;
	}
	@ApiOperation(value = "click here to get Payment status with specific ID")
	@GetMapping("/getPaymentStatus/{id}")
	public ResponseEntity<Object> getPaymentStatus(@PathVariable("id") int id) {
		Object payment = service.getPaymentStatusById(id);
		if (payment == null) {
			throw new PaymentNotFoundException("No payment done with the given id: " + id);
		}
		return new ResponseEntity<Object>(payment, HttpStatus.OK);
	}
	@ApiOperation(value = "click here to get all Payment status")
	@GetMapping("/getAllPaymentStatus")
	public ResponseEntity<List<Object[]>> getAllPaymentStatus() throws Exception {
		List<Object[]> paymentInfo = service.getAllPaymentStatus();
		return new ResponseEntity<List<Object[]>>(paymentInfo, HttpStatus.OK);
	}
}