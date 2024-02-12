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

	


     }
     
     public void recentvisit2() {
    	 
 		ele.getWebElement("XPATH", StartVisitElements.profpage).click();

   
     // Get today's date
     LocalDate currentDate = LocalDate.now();

     // Locate the Recent Visit section
     WebElement recentVisitSection = basetest.driver.findElement(By.id("recentVisit"));

     // Locate all entries within the Recent Visit section
     List<WebElement> entries = recentVisitSection.findElements(By.tagName("div"));

     // Count the number of entries for the current date with Vitals tag
     int count = 0;

     for (WebElement entry : entries) {
         // Check if the entry contains the current date and the Vitals tag
         if (entry.getText().contains(currentDate.toString()) && entry.getText().contains("Vitals")) {
             count++;
             System.out.println("Date format in the entry: " + extractDateFormat(entry.getText(), currentDate));
         }
     }

     // Verify if there is exactly one entry for the current date with Vitals tag
     if (count == 1) {
         System.out.println("Verification successful: One entry found for today with Vitals tag.");
     } else {
         System.out.println("Verification failed: Either no entry found or multiple entries found for today with Vitals tag.");
     }
     }
     

 // Function to extract date format from the entry
 private static String extractDateFormat(String entryText, LocalDate currentDate) {
     for (String word : entryText.split("\\s+")) {
         try {
             LocalDate.parse(currentDate.toString(), DateTimeFormatter.ofPattern(word));
             return word;
         } catch (Exception ignored) {
             // Ignore invalid date formats
         }
     }
     return "Date format not found";
 }
}

     
     
    	





	 

	 
	 
	 
	 



	 
		
	



		
	




