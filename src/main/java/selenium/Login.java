package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public final class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.findElementById("username").sendKeys("DemoSalesManager");
		 driver.findElementById("password").sendKeys("crmsfa");
		 driver.findElementByClassName("decorativeSubmit").click();
		 driver.findElementByLinkText("CRM/SFA").click();
		 driver.findElementByLinkText("Create Lead").click();
		 driver.findElementById("createLeadForm_companyName").sendKeys("iTech");
		 driver.findElementById("createLeadForm_firstName").sendKeys("Viji");
		 driver.findElementById("createLeadForm_lastName").sendKeys("Kiruba");
		 driver.findElementByClassName("smallSubmit").click();
		 String title = driver.getTitle();
		 System.out.println(title);
		// driver.close();
	}
}
