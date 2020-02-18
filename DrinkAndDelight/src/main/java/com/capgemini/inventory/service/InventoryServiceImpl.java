package com.capgemini.inventory.service;

import java.time.LocalDate;

import com.capgemini.inventory.dao.InventoryDao;
import com.capgemini.inventory.dao.InventoryDaoImpl;
import com.capgemini.inventory.entity.ProductStock;
import com.capgemini.inventory.exception.ProductStockException;
import com.capgemini.inventory.exception.ValidateException;

public class InventoryServiceImpl implements InventoryService {
private InventoryDao dao = new InventoryDaoImpl(); 
	@Override
	public boolean changeProduct(LocalDate manufactureDate,
			String productId) throws ValidateException, ProductStockException {
		
		ProductStock pdstock = dao.getProduct(productId); 
		pdstock.setManufactureDate(manufactureDate);
		pdstock.setExpireDate(manufactureDate.plusMonths(2));
		dao.UpdateProductStock(pdstock);
		return true;
	}
	public boolean validateproductId(String productId)throws ValidateException {
		if(!productId.matches("[1-9]{4}"))
			throw new ValidateException("Invalid Product ID");
		return true;
	}

}
