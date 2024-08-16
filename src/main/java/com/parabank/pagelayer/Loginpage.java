package com.parabank.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.Testbase.TestBase;

public class Loginpage extends TestBase{

	
	public Loginpage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement username_textbox;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password_textbox;
	
	@FindBy(xpath="//button[@id='login-button']")
	private WebElement login_button;
	
	@FindBy(xpath="//h1[contains(text(),'Registration Form')]")
	private WebElement get_url;
	
	@FindBy(xpath="//button[@id='home-button']")
	private WebElement gotohomepage_button;
	
	public void enterusernametextbox(String username) {
		username_textbox.sendKeys(username);
		
	}
	
	public void enterpassword(String password) {
	
	password_textbox.sendKeys(password);
	
	
}
	
	public void clickonloginbutton() {
		login_button.click();
		
	}
	
	public String geturl( ) {
	String text=	get_url.getText();
		return text;
	}
	
	public void clickongotohomepage() {
		gotohomepage_button.click();
		
	}
	
	
	
	
	
	
	
	
	
	
}
