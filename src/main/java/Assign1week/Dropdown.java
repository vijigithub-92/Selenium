package Assign1week;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leafground.com/pages/Dropdown.html");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Select listbox = new Select(driver.findElement(By.xpath("(//div[@class='example']//select)[1]")));
		 listbox.selectByIndex(1);
		 Select listboxs = new Select(driver.findElement(By.xpath("(//div[@class='example']//select)[2]")));
		 listboxs.selectByVisibleText("UFT/QTP");
		
		 Select list = new Select(driver.findElement(By.xpath("(//div[@class='example']//select)[3]")));
		 list.selectByValue("2");
		 
		 Select lis = new Select(driver.findElement(By.xpath("(//div[@class='example']//select)[4]")));
	        //Get all the option from dropdown list and assign into List
	        List<WebElement> listOptionDropdown = lis.getOptions();
	       
	        // Count the item dropdown list and assign into integer variable
	        int dropdownCount = listOptionDropdown.size();
	       
	        //Print the total count of dropdown list using integer variable
	        System.out.println("Total Number of item count in dropdown list = "  + dropdownCount);     
	        
			 WebElement menu = driver.findElement(By.xpath("(//div[@class='example']//select)[5]"));
			 menu.sendKeys("Loadrunner");
			 
			 
			 Select drop = new Select(driver.findElement(By.xpath("(//div[@class='example']//select)[6]")));
			 drop.selectByValue("3");
		 
		 //

	}

}
