package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class Extentreportdemo
{
	ExtentReports extent = new ExtentReports();


	@BeforeSuite
	public void reportsetup()
	{
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");

		// create ExtentReports and attach reporter(s)

		extent.attachReporter(htmlReporter);

	}

	@AfterSuite
	public void reportTeardown()
	{
		extent.flush();
	}



}

