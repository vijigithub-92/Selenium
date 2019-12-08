package org.testleaf.leaftaps.base;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethods{
	@Test	@Ignore
	public void runCreateLead() {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead1").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
		driver.findElementById("createLeadForm_lastName").sendKeys("J");
		driver.findElementByName("submitButton").click();
		
}

}





