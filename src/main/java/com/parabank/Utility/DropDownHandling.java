package com.parabank.Utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.parabank.Testbase.TestBase;

public class DropDownHandling extends TestBase {

	
	public void dropdownhandling(WebElement element,String option) {
		
		
		Select b = new Select(element);
		b.selectByVisibleText(option);
	
		List<WebElement>options = b.getOptions();
	    int count = options.size();
		System.out.println(count);
		
		
		for(int i=0;i<count;i++) {
			
			String Text = options.get(i).getText();
			System.out.println(Text);
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
