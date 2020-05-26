package tests;


import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Baseclass extends Extentreportdemo
{
	
	
	AppiumDriver<MobileElement> driver;
	@BeforeTest
	public void setup()
	{
		try {
		DesiredCapabilities caps =new DesiredCapabilities();
		//caps.setCapability("platformName","Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//caps.setCapability(CapabilityType.VERSION, "8.1");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1726");
		caps.setCapability(MobileCapabilityType.UDID, "NRIZK74HZTS8JBK7");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		//caps.setCapability(MobileCapabilityType.APP, "");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		caps.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
		//caps.setCapability(MobileCapabilityType.APP., value);
		//caps.setCapability("w3c", false);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		 driver =new AppiumDriver<MobileElement>(url,caps);
		 		
		
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			System.out.println("Cause is"+ e.getCause());
			System.out.println("Message is"+ e.getMessage());
			e.printStackTrace();
		}
	}
	@Test
	public void sampleTest()
	{
		System.out.println("I am inside sample test");
	}
	
	
	
	@AfterSuite
	public void teardown()
	{
		driver.close();
		driver.quit();
	}

}
