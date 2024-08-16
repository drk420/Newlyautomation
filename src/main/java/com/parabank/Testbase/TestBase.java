package com.parabank.Testbase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
public static WebDriver driver;
public static Logger logger;	

    @BeforeTest
	public void start() {
		logger = Logger.getLogger("ParaBankframework");
		PropertyConfigurator.configure("Log4J.PropertiesFile");
		logger.info("framework started");
		
	}
	
    @AfterTest
	public void end() {
		logger.info("framework closed");
		
	}
	@BeforeMethod
	public void setup() {
		
		String br = "chrome";
		if(br.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			}
		else if(br.equalsIgnoreCase("EdgeDriver")) {
			driver = new EdgeDriver();
		}
		else if(br.equalsIgnoreCase("FireFoxDriver")) {
			driver = new FirefoxDriver();
}
		else {
			logger.info("provide correct details");
		}
		driver.get("https://stqatools.com/demo/Windows.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@AfterMethod
	public void tear() {
		
		driver.quit();
	}
	
	
	
	
}
