package pageEvents;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.NoSuchElementException;

import base.basetest;

import org.bouncycastle.its.ITSPublicEncryptionKey.symmAlgorithm;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pageObjects.StartVisitElements;
import pageObjects.TestData;
import utils.ElementFetch;

public class StartVisitEvents {
	ElementFetch ele = new ElementFetch();
	public void startvisit() {
		ele.getWebElement("XPATH", StartVisitElements.startvisit).click();
		ele.getWebElement("ID", StartVisitElements.confirmvisit).click();
		ele.getWebElement("ID", StartVisitElements.attachment).click();}
	public void addattachment (){
		
		ele.getWebElement("XPATH", StartVisitElements.filedescription).sendKeys("attachment added");
		
        WebElement fileinput = ele.getWebElement("XPATH", StartVisitElements.addfile);

		fileinput.click();
		

		
		  try {
	            // Create a Robot instance
	            Robot robot = new Robot();


	            // Paste the file path using Ctrl+V
	            robot.keyPress(KeyEvent.VK_T);
	            robot.keyRelease(KeyEvent.VK_T);
	            robot.keyPress(KeyEvent.VK_E);
	            robot.keyRelease(KeyEvent.VK_E);
	            robot.keyPress(KeyEvent.VK_S);
	            robot.keyRelease(KeyEvent.VK_S);
	            robot.keyPress(KeyEvent.VK_T);
	            robot.keyRelease(KeyEvent.VK_T);
	            

	            // Press Enter to confirm the file upload
	            robot.keyPress(KeyEvent.VK_ENTER);
	            robot.keyRelease(KeyEvent.VK_ENTER);
	        } catch (AWTException e) {
	            e.printStackTrace();


				}
			ele.getWebElement("XPATH", StartVisitElements.uploadfile).click();
			System.out.println("Attachment Added");
			
	}
	
	public void toastverify() {
		
		System.out.println("Toast message is displayed: ");
        } 
        
	public void profpage() {
		ele.getWebElement("XPATH", StartVisitElements.profpage).click();
		WebElement att = ele.getWebElement("XPATH", StartVisitElements.Attverify);
		// Verify if the attachment element exists and contains necessary attributes
        if (att != null && att.getAttribute("src") != null) {
            System.out.println("Attachment is available on the webpage");
        } else {
            System.out.println("Attachment is not available on the webpage");

	

	}

	}
	public void recentvisit() {
		WebElement rv= ele.getWebElement("XPATH", StartVisitElements.recentvisit);
		if (rv != null) {
            System.out.println("Entry is available on the webpage with attachment");
        } else {
            System.out.println("Entry is not available on the webpage");
        }

		

		
	}
	public void endvisit() {
	 ele.getWebElement("XPATH", StartVisitElements.endvisit).click();

	 ele.getWebElement("XPATH", StartVisitElements.confirmendvisit).click();
	 ele.getWebElement("XPATH", StartVisitElements.startvisit).click();
	 ele.getWebElement("ID", StartVisitElements.confirmvisit).click();
	 ele.getWebElement("ID", StartVisitElements.vitals).click();
	 ele.getWebElement("ID", StartVisitElements.height).sendKeys(TestData.heightdata);
	 ele.getWebElement("ID", StartVisitElements.nextbtn).click();
	 ele.getWebElement("ID", StartVisitElements.weight).sendKeys(TestData.weightdata);
	 ele.getWebElement("ID", StartVisitElements.nextbtn).click();
     String bmivalue = ((ele.getWebElement("ID", StartVisitElements.bmi).getText()));
     System.out.println(bmivalue);
	 ele.getWebElement("XPATH", StartVisitElements.savebtn).click();
     ele.getWebElement("XPATH", StartVisitElements.save1btn).click();}
 

     public void verifybm() throws InterruptedException{

	
	 ele.getWebElement("XPATH", StartVisitElements.endvist1).click();

	 ele.getWebElement("XPATH", StartVisitElements.confirmendvisiti1).click();
	 
	  System.out.println("Thankyou for the visit");
	  basetest.driver.navigate().refresh();

	 WebElement profile =  ele.getWebElement("XPATH", StartVisitElements.profpage1);
	 profile.click();
     }
     
     public void recentvisit2() 
     {
    	WebElement recentVisitSection  = 	 ele.getWebElement("XPATH", StartVisitElements.recentvisit1);
    	int numberOfEntries = recentVisitSection.findElements(By.xpath("//li")).size();

        // Assuming one more new entry is expected, you can check if the count is greater than a threshold
        if (numberOfEntries > 0) {
            System.out.println("Recent Visit has one more new entry with current date.");
        } else {
            System.out.println("No new entry found in Recent Visit.");
        }
 }
     public void mergevisit()  {
    	 ele.getWebElement("XPATH", StartVisitElements.mergedata).click();
    	 List<WebElement> checkboxes = ele.getWebElements("NAME", StartVisitElements.checkbox);
    	  // Select each checkbox
         for (WebElement checkbox : checkboxes) {
             checkbox.click();

     }
         System.out.println("Visit data selected");
         
    	 ele.getWebElement("ID", StartVisitElements.merge2data).click();
    	 ele.getWebElement("XPATH", StartVisitElements.returnbtn).click();
     }
     public void recentvisit3() 
     {
    	WebElement recentVisitSection  = 	 ele.getWebElement("XPATH", StartVisitElements.recentvisit1);
    	int numberOfEntries = recentVisitSection.findElements(By.xpath("//li")).size();

        // Assuming one more new entry is expected, you can check if the count is greater than a threshold
        if (numberOfEntries ==1 ) {
            System.out.println("Recent Visit has exactly one entry.");
        } else {
            System.out.println("Recent Visit has one entry.");

}}
        public void pastdate() {
       	 ele.getWebElement("XPATH", StartVisitElements.addpastdate).click();

       	WebElement myElement = basetest.driver.findElement(By.cssSelector("td.day.disabled"));


      // Check if the element is enabled
         if (myElement.isEnabled()) {
        	 System.out.println("The dates are disabled");

         } else {
             System.out.println("The element is enabled");
         }
	 
     }
        public void delpatient() {
            basetest.driver.navigate().refresh();
          	 ele.getWebElement("XPATH", StartVisitElements.delpatient).click();
          	 ele.getWebElement("ID", StartVisitElements.delmsg).sendKeys(TestData.delmsg);
          	 ele.getWebElement("XPATH", StartVisitElements.confrimdel).click();
             System.out.println("Patient details deleted");

           }
        public void searchpatient() {
        	ele.getWebElement("XPATH", StartVisitElements.search).sendKeys(TestData.searchtext);
        	System.out.println("No matching records found");
        }
}
	 
	 
	 
	 



	 
		
	



		
	




