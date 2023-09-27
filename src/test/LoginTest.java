package test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.*;
import org.testng.annotations.*;

import ElementMethod.*;
import utilities.*;

public class LoginTest 
{
	WebDriver driver;
	
	@Test
	public void LoginTestMethod() throws Exception 
	{
		BrowserOperations objBrowserOperations=new BrowserOperations();
		
		//Calling the key word driven method for reading the values from config.properties file
		FileOperations objFileOperations=new FileOperations();
		
		driver = objBrowserOperations.LaunchBrowser(objFileOperations.Method_ReadPropertyFile("browser"));
				
		objBrowserOperations.LaunchApplication(objFileOperations.Method_ReadPropertyFile("url"));
		
		String BrowserTitle= objBrowserOperations.MethodGetTitleofBrowser();
		//System.out.println(BrowserTitle);
		//BrowserTitle.equals("OrangeHRM");
		Assert.assertEquals(BrowserTitle, "OrangeHRM");
		
		LoginPageMethods objLoginTestMethods=new LoginPageMethods(driver);
	
		objLoginTestMethods.Method_EnterUserName();
		objLoginTestMethods.Method_EnterPassword();
		objLoginTestMethods.Method_ClickLoginButton();
				
		//Thread.sleep(4000);
		DashboardPageMethods objDashboardPageMethods = new DashboardPageMethods(driver);
		String loggedInUserName= objDashboardPageMethods.Method_GetloggedInUserName();
		System.out.println(loggedInUserName);
		Assert.assertEquals(loggedInUserName, objFileOperations.Method_ReadPropertyFile("loginUser"));
		
	}
	
	@AfterMethod
	public void CaptureScreenShot(ITestResult result) throws Exception
	{
		String Str1= result.getMethod().getMethodName(); 
		
		//Date date= new Date();
		Date date= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss"); 
		String formattedDate = sdf.format(date);		
		String Str2= formattedDate.replace(" ", "_").replace(":", "");

		if (result.getStatus()==ITestResult.FAILURE) 
		{
			Thread.sleep(5000);
			TakesScreenshot screenshot = (TakesScreenshot)driver;
			File failureSC= screenshot.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(failureSC, new File(".\\ScreenShot\\"+Str1+"_"+Str2+"_Error.png"));
			
		}
	}
	
	
	
//	@Test
//	public void Method2()
//	{
//		
//	}
	
	

}
