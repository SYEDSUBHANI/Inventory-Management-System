package com.capgemini.inventory.entity;

import java.time.LocalDate;

public class ProductStock {
	private String productId;
	private String name;
	private double pricePerUnit;
	private String quantityUnit;
	private double Price;
	private String wareHouseId;
	private LocalDate manufactureDate;
	private LocalDate expireDate;
	private String quantityCheck;
	private String processDate;



	public ProductStock(String productId, String name, double pricePerUnit, String quantityUnit, double price,
			String wareHouseId,  String quantityCheck,LocalDate manufactureDate,LocalDate expireDate ) {
		super();
	  	this.productId = productId;
		this.name = name;
		this.pricePerUnit = pricePerUnit;
		this.quantityUnit = quantityUnit;
		this.Price = price;
		this.wareHouseId = wareHouseId;
		this.quantityCheck = quantityCheck;
		this.manufactureDate = manufactureDate;
		this.expireDate = expireDate;
		
	}


	

	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public String getQuantityUnit() {
		return quantityUnit;
	}
	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		this.Price = price;
	}
	public String getWareHouseId() {
		return wareHouseId;
	}
	public void setWareHouseId(String wareHouseId) {
		this.wareHouseId = wareHouseId;

	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}


	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}


	public LocalDate getExpireDate() {
		return expireDate;
	}


	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}


	

	public String getQuantityCheck() {
		return quantityCheck;
	}
	public void setQuantityCheck(String quantityCheck) {
		this.quantityCheck = quantityCheck;
	}
	public String getProcessDate() {
		return processDate;
	}


	public void setProcessDate(String processDate) {
		this.processDate = processDate;
	}




	@Override
	public String toString() {
		return "UpdateStock [ProductId=" + productId + ", name=" + name + ", pricePerUnit=" + pricePerUnit
				+ ", quantityUnit=" + quantityUnit + ", Price=" + Price + ", wareHouseId=" + wareHouseId
				 + ", manufactureDate=" + manufactureDate + ", expireDate="
				+ expireDate + ", quantityCheck=" + quantityCheck + ", processDate=" + processDate + "]";
	}

}
