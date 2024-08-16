package com.parabank.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.Testbase.TestBase;
import com.parabank.Utility.DropDownHandling;

public class Productspage extends TestBase {

	
	public Productspage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/nav[2]/ul[1]/li[1]/div[1]/select[1]")
	private WebElement select_dropdown;
	
	@FindBy(xpath="")
	private WebElement title_text;
	
	public void clickonenglishdropdown() {
		DropDownHandling k = new DropDownHandling();
		k.dropdownhandling(select_dropdown);
	}
	
	public String getpageurl() {
		
	String url = driver.getCurrentUrl();
	return url;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
