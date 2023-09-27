package ElementMethod;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ElementDefinition.LoginPageElements;
import utilities.FileOperations;

public class LoginPageMethods 
{
	WebDriver driver;
	LoginPageElements objLoginPageElements;
	public LoginPageMethods(WebDriver driver)
	{
	this.driver = driver;
	objLoginPageElements=PageFactory.initElements(driver, LoginPageElements.class);
	
	//Implicit wait
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//Explicit wait before performing any action on login page
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(objLoginPageElements.Textbox_UserName));
	
	
	}
	//1. We need driver to bring element
	public void Method_EnterUserName() throws Exception 
	{
		FileOperations objFileOperations=new FileOperations();
		
		objLoginPageElements.Textbox_UserName.sendKeys(objFileOperations.Method_ReadPropertyFile("username"));
		
	}
	
	public void Method_EnterPassword() throws Exception 
	{
		FileOperations objFileOperations=new FileOperations();
		
		objLoginPageElements.Textbox_Password.sendKeys(objFileOperations.Method_ReadPropertyFile("password"));
		
	}
	
	public void Method_ClickLoginButton() 
	{
		objLoginPageElements.Button_Login.click();
		
	}
	


}
