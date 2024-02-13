package pageEvents;


import static org.testng.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;
import pageObjects.HomePageElements;
import pageObjects.TestData;
import utils.ElementFetch;

public class HomePageEvents {
	ElementFetch ele = new ElementFetch();
	public void registerfn()
{
		ele.getWebElement("ID", HomePageElements.registerpatient).click();
		ele.getWebElement("NAME", HomePageElements.patientname).sendKeys(TestData.patientname);
		ele.getWebElement("NAME", HomePageElements.middlename).sendKeys(TestData.middlename);
		ele.getWebElement("NAME", HomePageElements.lastname).sendKeys(TestData.lastname);
        ele.getWebElement("ID", HomePageElements.nextpage).click();
		ele.getWebElement("XPATH", HomePageElements.gender).click();
		ele.getWebElement("ID", HomePageElements.nextpage).click();
		ele.getWebElement("ID", HomePageElements.bdate).sendKeys(TestData.date);
		ele.getWebElement("XPATH", HomePageElements.bmonth).click();
        ele.getWebElement("ID", HomePageElements.byear).sendKeys(TestData.Year);
        ele.getWebElement("ID", HomePageElements.nextpage).click();
		ele.getWebElement("ID", HomePageElements.Address).sendKeys(TestData.Address);
		ele.getWebElement("ID", HomePageElements.City).sendKeys(TestData.city);
		ele.getWebElement("ID", HomePageElements.state).sendKeys(TestData.state);
		ele.getWebElement("ID", HomePageElements.country).sendKeys(TestData.country);
		ele.getWebElement("ID", HomePageElements.postalcode).sendKeys(TestData.postalcode);
        ele.getWebElement("ID", HomePageElements.nextpage).click();
		ele.getWebElement("NAME", HomePageElements.phno).sendKeys(TestData.phno);
		ele.getWebElement("ID", HomePageElements.confirmbtn).click();
		
}
	
	public void agecalculator() {
	String verifydob =ele.getWebElement("XPATH", HomePageElements.vdob).getText();


      // Find the index of the colon ":" in the text
      int colonIndex = verifydob.indexOf(":");

      // Check if the colon is found
      if (colonIndex != -1 && colonIndex + 2 < verifydob.length()) {
          // Extract the substring after the colon
          String dateSubstring = verifydob.substring(colonIndex + 2);
          System.out.println(dateSubstring);
          dateSubstring = dateSubstring.replace(",", "");
          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
          LocalDate birthdate = LocalDate.parse(dateSubstring, formatter);
          LocalDate currentDate = LocalDate.now();
          Period age = Period.between(birthdate, currentDate);
          System.out.println("Your age is: " + age.getYears() + " years.");}
      ele.getWebElement("ID", HomePageElements.savebtn).click();
      
      String agecalc = ele.getWebElement("XPATH", HomePageElements.agecal).getText();
      System.out.println(agecalc);
      int spaceIndex = agecalc.indexOf(' ');
      if (spaceIndex != -1) {
          // Extract the substring before the space (assumed to be the age)
          String extractedAge = agecalc.substring(0, spaceIndex);

          // Print the extracted age
          System.out.println(extractedAge+ " years");
      } 
        
      


          
      
    	
		
	}
	public void verifyfn( ) {
	    String verifyname  = ele.getWebElement("XPATH", HomePageElements.Vname).getText();
	
        String verifygender =ele.getWebElement("XPATH", HomePageElements.Vgender).getText();
	    String verifydob =ele.getWebElement("XPATH", HomePageElements.vdob).getText();
	    String verifyaddress =ele.getWebElement("XPATH", HomePageElements.vaddress).getText();
        String verifyphno = ele.getWebElement("XPATH", HomePageElements.vphno).getText();
        ele.getWebElement("ID", HomePageElements.savebtn).click();
	}

    }


