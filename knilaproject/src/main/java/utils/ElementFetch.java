package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.basetest;

public class ElementFetch {
	public WebElement getWebElement(String indentifierType, String identifierValue) {

		switch(indentifierType) {

		case "XPATH": 
			return basetest.driver.findElement(By.xpath(identifierValue));

		case "CSS": 
			return basetest.driver.findElement(By.cssSelector(identifierValue));

		case "ID": 
			return basetest.driver.findElement(By.id(identifierValue));

		case "NAME":
			return basetest.driver.findElement(By.name(identifierValue)); 
		case "TAGNAME":
			return basetest.driver.findElement(By.tagName(identifierValue));
		case "CLASSNAME":
			return basetest.driver.findElement(By.className(identifierValue));

		default:
			return null; } 
	}
	public List<WebElement> getWebElements(String indentifierType, String identifierValue){

		switch(indentifierType) {

		case "XPATH":
			return basetest.driver.findElements(By.xpath(identifierValue));

		case "CSS":
			return basetest.driver.findElements(By.cssSelector(identifierValue));

		case "ID": 
			return basetest.driver.findElements(By.id(identifierValue));

		case "NAME":
			return basetest.driver.findElements(By.name(identifierValue));

		case "TAGNAME":
			return basetest.driver.findElements (By.tagName(identifierValue));
		case "CLASSNAME":
			return basetest.driver.findElements(By.className(identifierValue));

		default:
			return null;

		}
	}
//		public WebElement getWebElement1(String fileinput, String filepath) {
//			return basetest.driver.execute_script("arguments[0].value = arguments[1]", fileinput, filepath);

			
		



	}
