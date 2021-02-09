/**
 * 
 */
package com.cg.main.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.main.model.Order;
import com.cg.main.service.IOrderService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;



/**
 * @author Apala Das
 *
 */
@Api(value = "controller", description="Handler Methods Related To Apala Module !!!!")
@RestController
@RequestMapping("/nursery")
public class OrderController {
	@Autowired
	IOrderService service;
	@ApiOperation(value="Click here to order products!!!")
	@PostMapping("/addOrder")
	public Order addOrder(@Valid @RequestBody Order order) {
		Order o=service.addOrder(order);
		return o;
	}
	@ApiOperation(value="Click here to update orders!!!")
	@PutMapping("/updateOrder")
	public ResponseEntity<Order> updatePlanter(@RequestBody Order order ){
		Order o=service.updateOrder(order);
		return new ResponseEntity<Order>(o,HttpStatus.OK);
	}
	@ApiOperation(value="Click here to delete orders!!!")
	@DeleteMapping("/deleteOrder/{id}")
	public ResponseEntity<List<Order>> deleteOrder(@PathVariable("id") int id){
		List<Order> list=service.deleteOrder(id);
		return new ResponseEntity<List<Order>>(list,HttpStatus.OK );
	}
	@ApiOperation(value="Click here to view order details using id!!!")
	@GetMapping("/viewOrder/{orderId}")
	public ResponseEntity<Order> viewOrder(@PathVariable("orderId") int orderId){
		Order o=service.viewOrder(orderId);
		return new  ResponseEntity<Order>(o,HttpStatus.OK);
	}
	@ApiOperation(value="Click here to view all order details present in database !!!")
	@GetMapping("/viewAllOrders")
	public ResponseEntity<List<Order>> viewAllOrders(){
		List<Order> list = service.viewAllOrders();
		return new  ResponseEntity<List<Order>> (list,HttpStatus.OK);
	}
	
}
