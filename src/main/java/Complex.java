import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import cucumber.api.java.it.Date;
//import org.openqa.selenium.chrome.ChromeOptions;

public class Complex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();

		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("https://www.zoomcar.com/chennai");
		 driver.findElementByXPath("//a[@class='search']").click();
		 driver.findElementByXPath("(//div[@class='items'])[3]").click();
		 driver.findElementByClassName("proceed").click();
		 //Date date = new Date();
		 
		 //driver.findElementByPartialLinkText("Mon").click();
		 driver.findElementByPartialLinkText("Next").click();
		 driver.findElementByPartialLinkText("Done").click();
		 WebElement a = driver.findElementByClassName("car-listing");
		 a.getSize();
		 System.out.println(a);
		 
		// driver.get("https://acme-test.uipath.com/acount/login");
	}

}
