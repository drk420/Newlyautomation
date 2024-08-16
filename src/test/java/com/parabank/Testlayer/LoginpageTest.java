package com.parabank.Testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.parabank.Testbase.TestBase;
import com.parabank.pagelayer.Loginpage;
import com.parabank.pagelayer.Windowspage;

public class LoginpageTest extends TestBase {

	
	@Test
	public void validateloginfunctionality() {
		
		String Expected_Result="Registration Form";
		
		Windowspage windowspage_obj = new Windowspage(driver);
		
		windowspage_obj.clickonloginlink();
		
		
		
		Loginpage loginpage_obj= new Loginpage(driver);
		
		loginpage_obj.enterusernametextbox("admin");
		
		loginpage_obj.enterpassword("admin");
		
		loginpage_obj.clickonloginbutton();
		
		loginpage_obj.clickongotohomepage();
		
		String Actual_Result= loginpage_obj.geturl();
		
		Assert.assertEquals(Expected_Result,Actual_Result);
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
}
