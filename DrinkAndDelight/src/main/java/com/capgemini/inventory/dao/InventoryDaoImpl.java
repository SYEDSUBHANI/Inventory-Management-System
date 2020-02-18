package com.capgemini.inventory.dao;

import java.util.HashMap;

import com.capgemini.inventory.entity.ProductStock;
import com.capgemini.inventory.exception.ProductStockException;

public class InventoryDaoImpl implements InventoryDao{
	public static HashMap<String,ProductStock> pmap=new HashMap<String, ProductStock>();
	@Override
	public ProductStock getProduct(String pid) throws ProductStockException {
		if(!pmap.containsKey(pid))
			throw new ProductStockException("Product not found");
		return pmap.get(pid);
	}

	@Override
	public boolean UpdateProductStock(ProductStock stock) {
		pmap.put(stock.getProductId(), stock);
		return true;
	}
	

}
