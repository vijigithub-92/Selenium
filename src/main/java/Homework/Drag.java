package Homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leafground.com/pages/drop.html");
		 driver.manage().window().maximize();
		 WebElement drag = driver.findElementById("draggable");
		 WebElement drop  = driver.findElementById("droppable");
		 Actions builder = new Actions(driver);
		 builder.dragAndDrop(drag, drop).perform();
	}

}
