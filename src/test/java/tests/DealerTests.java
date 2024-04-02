package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import steps.BaseStep;
import steps.DealerPageStep;
import steps.LoginPageStep;
import web.testdata.Dealer;
import web.testdata.Login;

public class DealerTests extends BaseTest {
	public BaseStep baseStep;
	public LoginPageStep loginPageStep;
	public DealerPageStep dealerPageStep;

	@BeforeClass
	public void setup() throws Exception {
		driver.set(driverFactory.initialize());
		baseStep = new BaseStep(driver.get());
		loginPageStep =new LoginPageStep(driver.get());
		loginPageStep.navigateToURL(URL);
		loginPageStep.Login(Login.userID,Login.Password);
		dealerPageStep= new DealerPageStep(driver.get());
	}

	@Test
	public void VerifyIsDealerIsAbleToImport() throws Exception {
		dealerPageStep.ImportDealer(Dealer.ADFile);
		
		
	}
	
	
	@Test
	public void verifyUserIsAbleToAddCommentInAllCommentField() throws Exception {
		
	}
}
