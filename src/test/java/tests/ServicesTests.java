package tests;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import steps.ZonalDistributerPageStep;
import steps.BaseStep;
import steps.LoginPageStep;
import steps.ServicesPageSteps;
import steps.SchemeManagementPageStep;
import web.testdata.ZonalDistributer;
import web.testdata.Login;
import web.testdata.Services;

public class ServicesTests extends BaseTest {

	public BaseStep baseStep;
	public LoginPageStep loginPageStep;
	public ServicesPageSteps servicesPageSteps;


	@BeforeClass
	public void setup() throws Exception {
		
		driver.set(driverFactory.initialize());
		baseStep = new BaseStep(driver.get());
		loginPageStep =new LoginPageStep(driver.get());
		loginPageStep.navigateToURL(URL);
		loginPageStep.Login(Login.userID,Login.Password);
		servicesPageSteps = new ServicesPageSteps(driver.get());

	}
	
	public void VerifyServiceCenterImport() throws Exception {
		servicesPageSteps.ImportServiceCenter(Services.serviceImport, Services.enteServiceCenterCode);
		
	}
}
