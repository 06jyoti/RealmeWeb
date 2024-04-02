package web.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DealerPage extends BasePage {

	public DealerPage(WebDriver driver) {
		super(driver);
	}
	protected By OpenDealer = By.xpath("//body/app-root[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]");
	protected By AddDealer = By.xpath("//li[contains(text(),'Add Dealer')]");
	protected By dropdown1 = By.cssSelector("svg[viewbox='0 0 24 24']");
	protected By options = By.cssSelector("mat-option[role='option']");
	protected By optionB = By.xpath("//span[contains(text(),' Jyoti Moile Hub [ ZD5059 ]')]");
	protected By SelectAreaDistributor = By.xpath("//span[contains(text(),'Select Area Distributor')]");
	protected By option = By.cssSelector("mat-option[role='option']");
	protected By B = By.xpath("//span[contains(text(),'kusum Enterprices [ AD1920 ]')]");
	protected By excel_submit = By.xpath("//button[@class='btn btn-submit']");
	protected By EnterRetailorCode = By.cssSelector("input[placeholder='Retailer Code']");
	protected By EnterRetailorName = By.cssSelector("input[placeholder='Retailer Name']");
	protected By ContactPersonName = By.cssSelector("input[placeholder='Contact Person Name']");
	protected By email = By.cssSelector("input[placeholder='email']");
	protected By PhoneNumber = By.cssSelector("input[placeholder='phone']");
	protected By FilterByMobileNo = By.cssSelector("input[placeholder='Enter Mobile Number']");
	protected By AllDealer = By.xpath("//body/app-root[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[4]/ul[1]/li[3]");
	protected By ImportDealer= By.xpath("//li[normalize-space()='Import Dealer']");
	protected By buttonElement = By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/button[1]/img[1]");
	protected By updateButton = By.xpath("//button[contains(text(),'Update')]");
	protected By materialIcons = By.cssSelector(".large.material-icons");
	protected By EditButton = By.xpath("//img[@src='../../../../../../assets/action/edit-bold.svg']");
	protected By DocumntDetails = By.xpath("//span[contains(text(),'Document Details')]");
	protected By GSTNumber = By.cssSelector("input[placeholder='GST Number']");
	protected By GST_PDF = By.xpath("//app-image-upload[@formcontrolname='gst_certificate']//input[@type='file']");
	protected By PANNumber = By.cssSelector("input[placeholder='PanCard Number']");
	protected By PAN_PDF = By.xpath("//app-image-upload[@formcontrolname='pan_card']//input[@type='file']");


	 public void ImportDealer(String AD_File) throws InterruptedException {
		 clickElement(OpenDealer);
		 clickElement(ImportDealer);
		 enterData(uploadFile, AD_File);
		 clickOnProceedUploadFile();	
		 }
	
	 public void FilterDealer(  String  Mobile_Number) throws InterruptedException {   	
  	     clickElement(AllDealer);
		 clickElement(filter);
		 enterData(FilterByMobileNo, Mobile_Number);
		 filterSearch();
		 clickOnFilterCloseBtn();
  } 
	 	 
	 public void Status() {
		 clickStatusUpdateButton();
		 clicOnConformationModalVisibility();		 
	 }
	 
		
}
