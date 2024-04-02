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
import steps.EmployeePageStep;
import steps.LoginPageStep;
import web.testdata.ZonalDistributer;
import web.testdata.Dealer;
import web.testdata.Employee;
import web.testdata.Login;

public class EmployeeTest extends BaseTest {

	
	public BaseStep baseStep;
	public LoginPageStep loginPageStep;
	public EmployeePageStep employeePageStep;
	
	@BeforeClass
	public void setup() throws Exception {
		driver.set(driverFactory.initialize());
		baseStep = new BaseStep(driver.get());
		loginPageStep =new LoginPageStep(driver.get());
		loginPageStep.navigateToURL(URL);
		loginPageStep.Login(Login.userID,Login.Password);
		employeePageStep = new EmployeePageStep(driver.get());	
	}

    public void VerifyEmployeeImport() throws InterruptedException {
    	employeePageStep.ImportEmployee(Employee.employeeFile);
    	employeePageStep.ImportEmployeeVendor(Employee.VendorFile);
    	employeePageStep.ImportReportingStaff(Employee.ReportingFile);
    	
    }
}
