package pageObjects;

public interface StartVisitElements {
  String startvisit ="//*[@id=\"org.openmrs.module.coreapps.createVisit\"]/div/div[2]";
  String confirmvisit ="start-visit-with-visittype-confirm";
  String attachment ="attachments.attachments.visitActions.default";
  String addfile ="/html/body/div[1]/div[3]/div[3]/div[1]/att-file-upload/div[3]/div/div[1]/form\r\n";
   String filedescription= "//*[@id=\"att-page-main\"]/div[1]/att-file-upload/div[3]/div/div[2]/textarea";
   String uploadfile="//*[@id=\"att-page-main\"]/div[1]/att-file-upload/div[3]/div/div[2]/span/button[1]";
   String toastfile ="//p[text()='The attachment was successfully uploaded.']";
   String profpage ="/html/body/ul/li[2]/a";
   String Attverify="//div[@ng-show=\"obsArray.length\"]";
   String recentvisit="//h3[text() = \"Recent Visits\"]";
   String endvisit ="/html/body/div[1]/div[3]/div[9]/div[3]/div/ul[1]/li[1]/a/div/div[2]";
   String confirmendvisit ="//*[@id=\"end-visit-dialog\"]/div[2]/button[1]";
   String vitals="referenceapplication.realTime.vitals";
   String height="w8";
   String nextbtn= "next-button";
   String weight ="w10";
   String bmi="calculated-bmi-wrapper";
   String savebtn="/html/body/div[1]/div[3]/div[3]/a[1]/i";
   String save1btn="/html/body/div[1]/div[3]/div[4]/form/div[2]/div/p[1]/button";
   String endvist1 ="/html/body/div[1]/div[3]/div[9]/div/div[1]/div[3]/div[1]/div[2]/a[1]";
   String confirmendvisiti1 ="//*[@id=\"end-visit-dialog\"]/div[2]/button[1]";
   String recentvisit1 ="/html/body/div[1]/div[3]/div[9]/div[1]/div/div[2]/div[1]/div[1]/h3";
   String profpage1 ="//a[contains(text(), 'Vasanth ')]";
   String visitcount ="/html/body/div[1]/div[3]/div[9]/div[1]/div/div[2]/div[1]/div[2]/visitbyencountertype/ul/li/a";
   String mergedata ="/html/body/div[1]/div[3]/div[9]/div[2]/div/ul/li[3]/a/div/div[2]";
   String merge2data="mergeVisitsBtn";
   String returnbtn="//*[@id=\"content\"]/form/div/input[1]";
   String addpastdate="//*[@id=\"org.openmrs.module.coreapps.createRetrospectiveVisit\"]/div/div[2]";
   String selectdate="//td[@class=\"day disabled\"]";
   String delpatient= "//*[@id=\"org.openmrs.module.coreapps.deletePatient\"]/div/div[2]";
   String delmsg= "delete-reason";
   String confrimdel= "//*[@id=\"delete-patient-creation-dialog\"]/div[2]/button[1]";
   String search = "//*[@id=\"patient-search\"]";
   String message="//*[@id=\"patient-search-results-table\"]/tbody/tr/td";
   String checkbox ="mergeVisits";
  
}
