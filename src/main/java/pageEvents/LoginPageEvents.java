package pageEvents;





import pageObjects.LoginPageElements;
import pageObjects.TestData;
import utils.ElementFetch;

public class LoginPageEvents {
	ElementFetch ele = new ElementFetch();
	public void loginfn()
	{
		ele.getWebElement("NAME", LoginPageElements.username).sendKeys(TestData.usernamedata);;
		ele.getWebElement("NAME", LoginPageElements.password).sendKeys(TestData.Passworddata);
		ele.getWebElement("ID", LoginPageElements.location).click();
		ele.getWebElement("ID", LoginPageElements.loginbtn).click();
		
		
		

	
	    
}
}