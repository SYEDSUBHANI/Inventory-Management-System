package com.capgemini.inventory.service;

import java.time.LocalDate;

import com.capgemini.inventory.exception.ProductStockException;
import com.capgemini.inventory.exception.ValidateException;

public interface InventoryService {
	public boolean changeProduct(LocalDate manufactureDate, 
			String productId)throws ValidateException, ProductStockException;

	public boolean validateproductId(String productId)throws ValidateException;

}
