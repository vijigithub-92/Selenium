package Homework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifycbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leafground.com/pages/checkbox.html");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		 for(int i=0;i<checkBoxes.size();i++) {
			 if(checkBoxes.get(i).isSelected()) {
				 System.out.println("Checkbox "+i+": Selected");
			 }
		 }
		driver.close();

	}

}
