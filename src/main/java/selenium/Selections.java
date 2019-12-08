package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public final class Selections {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://erail.in/");
		 driver.findElementById("txtStationFrom").clear();
		 driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		 driver.findElementById("txtStationTo").clear();
		 driver.findElementById("txtStationTo").sendKeys("NMKL",Keys.TAB);
		 driver.findElementById("chkSelectDateOnly").click();
		 WebElement train = driver.findElementByXPath("//table[contains(@class,'DataTable TrainList')]");
		 List<WebElement> allRows = train.findElements(By.tagName("tr"));
		 System.out.println(allRows.size());
		 //driver.close();
		 
		 /*driver.findElementById("username").sendKeys("DemoSalesManager");
		 driver.findElementById("password").sendKeys("crmsfa");
		 driver.findElementByClassName("decorativeSubmit").click();
		 driver.findElementByLinkText("CRM/SFA").click();
		 driver.findElementByLinkText("Create Lead").click();
		 driver.findElementById("createLeadForm_companyName").sendKeys("iTech");
		 driver.findElementById("createLeadForm_firstName").sendKeys("Viji");
		 driver.findElementById("createLeadForm_lastName").sendKeys("Kiruba");
		 driver.findElementByClassName("smallSubmit").click();
		 String title = driver.getTitle();
		 System.out.println(title);*/
	}
}
