package testcase;

import base.basetest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class Registration {
	ElementFetch ele  = new ElementFetch() ;
	LoginPageEvents log = new LoginPageEvents();
	HomePageEvents register = new HomePageEvents();
	basetest base= new basetest();
	
public void login_test()  {
		  log.loginfn(); }
	
	
public void registerpatient()  {
	
	register.registerfn();
	register.agecalculator();
	base.screenshot("registerfn");
	

}}
