package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printalloptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://erail.in/");
		 String label=driver.findElement(By.id("cmbQuota")).getText();
		 System.out.println("List of Quota's in Erail site :");
		 System.out.println(label);
		 String lab=driver.findElement(By.id("selectClassFilter")).getText();
		 System.out.println("List of Class in Erail site :");
		 System.out.println(lab);
		 driver.close();
	}
}
