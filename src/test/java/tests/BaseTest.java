package tests;

import java.lang.reflect.Method;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.model.Media;


import web.config.WebConfig;
import web.init.DriverFactory;
	
public class BaseTest  {

	public ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	public DriverFactory driverFactory = new DriverFactory();
	public String URL = WebConfig.URL;
	public SoftAssert softAssert ;

	@BeforeSuite
	public void suiteSetup() {
	}

	@AfterSuite
	public void suiteTeardown() {
	}
	
	
}
