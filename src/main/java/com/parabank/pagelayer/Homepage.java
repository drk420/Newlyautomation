package com.parabank.pagelayer;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.Testbase.TestBase;

public class Homepage extends TestBase {
	
	
	public Homepage (WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	private WebElement register_link;
	
	@FindBy(xpath="//body/div[@id='mainPanel']/div[@id='headerPanel']/ul[1]/li[4]/a[1]")
    private WebElement products_button;
	
	public void clickonregisterlink() {
    	register_link.click();
    }
    
    
    public void clickonproductsbutton() {
    	products_button.click();
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
