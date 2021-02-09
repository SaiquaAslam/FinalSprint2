/**
 * 
 */
package com.cg.main.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author Apala Das
 *
 */
@Entity
@Table(name ="order_table")
public class Order {
	@Id
	@GeneratedValue
	@Column(name="order_id")
	private Integer orderId;
	
	@Column(name="order_date")
	@NotEmpty(message="Date cannot be null...")
	private String orderDate;
	
	@Column(name="transaction_mode")
	@NotEmpty(message="Please enter a mode of transaction")
	private String transactionMode;
	
	@Column(name="quantity")
	@NotNull(message="Please enter the quantity of products")
	private Integer quantity;
	
	@Column(name="total_cost")
	@NotNull(message="Please enter the total cost")
	private Double totalCost;

	/**
	 * @param orderId
	 * @param orderDate
	 * @param transactionMode
	 * @param quantity
	 * @param totalCost
	 */
	public Order(Integer orderId, String orderDate, String transactionMode, Integer quantity, Double totalCost) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.transactionMode = transactionMode;
		this.quantity = quantity;
		this.totalCost = totalCost;
	}

	/**
	 * @param orderDate
	 * @param transactionMode
	 * @param quantity
	 * @param totalCost
	 */
	public Order(String orderDate, String transactionMode, Integer quantity, Double totalCost) {
		super();
		this.orderDate = orderDate;
		this.transactionMode = transactionMode;
		this.quantity = quantity;
		this.totalCost = totalCost;
	}

	/**
	 * 
	 */
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the orderId
	 */
	public Integer getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the orderDate
	 */
	public String getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return the transactionMode
	 */
	public String getTransactionMode() {
		return transactionMode;
	}

	/**
	 * @param transactionMode the transactionMode to set
	 */
	public void setTransactionMode(String transactionMode) {
		this.transactionMode = transactionMode;
	}

	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the totalCost
	 */
	public Double getTotalCost() {
		return totalCost;
	}

	/**
	 * @param totalCost the totalCost to set
	 */
	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

}
