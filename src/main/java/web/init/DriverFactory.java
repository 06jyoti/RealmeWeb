package web.init;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.junit.Assert;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import web.config.WebConfig;

public class DriverFactory {
	
	private WebDriver driver;
	private String isheadless = WebConfig.HEADLESS;
	private String browser = WebConfig.BROWSER;
	
	public WebDriver initialize() {
		try {
			driver=setDriver(browser);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
				return driver;
	}
	
	private WebDriver setDriver(String browser) {
		switch(browser.toLowerCase()) {
		case "chrome":
			driver = initChromeDriver(isheadless);
		break;
		case "ie":
			driver = initIEDriver(isheadless);
		break;
		case "firefox":
			driver = initFirefoxDriver(isheadless);
		break;
		default :
			driver = initChromeDriver(isheadless);
		}	
		return driver;		
	}

	private WebDriver initChromeDriver(String isheadless) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		if (isheadless.toLowerCase().equals("false")) {
			options.addArguments("--start-maximized");
			options.addArguments("--remote-allow-origins=*");
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		} else {
			options.addArguments("--isheadless");
			options.addArguments("--window-size=1920,1080");
		}
		driver =new ChromeDriver(options);
		return driver;
	}

	private WebDriver initFirefoxDriver(String isheadless) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options = new FirefoxOptions();
		if (isheadless.toLowerCase().equals("false")) {
			options.addArguments("--start-maximized");
			options.addArguments("--remote-allow-origins=*");
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		} else {
			options.addArguments("--isheadless");
			options.addArguments("--window-size=1920,1080");
		}
		driver =new FirefoxDriver(options);
		return driver;	
	}
    private WebDriver initIEDriver(String isheadless) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		if (isheadless.toLowerCase().equals("false")) {
			options.addArguments("--start-maximized");
		//	options.addArguments("--remote-allow-origins=*");
		//	options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		} else {
			options.addArguments("--isheadless");
			options.addArguments("--window-size=1920,1080");
		}
		driver =new EdgeDriver(options);
		return driver;	
	}
}

