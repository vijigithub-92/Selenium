package testcase;

//import org.openqa.selenium.WebElement;
import org.testleaf.leaftaps.base.ProjectSpecificMethods;
import org.testng.annotations.DataProvider;
//import org.testng.Assert;
//import org.junit.Assert; 
import org.testng.annotations.Test;
//import org.testng.asserts.Assertion;

public class CreateLeads2  extends ProjectSpecificMethods{
	
	@Test(dataProvider="sendData")
	public void lead(String cName, String fName, String lName) {
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click(); //this correct one
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByName("submitButton").click();
		
		
		
		
}
	@DataProvider
	public String[][] sendData() {
		// TODO Auto-generated method stub
		String[][] data = new String[2][3];
		data[0][0] = "TestLeaf";
		data[0][1] = "Sam";
		data[0][2] = "Lazarus";
		
		data[1][0] = "Testleaf";
		data[1][1] = "Viji";
		data[1][2] = "Kiruba";
		
		return data;
		
	}
}






