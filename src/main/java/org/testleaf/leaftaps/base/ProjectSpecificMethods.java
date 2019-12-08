package org.testleaf.leaftaps.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Parameters;

import testcase.LearnExcel1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class ProjectSpecificMethods{
	public ChromeDriver driver;
	public String excelFileName;

	@Parameters({"url","uName","password"})
	@BeforeMethod
	public void login(String URL, String userName, String pass) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(userName);
		driver.findElementById("password").sendKeys(pass);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@AfterMethod
	public void logout()
	{
		driver.close();
	}
	
	@DataProvider
	public String[][] sendData() throws IOException {
		// TODO Auto-generated method stub
				
		LearnExcel1 excel = new LearnExcel1();
		return excel.readExcel(excelFileName);
		
	}
}