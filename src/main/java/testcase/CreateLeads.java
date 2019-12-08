package testcase;

//import org.openqa.selenium.WebElement;
import org.testleaf.leaftaps.base.ProjectSpecificMethods;
//import org.testng.Assert;
//import org.junit.Assert; 
import org.testng.annotations.Test;
//import org.testng.asserts.Assertion;

public class CreateLeads  extends ProjectSpecificMethods{
	
	@Test
	public void lead() {
		//Assert.assertFalse(true); 
		//login();
		//private static WebElement element = null;
		driver.findElementByLinkText("Leads").click();
		//driver.findElementByLinkText("Create Lead1").click(); // this wrong one
		//String result = null;
       /* WebElement element = driver.findElementByLinkText("Create Lead1").click();
        if(element != null)
            result = element.getText();

        Assert.assertTrue(result.equals("RED") || result.equals("BLUE")); */
		driver.findElementByLinkText("Create Lead").click(); //this correct one
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
		driver.findElementById("createLeadForm_lastName").sendKeys("J");
		driver.findElementByName("submitButton").click();
		//Assert.assertEquals(false,driver);
		//AssertNotEquals(false,true,message);  
	//	driver.close();
}
}






