package com.parabank.Testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.parabank.Testbase.TestBase;
import com.parabank.pagelayer.Loginpage;
import com.parabank.pagelayer.Registrationpage;
import com.parabank.pagelayer.Windowspage;

public class RegistrationTest extends TestBase{

	@Test
	public void validateregistration() throws InterruptedException {
		
		String Expected_Result ="User registration successful.";
		
		
		
		Windowspage windowspage_obj = new Windowspage (driver);
		
		windowspage_obj.clickonloginlink();
		
		Loginpage loginpage_obj = new Loginpage (driver);
		
		loginpage_obj.enterusernametextbox("admin");
		
		loginpage_obj.enterpassword("admin");
		
		loginpage_obj.clickonloginbutton();
		
		loginpage_obj.clickongotohomepage();
		
		Registrationpage registrationpage_obj = new Registrationpage (driver);
		
		registrationpage_obj.enternametextbox("Dnyaneshwar");
		
		registrationpage_obj.clickonaddress("KiniYalladevi");
		
		registrationpage_obj.clickonradiobutton();
		
		registrationpage_obj.clickoncheckbox();
		
		registrationpage_obj.handlingcountrydropdown();
		
		registrationpage_obj.handlingcitydropdown();
		
		registrationpage_obj.enterdateofbirth("24082024");
		
		Thread.sleep(5000);
		registrationpage_obj.clickonsubmitbutton();
		
		String Actual_Result=registrationpage_obj.gettext();
		
		System.out.println(Actual_Result);
		
		Thread.sleep(5000);
		
		Assert.assertEquals(Actual_Result,Expected_Result);
		
	}
	
}
