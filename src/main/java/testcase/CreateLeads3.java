package testcase;

//import java.io.IOException;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
import org.testleaf.leaftaps.base.ProjectSpecificMethods;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
//import org.testng.Assert;
//import org.junit.Assert; 
import org.testng.annotations.Test;
//import org.testng.asserts.Assertion;

public class CreateLeads3 extends ProjectSpecificMethods{
	@BeforeTest
	public void setData() {
		excelFileName = "CreateLead";
	}
	@Test(dataProvider="sendData")
	public void lead(String cName, String fName, String lName) throws InterruptedException {
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click(); //this correct one
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		Thread.sleep(2000);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		Thread.sleep(2000);
		driver.findElementByName("submitButton").click();
		
		
		
		
}
	/*@DataProvider
	public String[][] sendData() throws IOException {
		// TODO Auto-generated method stub
		/*String[][] data = new String[2][3];
		data[0][0] = "TestLeaf";
		data[0][1] = "Sam";
		data[0][2] = "Lazarus";
		
		data[1][0] = "Testleaf";
		data[1][1] = "Viji";
		data[1][2] = "Kiruba";
		
		return data;
		
		LearnExcel1 excel = new LearnExcel1();
		return excel.readExcel("CreateLead");
		*/
	}








