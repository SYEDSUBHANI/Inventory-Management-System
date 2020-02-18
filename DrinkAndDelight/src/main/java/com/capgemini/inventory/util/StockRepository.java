package com.capgemini.inventory.util;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.inventory.entity.ProductStock;

public class StockRepository 
{
	
	public static HashMap<String,ProductStock> pmap=new HashMap<String, ProductStock>();
	
		public StockRepository() 
		{
		
			
			pmap.put("1001",new ProductStock("1001","Iron Sheets",1500.0,"20",30000.0,"jalandhhar01","good",LocalDate.of(2020, 02, 20), LocalDate.of(2020, 04, 20)));
			pmap.put("1002",new ProductStock("1002","Generators",7000.0,"10",70000.0,"jalandhar01","good",LocalDate.of(2020, 05, 12), LocalDate.of(2020, 07, 12)));
			pmap.put("1003",new ProductStock("1003","PVC Pipes",1000.0,"50",50000.0,"jalandhar01","good", LocalDate.of(2020, 07, 15), LocalDate.of(2020, 10, 15)));
			pmap.put("1004",new ProductStock("1004","Washing Machine",200.0,"5",1000.0,"jalandhar01","good",LocalDate.of(2020, 01, 04),LocalDate.of(2020, 03, 04)));
			pmap.put("1005",new ProductStock("1005","Water Tanks",300.0,"10",3000.0,"jalandhar01","good", LocalDate.of(2020, 03, 25), LocalDate.of(2020, 05, 25)));
			
		}
	public Map<String ,ProductStock> getStockRepository()
	{
		return pmap; 
	}
		
}
