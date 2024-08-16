package com.parabank.Testlayer;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.parabank.Testbase.TestBase;
import com.parabank.pagelayer.Homepage;
import com.parabank.pagelayer.Registerpage;

public class RegisterTest extends TestBase {
    
	@Test
	public void withvalidateregisterfunctionalitywithvalidcredentials() throws InterruptedException {
		String Expected_Result="Your account was created successfully. You are now logged in.";
		
		Homepage homepage_obj=new Homepage(driver);
		homepage_obj.clickonregisterlink();
		
		Registerpage registerpage_obj = new Registerpage(driver);
		registerpage_obj.enterfistname("dnyaneshwarr");
		registerpage_obj.enterlastname("kinikarr");
		registerpage_obj.enteraddress("KiniYalladevii");
		registerpage_obj.entercity("Udgirr");
		registerpage_obj.enterstate("MahaRashtraa");
		registerpage_obj.enterzipcode("413518");
		registerpage_obj.enterphone("8788182074");
		registerpage_obj.enterssn("yess");
		registerpage_obj.enterusername("dnyanuppu");
		registerpage_obj.enterpassword("Mahadevji@123456");
		registerpage_obj.enterconfirm("Mahadevji@123456");
		registerpage_obj.cliconregisterbutton();
		Thread.sleep(5000);
		String Actual_Result = registerpage_obj.successmsg();
		Assert.assertEquals(Actual_Result,Expected_Result);
		
	}
	
	@Test
	public void withinvalidateregisterfunctionalitywithvalidcredentials() {
		String Expected_Result="An internal error has occurred and has been logged.";
		
		Homepage homepage_obj=new Homepage(driver);
		homepage_obj.clickonregisterlink();
		
		Registerpage registerpage_obj = new Registerpage(driver);
		registerpage_obj.enterfistname("dnyaneshwar");
		registerpage_obj.enterlastname("kinikar");
		registerpage_obj.enteraddress("KiniYalladevi");
		registerpage_obj.entercity("Udgir");
		registerpage_obj.enterstate("MahaRashtra");
		registerpage_obj.enterzipcode("413518");
		registerpage_obj.enterphone("8788172074");
		registerpage_obj.enterssn("yes");
		registerpage_obj.enterusername("dnyanu");
		registerpage_obj.enterpassword("Mahadevji@123");
		registerpage_obj.enterconfirm("Mahadevji");
		registerpage_obj.cliconregisterbutton();
		String Actual_Result = registerpage_obj.errormsg();
		Assert.assertEquals(Actual_Result,Expected_Result);
		
	}
	
	
}
