package com.parabank.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.Testbase.TestBase;

public class Windowspage extends TestBase{

	
	
	public Windowspage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	private WebElement login_link;
	
	
	
	
	public void clickonloginlink() {
		
		login_link.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
