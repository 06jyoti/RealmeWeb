package web.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class StockMasterPage extends BasePage {
	
		
	public StockMasterPage(WebDriver driver) {
		super(driver);
		
	}

		    protected By Stock_Master = By.xpath("//span[contains(text(),'Stock Master')]");
		    protected By Import_Stock_Master = By.xpath("//li[contains(text(),'Import Stocks')]");
		    protected By Upload_Stock_Master = By.cssSelector("input[id='uploadBtn']");
		    protected By cognito = By.xpath("//div[@class='slider round']");
		    protected By conformation_popup = By.xpath("//button[@class='btn btn-primary']");
		    protected By proceed_Stock_Master_Excel = By.xpath("//button[normalize-space()='Submit']");
		    protected By ManageStocks = By.xpath("(//li[normalize-space()='Manage Stocks'])");
		    protected By Filter = By.xpath("(//button[@class='btn'])[1]");
		    protected By EnteVendorCode = By.cssSelector("input[placeholder='Enter Vendor Code']");
		    protected By submit = By.cssSelector(".btn.btn-submit");
		

		    public void stock_import_singleFile(String stockFile) throws InterruptedException {
		 	  clickElement(Stock_Master);
		 	  clickElement(Import_Stock_Master);
		 	  enterData(uploadFile,stockFile);
		 	  clickOnProceedUploadFile();
		   	 clickElement(ManageStocks);
		    }

}