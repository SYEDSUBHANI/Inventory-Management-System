package com.capgemini.inventory.dao;

import com.capgemini.inventory.entity.ProductStock;
import com.capgemini.inventory.exception.ProductStockException;

public interface InventoryDao 
{
	public ProductStock getProduct(String pid)throws ProductStockException;
	public boolean UpdateProductStock(ProductStock String);
	
}
