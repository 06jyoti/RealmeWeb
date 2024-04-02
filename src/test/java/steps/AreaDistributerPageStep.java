package steps;

import org.openqa.selenium.WebDriver;

import web.pages.AreaDistributerPage;
import web.pages.ZonalDistributerPage;

public class AreaDistributerPageStep extends AreaDistributerPage{


	public AreaDistributerPageStep(WebDriver driver) {
		super(driver);
	}
		
	public String getZonalDisteributerTitle()
	{
		hardWait(2000);
		String title = getElementText(ZonalDistributorTitle);
		return title;
	}	

}
