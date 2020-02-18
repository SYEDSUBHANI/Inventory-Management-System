package com.capgemini.lpu.DrinkAndDelight;

import static org.junit.jupiter.api.Assertions.assertThrows;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.capgemini.inventory.exception.ProductStockException;
import com.capgemini.inventory.exception.ValidateException;
import com.capgemini.inventory.service.InventoryService;
import com.capgemini.inventory.service.InventoryServiceImpl;


public class TestCases {
	
	private static InventoryService ser;
	
	@BeforeAll
	private static void beforeClass() {
		
		ser= new InventoryServiceImpl();
	}
	
	@Test
	@DisplayName("Test validation for productId")
	public void testCase1() throws ProductStockException, ValidateException{
		InventoryService ser = new InventoryServiceImpl();
		assertThrows(ValidateException.class, ()->ser.validateproductId("1005"));
	}
	
	@Test
	@DisplayName("Test validation for manufacture date")
	public void testCase2() throws ProductStockException, ValidateException{
		InventoryService ser = new InventoryServiceImpl();
		assertThrows(ProductStockException.class, ()->ser.
				changeProduct(LocalDate.of(2020, 05, 28), "1003"));
	}
	@Test
	@DisplayName("Test validation for productId")
	public void testCase3() throws ProductStockException, ValidateException{
		InventoryService ser = new InventoryServiceImpl();
		assertThrows(ValidateException.class, ()->ser.validateproductId("1002"));
	}
}
