package ElementDefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPageElements 
{
		@FindBy(how=How.CLASS_NAME,using="oxd-userdropdown-name")
		public WebElement Text_LoggedInUserName;

}
