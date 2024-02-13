package pageObjects;

public interface HomePageElements {

	 String registerpatient = "referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension";
	 String patientname ="givenName";
	 String middlename ="middleName";
	 String lastname = "familyName";
	 String nextpage ="next-button";
	 String gender =" //option[text()='Female']";
	 String bdate= "birthdateDay-field";
	 String bmonth ="//option[text() =\"January\"]";
	 String byear="birthdateYear-field";
	 String Address= "address1";
	 String City="cityVillage";
	 String state="stateProvince";
	 String country ="country";
	 String postalcode ="postalCode";
	 String phno="phoneNumber";
	 String confirmbtn ="confirmation_label";
	 String  Vname="//*[@id=\"dataCanvas\"]/div/p[1]\r\n";
	 String Vgender ="//*[@id=\"dataCanvas\"]/div/p[2]";
	 String vdob ="//*[@id=\"dataCanvas\"]/div/p[3]";
	 String vaddress ="<p><span class=\"title\">Address: </span>rt, yy, ryy, ryyy, ryy, ryy</p>";
	 String vphno ="//*[@id=\"dataCanvas\"]/div/p[5]";
	 String savebtn= "submit";
	 String agecal ="//*[@id=\"content\"]/div[6]/div[1]/div/div[2]/span[2]";
	 
}
