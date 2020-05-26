package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.PropertiesFile;

public class Firstselenium {
	
	
	public static String browser;
	static WebDriver driver;

	public static void main(String[] args) 

	{
		//setBrowser();
		PropertiesFile.readProertiesfile();
		setBrowserConfig();
		runTest();
		PropertiesFile.writePropertiesFile();
	
	}
	
	public static void setBrowser()
	{
		browser="firefox";
	}
	
	public static void setBrowserConfig()
	{
		//String projectLocation=System.getProperty("user.dir");
		
		
		if (browser.contains("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","G:/NILAM/PATH OF SELENIUM/Selenium/geckodriver-v0.24.0-win64/geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		if (browser.contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "G:/NILAM/PATH OF SELENIUM/Selenium/chromedriver_win32/chromedriver.exe");
		
			System.setProperty("webdriver.chrome.bin", "");
			 driver=new ChromeDriver();
		}
		
	}
	public static void runTest()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.quit();
	}
	

}
