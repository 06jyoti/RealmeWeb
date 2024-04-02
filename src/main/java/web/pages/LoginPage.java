package web.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	     protected By UserId = By.xpath("//input[@type='text']");
	     protected By userId = By.cssSelector("input[type='text']");
	     protected By Pass = By.xpath("//input[@placeholder='Enter Password']");
	     protected By userPass = By.cssSelector("input[type='password']");
	     protected By Login = By.cssSelector(".btn.btn-primary.login-btn.w-100");
	     protected By login = By.xpath("//button[normalize-space()='LOGIN']");
	     protected By errorMSG = By.cssSelector("div[role='alert']");
	 
	    
	    public void Login(String code, String pass) throws Exception {
		    // 	UserId.sendKeys(code);
		    //	Pass.sendKeys(pass);
	    	enterData(userId,code);
	    	enterData(userPass,pass);
	    	clickElement(Login);
	        //  login.click();
		    }
		    
}
