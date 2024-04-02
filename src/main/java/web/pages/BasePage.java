package web.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage extends BaseMethods {	
     protected By addButton = By.xpath("//button[normalize-space()='Add']");
     protected By resetButton = By.xpath("//button[normalize-space()='Reset']");
	 protected By statusUpdateButton = By.xpath("//label[@for='1']//div[@class='slider round']");
	 protected By conformationModalYes = By.xpath("//button[@class='btn btn-primary']");
	 protected By filter = By.xpath("//img[@src='../../../../../../assets/action/filter.svg']");
	 protected By editButton = By.xpath("//body[1]/app-root[1]/div[2]/div[2]/app-all-zonal-distributors[1]/div[3]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/div[1]/button[1]/img[1]");
	 protected By updateEditedItem = By.xpath("//button[normalize-space()='Update']");
	 protected By closeUpdateBox = By.xpath("//i[@class='large material-icons']");
	 protected By searchFilter = By.xpath("//button[normalize-space()='Search']");
	 protected By filterCloseButton = By.xpath("//button[@class='btn btn-close']");
     protected By uploadFile = By.cssSelector("input[id='uploadBtn']");
     protected By proceedUploadFile = By.xpath("//button[normalize-space()='Proceed']");
     protected By ZonalDistributorTitle =By.xpath("//ol[@class='breadcrumb']");
     protected By DocumntDetails = By.xpath("//span[contains(text(),'Document Details')]");
   	 protected By cognito = By.xpath("//div[@class='slider round']");


	 public BasePage(WebDriver driver) {
		super(driver);

	}
	public void clickOnAddBtn()
	{
		clickElement(addButton);
	}
	
	public void clickStatusUpdateButton() {
		waitForElementInVisibility(statusUpdateButton, TIMEOUT, false);
		clickElement(statusUpdateButton);
	}
	
	public void clicOnConformationModalVisibility() {
		waitForElementInVisibility(conformationModalYes, TIMEOUT, false);
		clickElement(conformationModalYes);
	}
	
	public void clickOnFilter() {
		waitForElementInVisibility(filter, TIMEOUT, false);
		clickElement(filter);
	}
	
	public void clickOnEditButton() {
		
		waitForElementInVisibility(editButton, TIMEOUT, false);
		clickElement(editButton);
		waitForElementInVisibility(DocumntDetails, TIMEOUT, false);
		clickElement(DocumntDetails);
		
	}

	public void clickOnUpdateEditBtn()
	{
		clickElement(updateEditedItem);
	}

	public void clickOnCloseUpdateBtn()
	{
		waitForElementClickable(closeUpdateBox, SHORT_TIMEOUT, false);
		clickElement(closeUpdateBox);
	}
	
	public void filterSearch()
	{
		clickElement(searchFilter);
	}
	
	public void clickOnUpdateFileBtn()
	{
		waitForElementClickable(uploadFile, SHORT_TIMEOUT, false);
		clickElement(uploadFile);
	}
	
	public void clickOnFilterCloseBtn()
	{
		waitForElementClickable(filterCloseButton, SHORT_TIMEOUT, false);
		clickElement(filterCloseButton);
	}
	
	public void clickOnProceedUploadFile()
	{
		waitForElementClickable(proceedUploadFile, SHORT_TIMEOUT, false);
		clickElement(proceedUploadFile);
	}
	
	
	public void clickOnEditBtn(By locator, String tableHeaderName)
	{
		waitForElementClickable(locator, SHORT_TIMEOUT, false);
		clickElement(locator);
	}
	
	public int getTableRowCount(By locator)
	{
		List <WebElement> rows = _driver.findElements(locator); 
        int rowSize= rows.size();
        return rowSize;
	}
	
	public int getTableColCount(By locator)
	{
		List <WebElement> col = _driver.findElements(locator); 
        int colSize= col.size();
        return colSize;	
	}
	
//	public void enterDataInCategoryModalField(String name,String definition) {
//		enterData(categoryTextField, name);
//		enterData(definitionTxtField, definition);			
//	}
	
	
	public boolean verifyCategoryIsDeleted(String categoryName) {
		By category = By.xpath("//tbody/tr/td[text()='"+categoryName+"']");
		boolean isCategoryPresent = isElementPresentShort(category, true);
		return isCategoryPresent;
	}
	
}

