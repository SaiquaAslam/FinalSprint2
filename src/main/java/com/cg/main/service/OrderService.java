/**
 * 
 */
package com.cg.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.main.model.Order;
import com.cg.main.repository.IRepository;



//import org.jvnet.hk2.annotations.Service;

/**
 * @author Apala Das
 *
 */
@Service
@Transactional
public class OrderService implements IOrderService {
	@Autowired
	IRepository repository;

	/**
	 * @param order
	 * @return Order To add an Order
	 */
	@Override
	public Order addOrder(Order order) {
		return repository.save(order);
	}

	/**
	 * @param Order 
	 * @return Order 
	 * To update Order cost
	 */
	@Override
	public Order updateOrder(Order order) {
		return repository.save(order);

	}

	/**
	 * 
	 * @param orderId
	 * @return List<Order>
	 *  To delete an Order
	 */
	@Override
	public List<Order> deleteOrder(int orderId) {
		repository.deleteById(orderId);
		return repository.findAll();
	}

	/**
	 * 
	 * @param orderId
	 * @return Order
	 *  To view an order
	 */
	@Override
	public Order viewOrder(int orderId) {
		return repository.findById(orderId).get();
	}

	/**
	 * 
	 * @return List<Order>
	 *  To view All Orders
	 */
	@Override
	public List<Order> viewAllOrders() {
		return repository.findAll();
	}

}
