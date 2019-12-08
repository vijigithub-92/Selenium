package Assign1week;

//import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createlead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.findElementById("username").sendKeys("DemoSalesManager");
		 driver.findElementById("password").sendKeys("crmsfa");
		 driver.findElementByClassName("decorativeSubmit").click();
		 driver.findElementByLinkText("CRM/SFA").click();
		 driver.findElementByLinkText("Create Lead").click();
		 driver.findElementById("createLeadForm_companyName").sendKeys("iTech");
		 driver.findElementById("createLeadForm_firstName").sendKeys("Vijayalakshmi");
		 driver.findElementById("createLeadForm_lastName").sendKeys("Kirubanandhan");
		 driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Viji");
		 driver.findElementById("createLeadForm_lastNameLocal").sendKeys("kiruba");
		 driver.findElementById("createLeadForm_personalTitle").sendKeys("Welcome!");
		 
		 
		 Select listboxs = new Select(driver.findElement(By.xpath("(//select[@class='inputBox'])[1]")));
		 listboxs.selectByVisibleText("Employee");
		 
		 driver.findElementById("createLeadForm_generalProfTitle").sendKeys("World");
		 driver.findElementById("createLeadForm_annualRevenue").sendKeys("4.23L");
		 
		 Select listbox = new Select(driver.findElement(By.xpath("(//select[@class='inputBox'])[4]")));
		 listbox.selectByVisibleText("Computer Software");
		 
		 Select listb = new Select(driver.findElement(By.xpath("(//select[@class='inputBox'])[5]")));
		 listb.selectByVisibleText("Partnership");
		 
		 driver.findElementById("createLeadForm_sicCode").sendKeys("6528");
		 driver.findElementById("createLeadForm_description").sendKeys("Good Day to All!");
		 
		 driver.findElementById("createLeadForm_importantNote").sendKeys("Be Calm!");
		 
		 driver.findElementById("createLeadForm_primaryPhoneCountryCode").clear();
		 driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("11");
		 
		 driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("10");
		 
		 driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("+91");
		 
		 driver.findElementById("createLeadForm_departmentName").sendKeys("Testing");
		 
		 Select lists = new Select(driver.findElement(By.xpath("(//select[@class='inputBox'])[3]")));
		 lists.selectByVisibleText("INR - Indian Rupee");
		 
		 driver.findElementById("createLeadForm_numberEmployees").sendKeys("005");
		 
		 driver.findElementById("createLeadForm_tickerSymbol").sendKeys("FNB");
		 
		 driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("viji");
		 
		 driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("http://leaftaps.com/opentaps/control/main");
		 
		 driver.findElementById("createLeadForm_generalToName").sendKeys("Vijikiruba");
		 
		 driver.findElementById("createLeadForm_generalAddress1").sendKeys("No.3 Water tank st");
		 
		 driver.findElementById("createLeadForm_generalAddress2").sendKeys("No.1 Karumara st");
		 
		 driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		 
		 Select train = (Select) driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		 train.selectByVisibleText("Indiana");
		 
		 driver.findElementById("createLeadForm_generalPostalCode").sendKeys("605221");
		 
		 driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("221");
		 
		 Select lis = new Select(driver.findElement(By.xpath("(//select[@class='inputBox'])[2]")));
		 lis.selectByVisibleText("Catalog Generating Marketing Campaigns");

		 driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("925605221");
		 
		 driver.findElementById("createLeadForm_primaryEmail").sendKeys("vijikiruba@gmail.com");
		 
		 driver.findElementByClassName("smallSubmit").click();

		 //driver.findElementByClassName("smallSubmit").click();
		 //String title = driver.getTitle();
		// System.out.println(title);
		// driver.close();

	}

}
