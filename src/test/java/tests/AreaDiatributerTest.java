package tests;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import steps.AreaDistributerPageStep;
import steps.BaseStep;
import steps.LoginPageStep;

import web.pages.BaseMethods;
import web.testdata.Login;
import web.testdata.AreaDistributer;

public class AreaDiatributerTest extends BaseTest {
	
	public BaseStep baseStep;
	public LoginPageStep loginPageStep;
	public AreaDistributerPageStep areaDistributerPageStep;
	
	@BeforeClass
	public void setup() throws Exception
	{
		driver.set(driverFactory.initialize());
		baseStep = new BaseStep(driver.get());
		loginPageStep =new LoginPageStep(driver.get());
		loginPageStep.navigateToURL(URL);
		loginPageStep.Login(Login.userID,Login.Password);
		areaDistributerPageStep = new AreaDistributerPageStep(driver.get());
		//areaDistributerPageStep.navigateToURL(URL);
	}
	
	
	 
	@Test
	public void VerifyUserIsAbleToAddAreaDistributer() throws Exception {
		areaDistributerPageStep.OpenAreaDistributer();
		areaDistributerPageStep.AddAreaDistributer( AreaDistributer.areaCode, AreaDistributer.areaName, AreaDistributer.areaContactPerson, AreaDistributer.areaEmail,AreaDistributer.areaPhoneNo);
		areaDistributerPageStep.FilterAD(AreaDistributer.filterADByMobileNo);
		areaDistributerPageStep.Status();
	}
	@Test(enabled=false)
	public void VerifyUserIsAbleToImportZonalDistributer() throws InterruptedException {
		areaDistributerPageStep.OpenAreaDistributer();
		areaDistributerPageStep.ImportAD(AreaDistributer.importADFile);
		areaDistributerPageStep.FilterAD(AreaDistributer.filterADByMobileNo);
	}
	
	
	
	
	
}