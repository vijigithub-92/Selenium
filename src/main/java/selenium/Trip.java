package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public final class Trip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.cleartrip.com");
		 //driver.findElementById("txtStationFrom").clear();
		 driver.findElementById("FromTag").sendKeys("MAA",Keys.TAB);
		 //driver.findElementById("txtStationTo").clear();
		 driver.findElementById("ToTag").sendKeys("NYC",Keys.TAB);
		 WebElement dropdown = driver.findElementByName("adults");
		 Select sel = new Select(dropdown);
		 sel.selectByValue("2");
		 WebElement child = driver.findElementByName("childs");
		 Select sels = new Select(child);
		 sels.selectByValue("1");
		 driver.findElementById("SearchBtn").click();
		 String errors = driver.findElementById("homeErrorMessage").getText();
		 System.out.println(errors);
		 
		 
		/* driver.findElementById("chkSelectDateOnly").click();
		 WebElement train = driver.findElementByXPath("//table[contains(@class,'DataTable TrainList')]");
		 List<WebElement> allRows = train.findElements(By.tagName("tr"));
		 System.out.println(allRows.size());
		 driver.close();*/
		 
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
