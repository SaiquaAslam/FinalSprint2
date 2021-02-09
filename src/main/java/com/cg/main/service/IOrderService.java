/**
 * 
 */
package com.cg.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.main.model.Order;


/**
 * @author Apala Das
 *
 */
public interface IOrderService {
	
	 Order addOrder(Order order);
	 Order updateOrder(Order order);
	 List<Order> deleteOrder(int orderId);
	 Order viewOrder(int orderId);
	 List<Order> viewAllOrders();

}
