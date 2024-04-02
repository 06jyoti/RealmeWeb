package web.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import web.testdata.Employee;

public class EmployeePage extends BasePage {

	public EmployeePage(WebDriver driver) {
		super(driver);
	}

	    protected By Employee = By.xpath("//span[contains(text(),'Employee')]");
	    protected By Import_Employee = By.xpath("//li[normalize-space()='Import Employee']");
	    protected By Upload = By.cssSelector("input[id='uploadBtn']");
	    protected By proceed_Employee = By.xpath("//button[normalize-space()='Proceed']");
	    protected By AllEmployee = By.xpath("//li[normalize-space()='All Employees']");
	    protected By Import_Employee_Vendor = By.xpath("//li[normalize-space()='Import Employee Vendor']");
	    protected By Import_Reporting_Staff = By.xpath("//li[@class='ng-star-inserted'][normalize-space()='Import Reporting Staff']");
	    protected By Filter = By.xpath("//button[@class='btn']");
	    protected By EnteVendorCode = By.cssSelector("input[placeholder='Enter Code']");
	    protected By submit = By.cssSelector(".btn.btn-submit");
	    protected By XButton = By.xpath("(//button[@class='btn btn-close'])[1]");
	    protected By Edit_list = By.xpath("//button[@class='mat-mdc-menu-trigger']");
	    protected By edit = By.xpath("//span[normalize-space()='Edit']");
	    protected By editEmail = By.cssSelector("input[placeholder='Email']");
	    protected By ALLEmployee = By.xpath("//li[normalize-space()='All Employees']");
	    protected By UpdateWindowClose = By.xpath("//button[contains(text(),'Update')]");
	   
	   public void ImportEmployee(String EmployeeFile) throws InterruptedException {
		    clickElement(Employee);
		    clickElement(Import_Employee);
			enterData(uploadFile, EmployeeFile);
			clickOnProceedUploadFile();	
			clickElement(AllEmployee);	
	}
	   
	    public void EditAllEmployee(String vendorCode, String editemail) throws InterruptedException {
	    	clickElement(ALLEmployee);
	    	clickElement(filter);
	    	enterData(EnteVendorCode, vendorCode);
	        filterSearch();
			clickOnFilterCloseBtn();
	    	clickElement(Edit_list);
	    	clickElement(edit);
	    	enterData(editEmail,editemail);
	    }
	   public void ImportEmployeeVendor(String vendorFile) throws InterruptedException {
		   clickElement(Import_Employee_Vendor);
		   clickElement(Import_Employee_Vendor);
		   enterData(uploadFile,vendorFile);
		   clickOnProceedUploadFile();	

	   }
	   public void ImportReportingStaff(String reportingFile) throws InterruptedException {
		   clickElement(Import_Reporting_Staff);
		   enterData(uploadFile, reportingFile);
		   clickOnProceedUploadFile();	
	   }
 
}
