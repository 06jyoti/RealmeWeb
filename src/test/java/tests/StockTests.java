package tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.ZonalDistributerPageStep;
import steps.BaseStep;
import steps.LoginPageStep;
import steps.ServicesPageSteps;
import steps.StockMasterPageStep;
import steps.EmployeePageStep;
import steps.ProductMasterPageStep;
import web.testdata.Login;
import web.testdata.ZonalDistributer;
import web.testdata.Dealer;
import web.testdata.Employee;
import web.testdata.SchemeManagement;
import web.testdata.StockMaster;
import web.testdata.ProductMaster;

public class StockTests extends BaseTest{
	public BaseStep baseStep;
	public LoginPageStep loginPageStep;
	public StockMasterPageStep stockMasterPageStep;
	

	@BeforeClass
	public void setup() throws Exception
	{
		driver.set(driverFactory.initialize());
		baseStep = new BaseStep(driver.get());
		loginPageStep =new LoginPageStep(driver.get());
		loginPageStep.navigateToURL(URL);
		loginPageStep.Login(Login.userID,Login.Password);
		stockMasterPageStep = new StockMasterPageStep(driver.get());
	}
	
	public void VerifyStockImport() throws InterruptedException {	
		stockMasterPageStep.stock_import_singleFile(StockMaster.StockFile);
	}
}
