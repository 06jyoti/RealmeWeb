
package tests;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import steps.ZonalDistributerPageStep;
import steps.BaseStep;
import steps.LoginPageStep;
import utils.GenericMethods;
import web.testdata.Login;
import web.testdata.ZonalDistributer;
	
public class ZonalDisteributerTest extends BaseTest {
	
	public BaseStep baseStep;
	public LoginPageStep loginPageStep;
	public ZonalDistributerPageStep zonalDistributerPageStep;
	
	@BeforeClass
	public void setup() throws Exception {
		driver.set(driverFactory.initialize());
		baseStep = new BaseStep(driver.get());
		loginPageStep =new LoginPageStep(driver.get());
		loginPageStep.navigateToURL(URL);
		loginPageStep.Login(Login.userID,Login.Password);
		zonalDistributerPageStep = new ZonalDistributerPageStep(driver.get());
	//	zonalDistributerPageStep.navigateToURL(URL);
	}
	

//	@Test(priority=1)
//	public void VerifyUserIsAbleToLogin() throws Exception {
	//	loginPageStep.Login(Login.userID,Login.Password);
//	}
	
	
	
	@Test(priority=1)
	public void VerifyUserIsAbleToImportZonalDistributer() throws InterruptedException {
		zonalDistributerPageStep.OpenZonalDistributer();
		zonalDistributerPageStep.ImportZD(ZonalDistributer.importZDFile);
		zonalDistributerPageStep.FilterZD(ZonalDistributer.filterZDMobileNo);
		zonalDistributerPageStep.UpdateZD(ZonalDistributer.GSTNo, ZonalDistributer.GSTPDF, ZonalDistributer.PANCardNo, ZonalDistributer.PANPDF);
	}
		
}