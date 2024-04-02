package web.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductMasterPage extends BasePage {

	public ProductMasterPage(WebDriver driver) {
		super(driver);
	}
            //group
    	    protected By ProdMaster = By.xpath("//span[contains(text(),'Product Master')]");
		    protected By productMasterElement = By.xpath("//span[contains(text(),'Product Master')]");
		    protected By addGroupElement = By.xpath("//li[contains(text(),'Add Group')]");
		    protected By groupCodeInput = By.cssSelector("input[placeholder='Group Code']");
		    protected By titleInput = By.cssSelector("input[placeholder='Title']");
		    protected By subTitleInput = By.cssSelector("input[placeholder='Sub Title']");
		    protected By Filter = By.xpath("//button[@class='btn']");
		    protected By EnterZDCode = By.cssSelector("input[placeholder='Enter Vendor Code']");
		    protected By submit = By.cssSelector(".btn.btn-submit");
		    
		    //manage group
		    protected By manageGroupElement = By.xpath("//li[contains(text(),'Manage Group')]");
		    protected By buttonElement = By.xpath("//tbody/tr[1]/td[6]/div[1]/div[1]/button[1]");
		    protected By update_title = By.cssSelector("input[placeholder='Title']");
		    protected By closeButton = By.xpath("//i[contains(text(),'close')]");
		    
		    //Add Category
		    protected By category_click = By.xpath("//li[contains(text(),' Add SubCategory ')]");
		    protected By manage_Category = By.xpath("//li[contains(text(),' Manage Category ')]");
		    protected By Category_dropdown = By.cssSelector("svg[viewbox='0 0 24 24']");
		    protected By options = By.cssSelector("mat-option[role='option']");
		    protected By optionB = By.xpath("//span[contains(text(),' Smart Home [ ACAT03 ]')]");
		    protected By import_category = By.xpath("//li[@class='ng-star-inserted'][normalize-space()='Import Category']");
		    protected By Upload_Excel = By.cssSelector("input[id='uploadBtn']");
		    protected By proceed_Excel_upload = By.xpath("//button[normalize-space()='Proceed']");
		    
		    //subCategory
		    protected By manage_subCategory = By.xpath("//li[contains(text(),' Manage SubCategory ')]");
		    protected By import_subCategory = By.xpath("//li[@class='ng-star-inserted'][normalize-space()='Import SubCategory']");

		    //products
		    protected By manage_products = By.xpath("//li[contains(text(),' Manage Products ')]");
		    protected By import_products = By.xpath("//li[@class='ng-star-inserted'][normalize-space()='Import Products']");
		
		    
		    public void group(String G_Code, String G_Title, String G_S_Title) throws InterruptedException {
		       		 clickElement(productMasterElement);
		    		 clickElement(addGroupElement);
		    		 enterData(groupCodeInput, G_Code);
			    	 enterData(titleInput, G_Title);
			    	 enterData(subTitleInput, G_S_Title);
		    	      clickOnAddBtn();	
			    	  clickElement(manageGroupElement);
			    	  clickElement(productMasterElement);	  
		    		 }
		    
		    public void importCategory(String categoryFile) throws InterruptedException {
		    	  clickElement(productMasterElement);
		    	  clickElement(import_category);
		    	  clickElement(productMasterElement);
		    	  enterData(uploadFile, categoryFile);
		    	  clickOnProceedUploadFile();
		          clickElement(manage_Category);    	 

		    }
		    
		     public void importSubCategory(String subCategoryFile) throws InterruptedException {
		    	 clickElement(import_subCategory);
		    	 enterData(uploadFile, subCategoryFile);
		    	 clickOnProceedUploadFile();
		    	 clickElement(manage_subCategory);

		     }
		     
		     public void importProducts(String productFile) throws InterruptedException {
		    	 clickElement(import_products);
		    	 enterData(uploadFile, productFile);
		    	 clickOnProceedUploadFile();
		    	 clickElement(manage_products);
	    	
	}
}
