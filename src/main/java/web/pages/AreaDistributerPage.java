package web.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import lombok.val;

public class AreaDistributerPage extends BasePage{

	public AreaDistributerPage(WebDriver driver) {
		super(driver);
	}
	protected By OpenAD = By.xpath("//span[contains(text(),'Area Distributor')]");
    protected By AddAreaDistributer = By.xpath("//li[contains(text(),'Add Area Distributor')]");
    protected By ImportAD = By.xpath("//li[@class='ng-star-inserted'][normalize-space()='Import Area Distributor']");
    protected By ZonalDistributerList = By.cssSelector("svg[viewbox='0 0 24 24']");
//  protected By SelectFromZDList = By.cssSelector("mat-option[role='option']");   
//  @FindBy(css = "mat-option[role='option']") List<WebElement> SelectFromZDList;
    @FindBy(css = "mat-option[role='option']")
    protected List<WebElement> SelectFromZDList;
    protected By SelectedItem = By.xpath("//span[normalize-space()='ABC LIMITED");
    protected By EnterADCode = By.cssSelector("input[placeholder='Area Distributor Code']");
    protected By EnterADName = By.cssSelector("input[placeholder='Area Distributor Name']");
    protected By EnterContactPersonN = By.cssSelector("input[placeholder='Contact Person Name']");
    protected By EnterEmail = By.cssSelector("input[placeholder='Email']");
    protected By EnterPhNumber = By.cssSelector("input[placeholder='Phone']");
    protected By AllAreaDistributer = By.xpath("//li[contains(text(),'All Area Distributors')]");
    protected By FilterByPhNumber = By.cssSelector("input[placeholder='Enter Mobile Number']");
  
    public void OpenAreaDistributer() throws InterruptedException {
		  clickElement(OpenAD);          
   }
	
	  public void AddAreaDistributer(String ADcode, String ADname, String contactPN, String  Email, String Number) throws Exception { 
		  clickElement(AddAreaDistributer);	 
		  clickElement(ZonalDistributerList);
	    //  boolean give = SelectFromZDList.stream().anyMatch(option -> option.getText().equals(((WebElement) SelectedItem).getText()));
	  //    Assert.assertTrue(give);
	    //  ((WebElement) SelectedItem).click();
		  clickElement(SelectedItem);
		  enterData(EnterADCode, ADcode);
	      enterData(EnterADName,ADname );
		  enterData(EnterContactPersonN, contactPN);
		  enterData(EnterEmail,Email );
		  enterData(EnterPhNumber, Number);
		  clickOnAddBtn();	
		  }
	
	 public void ImportAD(String ADFile) throws InterruptedException {
		 clickElement(ImportAD);
		 enterData(uploadFile, ADFile);
		 clickOnProceedUploadFile();	
		 }
	
	 public void FilterAD(  String  Mobile_Number) throws InterruptedException {   	
   	     clickElement(AllAreaDistributer);
		 clickElement(filter);
		 enterData(FilterByPhNumber, Mobile_Number);
		 filterSearch();
		 clickOnFilterCloseBtn();
   } 
	 	 
	 public void Status() {
		 clickStatusUpdateButton();
		 clicOnConformationModalVisibility();		 
	 }
	 
		
	}
