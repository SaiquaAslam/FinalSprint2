package com.cg.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "gardendecor_info")

public class GardenDecor {

	@Id
	@GeneratedValue

	private int productId;
	@NotEmpty(message = "Product name cant be empty")
	private String productName;
	@NotNull(message = "cost should not be null")
	private Double cost;
	@NotNull(message = "Stock should not be null")
	private int stock;
	@NotEmpty(message = "Description cant be empty")
	private String description;
	@NotEmpty(message = "Productmaterial cant be empty")
	private String productMaterial;

	// Constructors
	public GardenDecor() {
		/**
		 * Auto generated stub-constructor
		 */
	}

	/**
	 * contructor using fields
	 * 
	 * @param productId
	 * @param productName
	 * @param cost
	 * @param stock
	 * @param description
	 * @param productMaterial
	 */

	public GardenDecor(int productId, String productName, Double cost, int stock, String description,
			String productMaterial) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.cost = cost;
		this.stock = stock;
		this.description = description;
		this.productMaterial = productMaterial;
	}

	public GardenDecor(String productName, Double cost, int stock, String description, String productMaterial) {
		super();
		this.productName = productName;
		this.cost = cost;
		this.stock = stock;
		this.description = description;
		this.productMaterial = productMaterial;

	}

	// setters and getters
	public int getProductId() {
		return productId;
	}

	/**
	 * 
	 * @param productId
	 */

	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * 
	 * @return getProductName
	 */

	public String getProductName() {
		return productName;
	}

	/**
	 * 
	 * @param productName
	 */

	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * 
	 * @return getCost
	 */

	public Double getCost() {
		return cost;
	}

	/**
	 * 
	 * @param cost
	 */

	public void setCost(Double cost) {
		this.cost = cost;
	}

	/**
	 * 
	 * @return getStock
	 */

	public int getStock() {
		return stock;
	}

	/**
	 * 
	 * @param stock
	 */

	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * 
	 * @return getDescription
	 */

	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description
	 */

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 
	 * @return getProductmaterial
	 */

	public String getProductMaterial() {
		return productMaterial;
	}

	/**
	 * 
	 * @param productMaterial
	 */

	public void setProductMaterial(String productMaterial) {
		this.productMaterial = productMaterial;
	}

	// to String Function
	@Override
	public String toString() {
		return "GardenDecor [productName=" + productName + ", cost=" + cost + ", productId=" + productId + ", stock="
				+ stock + ", description=" + description + ", productMaterial=" + productMaterial + "]";
	}

}
