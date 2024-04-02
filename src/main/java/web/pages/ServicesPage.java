package web.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ServicesPage extends BasePage{

	public ServicesPage(WebDriver driver) {
		super(driver);
	}

	    protected By Service_center = By.xpath("//span[contains(text(),'Service Center')]");
	    protected By Import_Service_center = By.xpath("//li[contains(text(),'Import Service Center')]");
	    protected By Upload_Service_center = By.cssSelector("input[id='uploadBtn']");
	    protected By proceed_ServiceCenter_Excel = By.xpath("//button[normalize-space()='Proceed']");
	    protected By AllServiceCenter = By.xpath("(//li[normalize-space()='All Service Center'])[1]");
	    protected By Filter = By.xpath("(//button[@class='btn'])[1]");
	    protected By EnteServiceCenterCode = By.cssSelector("input[placeholder='Enter Service Center Code']");
	    protected By submit = By.cssSelector(".btn.btn-submit");
	      
	    
	    public void ImportServiceCenter(String serviceImport, String enteServiceCenterCode) throws InterruptedException {
			   clickElement(Service_center);  
			   clickElement(Import_Service_center);
			   enterData(uploadFile, serviceImport);
			   clickOnProceedUploadFile();
			   clickElement(AllServiceCenter);
			   clickElement(filter);
			   enterData(EnteServiceCenterCode,enteServiceCenterCode);
			   filterSearch();
			   clickOnFilterCloseBtn();	   
	}

}
