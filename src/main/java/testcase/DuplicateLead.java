package testcase;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;
import org.testng.annotations.Test;

public class DuplicateLead extends ProjectSpecificMethods {
	@Test
	public void duplic() throws InterruptedException  {
		//login();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		driver.findElementByName("submitButton").click();
	//	driver.close();
}
}






