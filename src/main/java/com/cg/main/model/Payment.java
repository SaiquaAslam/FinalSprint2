/**
 * 
 */
package com.cg.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

/**
 * @author Dishani Basak
 *Payment class where all the required variables , constructors, 
 *getters and setters and toString function are declared
 */
@Entity
@Table(name="payment_table")
public class Payment{
	/**
	 * variable declaration
	 */	 
	@Id
	@GeneratedValue
	private int id;
	private String status="Successful";
	@Column(name ="card_no")
	@Size(min=16, max=16, message = "card no must be of 16 digits")
	private String cardNo;
	//@Size(min=3, max=3, message = "cvv must be of 3 digits")
	private int cvv;
	@Column(name = "upi_id")
	private String upiId;
	private String password;
	
	/**
	 * default constructor
	 */
	public Payment() {
		super();
	}
	
	/**
	 * one argument constructor
	 * @param result
	 */
	public Payment(String result) {
		super();
		this.status = status;
	}
	
	/**
	 * parameterized constructor
	 * @param cardNo
	 * @param cvv
	 */
	public Payment(String cardNo, int cvv) {
		super();
		this.cardNo = cardNo;
		this.cvv = cvv;
	}
	
	/**
	 * parameterized constructor
	 * @param upiId
	 * @param password
	 */
	public Payment(String upiId, String password) {
		super();
		this.upiId = upiId;
		this.password = password;
	}
	
	//Getters and Setters declaration
	
	/**
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 
	 * @return result
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * 
	 * @param result
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getUpiId() {
		return upiId;
	}
	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * toString() to display output
	 */
	@Override
	public String toString() {
		return "Payment [id=" + id + ", result=" + status + "]";
	}
	
}
