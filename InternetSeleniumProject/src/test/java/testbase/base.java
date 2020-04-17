package testbase;
/*
 * prerequisite
 * browserlaunch
 * postrequisite
 * 
 *  * 
 * */

import java.io.FileInputStream;
import java.util.Properties;


import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;



public class base {

	public static WebDriver driver= null;
	
		
	@Test
public void launchbrowser()
{
	

	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Namrata\\Desktop\\Github_Namrata\\TestingProject1\\InternetSeleniumProject\\Resources\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
	}
}
/*@AfterTest
	public void teardown()
	{
		driver.quit();
	}*/
	
}
