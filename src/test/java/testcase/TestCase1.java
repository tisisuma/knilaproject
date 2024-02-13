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
	basetest base= new basetest();

	
  @Test
  public void login_test() throws InterruptedException {
	  log.loginfn();
      String s1= driver.getCurrentUrl();
      s1 ="https://qa-refapp.openmrs.org/openmrs/referenceapplication/home.page";
     
     System.out.println("Login Verified");
	  base.screenshot("loginFn");

     
     register.registerfn();
	  base.screenshot("registerfn");

	

	 register.agecalculator();
	  base.screenshot("AgeCalculator");
	 startvisit.startvisit();
	  base.screenshot("StartVisit");

	 startvisit.addattachment();
	 base.screenshot("AddAttachment");

	 startvisit.toastverify();
	 base.screenshot("toastverify");

	 startvisit.profpage();
	 base.screenshot("profpage");

	 startvisit.recentvisit();
	 base.screenshot("recentvisit");


	 startvisit.endvisit();
	 base.screenshot("endvisit");

	 
	 startvisit.verifybm();
	 base.screenshot("verifybm");

	 
	 startvisit.recentvisit2();
	 base.screenshot("recentvisit2");

	 
	 startvisit.mergevisit();
	 base.screenshot("mergevisit");

	 
	 startvisit.recentvisit2();
	 base.screenshot("recentvisit2");

	 
	 startvisit.pastdate();
	 base.screenshot("pastdate");

	 
	 startvisit.delpatient();
	 base.screenshot("delpatient");

	 
	 startvisit.searchpatient();
	 base.screenshot("searchpatient");

	 

	 



	 }
  

	 

     
}

