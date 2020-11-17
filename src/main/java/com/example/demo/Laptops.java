package com.example.demo;

import java.util.UUID;

import javax.persistence.Entity;

@Entity
public class Laptops {
	
	private String brand;
	private UUID serialNumber;
	
	public Laptops() {}
	
	
	public Laptops(String brand, UUID serialNumber) {
		super();
		this.brand = brand;
		this.serialNumber = serialNumber;
	}

	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public UUID getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(UUID serialNumber) {
		this.serialNumber = serialNumber;
	}
	

}
