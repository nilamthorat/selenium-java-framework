package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extentreportsbasic {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "G:/NILAM/PATH OF SELENIUM/Selenium/geckodriver-v0.24.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentreports.html");
		
		ExtentReports extent = new ExtentReports();

		// attach only HtmlReporter
		extent.attachReporter(htmlReporter);

		ExtentTest test = extent.createTest("Google search","check search functionality");
		test.log(Status.INFO, "starting test case");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		test.pass("navigated to orangehrm website");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		test.pass("user name entered");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        test.pass("password entered");
		driver.findElement(By.name("Submit")).sendKeys(Keys.RETURN);
		test.pass("pressed enter key");
		driver.close();
		test.pass("browser is closed");
		test.info("Login completed");
		//wwithout flush report is not displayed.error is not displayed
		extent.flush();
		
	}

}
