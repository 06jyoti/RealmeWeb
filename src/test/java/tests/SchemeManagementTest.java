package tests;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import steps.ZonalDistributerPageStep;
import steps.BaseStep;
import steps.LoginPageStep;
import steps.SchemeManagementPageStep;
import steps.ServicesPageSteps;
import steps.StockMasterPageStep;
import web.testdata.Login;
import web.testdata.ZonalDistributer;
import web.testdata.Dealer;
import web.testdata.SchemeManagement;

public class SchemeManagementTest extends BaseTest {
	
	public BaseStep baseStep;
	public LoginPageStep loginPageStep;
	public SchemeManagementPageStep schemeManagementPageStep;
	
	@BeforeClass
	public void setup() throws Exception
	{
		driver.set(driverFactory.initialize());
		baseStep = new BaseStep(driver.get());
		loginPageStep =new LoginPageStep(driver.get());
		loginPageStep.navigateToURL(URL);
		loginPageStep.Login(Login.userID,Login.Password);
		schemeManagementPageStep = new SchemeManagementPageStep(driver.get());
	}
	
	
}
