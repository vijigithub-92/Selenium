package Assign1week;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leafground.com/pages/Button.html");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElementById("home").click();
		 driver.findElementByPartialLinkText("Button").click();
		 WebElement element = driver.findElementById("position");
		 Point point = element.getLocation();
		 int xcord = point.getX();
		 System.out.println("Position of the webelement from left side is "+xcord +" pixels");
		 int ycord = point.getY();
		 System.out.println("Position of the webelement from top side is "+ycord +" pixels");
		 WebElement color = driver.findElementById("color");
		 String col = color.getCssValue("color");
		 System.out.println("Button Color : "+col);
		 WebElement size = driver.findElementById("size");
		 Dimension button = size.getSize();
		 System.out.println("Button Size : "+button);
		 driver.close();

	}

}
