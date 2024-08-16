package com.parabank.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.Testbase.TestBase;

public class Registerpage extends TestBase{

	
	public Registerpage (WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='customer.firstName']")
	private  WebElement firstname_textbox;
	
	@FindBy(xpath="//input[@id='customer.lastName']")
	private WebElement lastname_textbox;
	
    @FindBy(xpath="//input[@id='customer.address.street']")
    private WebElement address_textbox;
    
    @FindBy(xpath="//input[@id='customer.address.city']")
    private WebElement city_textbox;
    
    @FindBy(xpath="//input[@id='customer.address.state']")
    private WebElement state_textbox;
    
    @FindBy(xpath="//input[@id='customer.address.zipCode']")
    private WebElement zipcode_textbox;
    
    @FindBy(xpath="//input[@id='customer.phoneNumber']")
    private WebElement phone_textbox;
    
    @FindBy(xpath="//input[@id='customer.ssn']")
    private WebElement ssn_textbox;
    
    @FindBy(xpath="//input[@id='customer.username']")
    private WebElement username_textbox;
    
    @FindBy(xpath="//input[@id='customer.password']")
    private WebElement password_textbox;
    
    @FindBy(xpath="//input[@id='repeatedPassword']")
    private WebElement confirm_textbox;
    
    @FindBy(xpath="//tbody/tr[13]/td[2]/input[1]")
    private WebElement register_button;
    
    @FindBy(xpath="//p[contains(text(),'Your account was created successfully. You are now')]")
    private WebElement getsuccess_msg;
    
    @FindBy(xpath="//p[text()=\"An internal error has occurred and has been logged.\"]")
    private WebElement geterror_msg;
    
    public void enterfistname(String firstname) {
    	
    	firstname_textbox.sendKeys(firstname);
    }
	
    public void enterlastname(String lastname) {
    	
    	lastname_textbox.sendKeys(lastname);
    }
	
    public void enteraddress(String address) {
    	
    	address_textbox.sendKeys(address);
    }
	
    public void entercity(String city) {
    	
    	city_textbox.sendKeys(city);
    }
	
	
 public void enterstate(String state) {
    	
	 state_textbox .sendKeys(state);
    }
	
 public void enterzipcode(String zipcode) {
 	
	 zipcode_textbox .sendKeys(zipcode);
    }
	
 public void enterphone(String phone) {
	 	
	 phone_textbox .sendKeys(phone);
    }
	
 public void enterssn(String ssn) {
	 	
	 ssn_textbox.sendKeys(ssn);
    }
	
 public void enterusername(String username) {
	 	
	 username_textbox.sendKeys(username);
    }
	
 public void enterpassword(String password) {
	 	
	 password_textbox.sendKeys(password);
    }
 
 public void enterconfirm(String confirm) {
	 	
	 confirm_textbox.sendKeys(confirm);
    }
 
 public void cliconregisterbutton() {
	 	
	 register_button.click();
    }
 
 public String successmsg() {
	 
	String Actual_Result = getsuccess_msg.getText();
	 return Actual_Result;
 }
 
 public String errormsg() {
 String Actual_Result  = geterror_msg.getText();
 return Actual_Result;
 }
}
