package web.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZonalDistributerPage extends BasePage {
	
	public ZonalDistributerPage(WebDriver driver) {
		super(driver);
	}
	
	 protected By OpenZD = By.xpath("//span[contains(text(),'Zonal Distributor')]");
	 protected By AddZonalDistributor = By.xpath("//li[contains(text(),'Add Zonal Distributor')]");
	 protected By ImportZD = By.xpath("//li[@class='ng-star-inserted'][normalize-space()='Import Zonal Distributor']");
     protected By proceedZD_Excel = By.xpath("//button[normalize-space()='Proceed']");
     protected By EnterZDCode = By.cssSelector("input[placeholder='Zonal Distributor Code']");
     protected By EnterName = By.cssSelector("input[placeholder='Zonal Distributor Name']");
	 protected By EnterContactPN = By.cssSelector("input[placeholder='Contact Person Name']");	 
	 protected By EnterEmail = By.cssSelector("input[placeholder='Email']");
	 protected By EnterNumber = By.cssSelector("input[placeholder='Phone']");
     protected By ZD_import_msg = By.xpath("//div[@id='toast-container']");
     protected By AddZD = By.xpath("//button[contains(text(),'Add')]");   
     protected By addtZonalDistributorTitle =  By.xpath("//ol[@class='breadcrumb']");
  // All Zonal Disrtibuter
     protected By AllZonalDistributer = By.xpath("//tbody/tr/td[1]");
     protected By FilterByZDCode = By.cssSelector("input[placeholder='Enter ZD Code']");
     protected By FilterByZDName = By.cssSelector("input[placeholder='Enter ZD Name']");
     protected By FilterByContactPN = By.cssSelector("input[placeholder='Enter Contact Person']");
     protected By FilterByMobileN = By.cssSelector("input[placeholder='Enter Mobile Number']");
     protected By validationMessage = By.xpath("//div[@id='toast-container']");
 // opens update window
     protected By waitforZDName = By.cssSelector("input[placeholder='Contact Person Name']");
     protected By updateZDNameInput = By.cssSelector("input[placeholder='Contact Person Name']");
     protected By updateWindowCloseButton = By.xpath("//button[contains(text(),'Update')]");
     protected By closeButton = By.cssSelector(".large.material-icons");
     protected By DocumntDetails = By.xpath("//span[contains(text(),'Document Details')]");
     protected By GST_PDF = By.xpath("//app-image-upload[@formcontrolname='gst_certificate']//input[@type='file']");
     protected By GSTNumber = By.cssSelector("input[placeholder='GST Number']");
     protected By PANNumber = By.cssSelector("input[placeholder='PanCard Number']");
     protected By PAN_PDF = By.xpath("//app-image-upload[@formcontrolname='pan_card']//input[@type='file']");
  

	
	 public void OpenZonalDistributer() throws InterruptedException {
		  clickElement(OpenZD);          
     }
	
	  public void AddZonalDistributer(String ZDcode, String ZDname, String contactPN, String  Email, String Number) throws Exception { 
		  clickElement(AddZonalDistributor);
		  enterData(EnterZDCode, ZDcode);
	      enterData(EnterName,ZDname );
		  enterData(EnterContactPN, contactPN);
		  enterData(EnterEmail,Email );
		  enterData(EnterNumber, Number);
		  clickOnAddBtn();	
		  }
	
	 public void ImportZD(String ZDFile) throws InterruptedException {
		 clickElement(ImportZD);
		 enterData(uploadFile, ZDFile);
		 clickOnProceedUploadFile();	
		 }
	
	 public void FilterZD(  String  Mobile_Number) throws InterruptedException {   	
     	 clickElement(AllZonalDistributer);
		 clickElement(filter);
		 enterData(FilterByMobileN, Mobile_Number);
		 filterSearch();
		 clickOnFilterCloseBtn();
     } 
	 	 
	 public void Status() {
		 clickStatusUpdateButton();
		 clicOnConformationModalVisibility();		 
	 }
	 
		 
	  public void UpdateZD(String GSTNo, String PANNo,String GSTpdf, String PANpdf) throws InterruptedException {
		  clickOnEditButton();
 		  enterData(GSTNumber,GSTNo);
 	   	 enterData(GST_PDF,GSTpdf);
 		  enterData(PAN_PDF,PANNo);
 		 enterData(PAN_PDF,PANpdf);
		  clickElement(updateWindowCloseButton);
		  clickElement(closeButton);  
		  clickOnUpdateEditBtn();
		  clickOnCloseUpdateBtn();
		  }
	  
}