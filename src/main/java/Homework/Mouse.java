package Homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 driver.findElementByXPath("(//div[@class='_3Njdz7']//button)[1]").click();
		 WebElement electronics = driver.findElementByXPath("//*[text()='Electronics']");
		 Actions builder = new Actions(driver);
		 builder.moveToElement(electronics).perform();
		 Thread.sleep(5000);
		 driver.findElementByLinkText("Mi").click(); 
	}

}
