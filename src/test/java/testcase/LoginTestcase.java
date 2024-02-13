package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.basetest;
import bsh.org.objectweb.asm.Constants;
import pageEvents.LoginPageEvents;
import pageObjects.TestData;
import utils.ElementFetch;

public class LoginTestcase extends basetest {


	
	ElementFetch ele  = new ElementFetch() ;
	LoginPageEvents log = new LoginPageEvents();
	basetest base= new basetest();

	
  @Test
  public void login_test()  {
	  log.loginfn();
	  base.screenshot("loginFn");
      String actual = "https://qa-refapp.openmrs.org/openmrs/referenceapplication/home.page";
      String expected = base.getcurrenturl();
      Assert.assertEquals(expected, actual);
      System.out.println(actual);
      System.out.println("Login Verified");
	  
	  

}
}
