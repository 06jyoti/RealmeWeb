package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import steps.ZonalDistributerPageStep;
import steps.BaseStep;
import steps.EmployeePageStep;
import steps.ProductMasterPageStep;
import web.testdata.ZonalDistributer;
import web.testdata.Employee;
import web.testdata.ProductMaster;


public class ProductMasterTest extends BaseTest{
	public BaseStep baseStep;
	public EmployeePageStep endpointsStep;
	public ProductMasterPageStep productMasterPageStep;

	@BeforeClass
	public void setup() {
		driver.set(driverFactory.initialize());
		baseStep = new BaseStep(driver.get());
		productMasterPageStep.navigateToURL(URL);
		
	}
	

}
