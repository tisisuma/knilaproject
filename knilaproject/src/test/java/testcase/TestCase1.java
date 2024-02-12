package testcase;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.basetest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import pageEvents.StartVisitEvents;
import pageObjects.StartVisitElements;
import pageObjects.TestData;
import utils.ElementFetch;

public class TestCase1 extends basetest {
	
	ElementFetch ele  = new ElementFetch() ;
	LoginPageEvents log = new LoginPageEvents();
	HomePageEvents register = new HomePageEvents();
	StartVisitEvents startvisit = new  StartVisitEvents();
	
  @Test
  public void login_test() throws InterruptedException {
	  log.loginfn();
      String s1= driver.getCurrentUrl();
      s1 ="https://qa-refapp.openmrs.org/openmrs/referenceapplication/home.page";
     
     System.out.println("Login Verified");
     register.registerfn();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	 register.agecalculator();
	 startvisit.startvisit();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 startvisit.addattachment();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 startvisit.toastverify();
	 startvisit.profpage();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	 startvisit.recentvisit();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	 startvisit.endvisit();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 startvisit.verifybm();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);



	 }
  

	 

     
}

