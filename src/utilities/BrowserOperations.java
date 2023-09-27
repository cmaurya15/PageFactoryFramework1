package utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserOperations 
{
	public WebDriver driver;
	
	public WebDriver LaunchBrowser(String browserName) 
	{
		switch (browserName) 
		{
		
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
		case "IE":
			System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
			
		case "Edge":
			System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		}
		System.out.println("out of the switch in the Launch Browser Method");
		return driver;
			
	}
	
	public void LaunchApplication(String appUrl) 
	{
		System.out.println("In the launch application method "+appUrl);
		driver.get(appUrl);
		driver.manage().window().maximize();
	}
	
	public String MethodGetTitleofBrowser() 
	{
		String BrowserTitle= driver.getTitle();
		System.out.println(BrowserTitle);
		return BrowserTitle;
		
	}

}
