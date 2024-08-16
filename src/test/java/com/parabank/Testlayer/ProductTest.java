package com.parabank.Testlayer;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.parabank.Testbase.TestBase;
import com.parabank.pagelayer.Homepage;
import com.parabank.pagelayer.Productspage;

public class ProductTest extends TestBase{

	@Test
	public void validateproducttest() {
		String Expected_Result   ="https://www.parasoft.com/products/";
				
		Homepage h = new Homepage (driver);
		h.clickonproductsbutton();
		Productspage n = new  Productspage (driver);
		n.clickonenglishdropdown();
		Productspage j = new Productspage(driver);
		String Actual_Result = j.getpageurl();
		Assert.assertEquals(Actual_Result,Expected_Result);
	}
	
	
	
	
	
}
