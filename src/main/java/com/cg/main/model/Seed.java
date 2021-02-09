package com.cg.main.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 
 * @author manasa
 * Seed class is the POJO class where all the variables are declared with validations 
 * constructors, getters and setters and toString() declarations are also done below
 */
@Entity
@Table(name="seed_details")
public class Seed implements Serializable {
	/**
	 * variable declaration with validations
	 */
	@Id
	@GeneratedValue
	@Column(name="seed_id")
	private int seedId;
	@NotEmpty(message = "Comman Name can't be empty")
	@Size(min = 4, message = "min 3 chars required")
	@Column(name = "comman_name")
	private String commonName;
	@NotEmpty(message = "Bloom time data can't be empty")
	@Column(name = "bloom_time")
	private String bloomTime;
	@NotEmpty(message = "Watering data can't be empty")
	@Column(name = "watering")
	private String watering;
	@NotEmpty(message = "Difficulty level can't be empty")
	@Column(name = "diff_level")
	private String difficultyLevel;
	@NotEmpty(message = "Temparature data can't be empty")
	@Column(name = "temperature")
	private String temperature;
	@NotEmpty(message = "Seed type data can't be empty")
	@Column(name = "seed_type")
	private String typeOfSeeds;
	@NotEmpty(message = "Seed description can't be empty")
	@Column(name = "seed_desc")
	private String seedDescription;
	@NotNull(message = "seed stock data can't be null")
	@Column(name = "seed_stock")
	private int seedStock;
	@NotNull(message = "seed cost can't be null")
	@Column(name = "seed_cost")
	private double seedCost;
	@NotNull(message = "seeds per packet can't be null")
	@Column(name = "seed_perpacket")
	private int seedsPerPacket;
	
	/**
	 * default constructor
	 */
	public Seed() {
		super();
	}

	/**
	 * parameterized constructor
	 * @param commonName
	 * @param bloomTime
	 * @param watering
	 * @param difficultyLevel
	 * @param temperature
	 * @param typeOfSeeds
	 * @param seedDescription
	 * @param seedStock
	 * @param seedCost
	 * @param seedsPerPacket
	 */
	public Seed(String commonName, String bloomTime, String watering, String difficultyLevel, String temperature,
			String typeOfSeeds, String seedDescription, int seedStock, double seedCost, int seedsPerPacket) {
		super();
		this.commonName = commonName;
		this.bloomTime = bloomTime;
		this.watering = watering;
		this.difficultyLevel = difficultyLevel;
		this.temperature = temperature;
		this.typeOfSeeds = typeOfSeeds;
		this.seedDescription = seedDescription;
		this.seedStock = seedStock;
		this.seedCost = seedCost;
		this.seedsPerPacket = seedsPerPacket;
	}

	/**
	 * parameterized constructor
	 * @param seedId
	 * @param commonName
	 * @param bloomTime
	 * @param watering
	 * @param difficultyLevel
	 * @param temperature
	 * @param typeOfSeeds
	 * @param seedDescription
	 * @param seedStock
	 * @param seedCost
	 * @param seedsPerPacket
	 */
	public Seed(int seedId, String commonName, String bloomTime, String watering, String difficultyLevel,
			String temperature, String typeOfSeeds, String seedDescription, int seedStock, double seedCost,
			int seedsPerPacket) {
		super();
		this.seedId = seedId;
		this.commonName = commonName;
		this.bloomTime = bloomTime;
		this.watering = watering;
		this.difficultyLevel = difficultyLevel;
		this.temperature = temperature;
		this.typeOfSeeds = typeOfSeeds;
		this.seedDescription = seedDescription;
		this.seedStock = seedStock;
		this.seedCost = seedCost;
		this.seedsPerPacket = seedsPerPacket;
	}

	/**
	 * getter and setter for seed id
	 * @return
	 */
	public int getSeedId() {
		return seedId;
	}


	public void setSeedId(int seedId) {
		this.seedId = seedId;
	}

	/**
	 * getters and setter for common name data
	 * @return
	 */
	public String getCommonName() {
		return commonName;
	}


	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	/**
	 * getter and setter for bloom time 
	 * @return
	 */
	public String getBloomTime() {
		return bloomTime;
	}


	public void setBloomTime(String bloomTime) {
		this.bloomTime = bloomTime;
	}

	/**
	 * getter and setter watering data
	 * @return
	 */
	public String getWatering() {
		return watering;
	}

	public void setWatering(String watering) {
		this.watering = watering;
	}

	/**
	 * getters and setter difficulty level data
	 * @return
	 */
	public String getDifficultyLevel() {
		return difficultyLevel;
	}

	public void setDifficultyLevel(String difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}

	/**
	 * getters and setter for temperature data
	 * @return
	 */
	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	/**
	 * getters and setters for seed type data
	 * @return
	 */
	public String getTypeOfSeeds() {
		return typeOfSeeds;
	}


	public void setTypeOfSeeds(String typeOfSeeds) {
		this.typeOfSeeds = typeOfSeeds;
	}

	/**
	 * getters and setters for seed description
	 * @return
	 */
	public String getSeedDescription() {
		return seedDescription;
	}


	public void setSeedDescription(String seedDescription) {
		this.seedDescription = seedDescription;
	}

	/**
	 * getters and setters for seed stock
	 * @return
	 */
	public int getSeedStock() {
		return seedStock;
	}


	public void setSeedStock(int seedStock) {
		this.seedStock = seedStock;
	}

	/**
	 * getters and setters for seed cost data
	 * @return
	 */
	public double getSeedCost() {
		return seedCost;
	}


	public void setSeedCost(double seedCost) {
		this.seedCost = seedCost;
	}

	/**
	 * getters and setters for seed per packet data
	 * @return
	 */
	public int getSeedsPerPacket() {
		return seedsPerPacket;
	}


	public void setSeedsPerPacket(int seedsPerPacket) {
		this.seedsPerPacket = seedsPerPacket;
	}

	/**
	 * toString() declaration
	 */
	@Override
	public String toString() {
		return "Seeds [seedId=" + seedId + ", commonName=" + commonName + ", bloomTime=" + bloomTime + ", watering="
				+ watering + ", difficultyLevel=" + difficultyLevel + ", temperature=" + temperature + ", typeOfSeeds="
				+ typeOfSeeds + ", seedDescription=" + seedDescription + ", seedStock=" + seedStock + ", seedCost="
				+ seedCost + ", seedsPerPacket=" + seedsPerPacket + "]";
	}
	
	
}
