package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Tests extends Baseclass 
{

	@Test
	public void testOne() 
	{
		
		 ExtentTest test = extent.createTest("testone", "Sample testcase for demo");
		 test.log(Status.INFO, "Test one started");
		 
		 
		driver.get("https://google.com");
		 test.log(Status.PASS, "Navigate to https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		test.log(Status.PASS, "Enter automation ");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		test.log(Status.PASS, "click enter key");
		
		System.out.println("Completed test one");
		test.log(Status.INFO, "Test one completed");
		//driver.wait(2000);
	}
	
	
//	@Test
//	public void testTwo() 
//	{
//		//driver.get("https://google.com");
//		driver.findElement(By.name("q")).sendKeys("nilam");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		
//		System.out.println("Completed test two");
//		//driver.wait(2000);
//	}
//	
	
	@Test
	public void loginTest()
	{
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		  //  driver.findElement(By.name("q")).clear();
		    //driver.findElement(By.name("q")).sendKeys("orangehrm");
		    //driver.findElement(By.id("tsf")).submit();
		 //   driver.findElement(By.xpath("//div[@id='rso']/div[4]/div/div/a/h3")).click();
		    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
		    driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).click();
		    driver.findElement(By.id("txtUsername")).clear();
		    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		    driver.findElement(By.id("txtPassword")).click();
		    driver.findElement(By.id("txtPassword")).clear();
		    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		    driver.findElement(By.id("btnLogin")).click();
	}
	


}
