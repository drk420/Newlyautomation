package com.parabank.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.Testbase.TestBase;
import com.parabank.Utility.DropDownHandling;

public class Registrationpage extends TestBase{

	
	public Registrationpage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement name_textbox;
	
	@FindBy(xpath="//input[@id='address']")
	private WebElement address_textbox;
	
	@FindBy(xpath="//input[@id='male']")
	private WebElement male_radiobutton;
	
	@FindBy(xpath="//input[@id='music']")
	private WebElement music_checkbox;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	private WebElement submit_button;
	
	@FindBy(xpath="//input[@id='dob']")
	private WebElement dateofbirth_textbox;
	
	@FindBy(xpath=("//select[@id='country']"))
	private WebElement contry_dropdown;
	
	@FindBy(xpath="//select[@id='city']")
	private WebElement city_dropdown;
	
	@FindBy(xpath="//p[text()=\"User registration successful.\"][1]")
	private WebElement get_text;
	
	public void enternametextbox (String name) {
		name_textbox.sendKeys(name);
		
	}
	
	public void clickonaddress (String address) {
		address_textbox.sendKeys(address);
		
	}
	
public void clickonradiobutton () {
		
	male_radiobutton.click();
	}
	
public void clickoncheckbox() {
	
	music_checkbox.click();
}
public void clickonsubmitbutton() {
	submit_button.click();
	
}
public void enterdateofbirth(String dateofbirth) {
	dateofbirth_textbox.sendKeys(dateofbirth);
	
}
public void handlingcountrydropdown() {
	
	DropDownHandling h = new DropDownHandling ();
	h.dropdownhandling(contry_dropdown,"India");
}

public void handlingcitydropdown() {
	DropDownHandling h = new DropDownHandling ();
	h.dropdownhandling(city_dropdown,"Mumbai");
	
	
}


public String gettext() {
	
	String text = get_text.getText();
	return text;
}











}
