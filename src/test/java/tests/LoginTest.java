package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.BaseStep;
import steps.LoginPageStep;
import web.testdata.Login;

	public class LoginTest extends BaseTest {
		
		public BaseStep baseStep;
		public LoginPageStep loginPageStep;

	@BeforeClass
	public void setup() {
		driver.set(driverFactory.initialize());
		baseStep = new BaseStep(driver.get());
		loginPageStep =new LoginPageStep(driver.get());
		loginPageStep.navigateToURL(URL);
		
		
	}

	@Test
	public void VerifyUserIsAbleToLogin() throws Exception {
		loginPageStep.Login(Login.userID,Login.Password);		
	}
	
}
