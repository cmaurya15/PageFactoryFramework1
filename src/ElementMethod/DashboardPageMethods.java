package ElementMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ElementDefinition.DashboardPageElements;


public class DashboardPageMethods 
{
	WebDriver driver;
	DashboardPageElements objDashboardPageElements;
	public DashboardPageMethods(WebDriver driver)
	{
	this.driver = driver;
	objDashboardPageElements=PageFactory.initElements(driver, DashboardPageElements.class);
	
	//Implicit wait
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//Explicit wait before performing any action on dash board page
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(objDashboardPageElements.Text_LoggedInUserName));
	
	
	}
	public String Method_GetloggedInUserName() 
	{
		
		String loggedInUserName= objDashboardPageElements.Text_LoggedInUserName.getText();
		return loggedInUserName;
		
	}

}
