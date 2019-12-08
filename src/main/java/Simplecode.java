//import java.awt.Desktop.Action;
//import java.util.ArrayList;
//import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Simplecode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();

		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("https://acme-test.uipath.com/account/login");
	//	 String oldTab = driver.getWindowHandle();
		 WebElement a = driver.findElementByXPath("(//input[@class='form-control'])");
		 a.sendKeys("kumar.testleaf@gmail.com");
		 a.sendKeys(Keys.TAB);
		 Thread.sleep(2000);
		 WebElement b = driver.switchTo().activeElement();
		 b.sendKeys("leaf@12");
		 
		 driver.findElementByXPath("//button[@class='btn btn-primary']").click();
		 WebElement searchBtn = driver.findElementByXPath("//button[text()=' Vendors']");

		 Actions action = new Actions(driver);
		 action.moveToElement(searchBtn).perform();
		 driver.findElementByXPath("//a[text()='Search for Vendor']").click();
		 driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		 driver.findElementById("buttonSearch").click();
		 
		  //List<WebElement>  row = driver.findElements(By.xpath(".//*[@class=\"table\"]/table/tbody/tr[1]/th[1]"));
		  //System.out.println(row.size());
		  
		// a.sendKeys(Keys.ENTER);
		
		
//		    //driver.findElement(By.linkText("Twitter Advertising Blog")).click();
//		    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
//		    newTab.remove(oldTab);
//		    // change focus to new tab
//		    driver.switchTo().window(newTab.get(0));
//		    //assertAdvertisingBlog();


		 
		 
		 
		 //a.sendKeys("leaf@12");
//		 Actions builder = new Actions(driver);
//		 Action seriesOfActions = builder.keyDown(Keys.TAB).sendKeys("leaf@12").keyUp(Keys.ENTER).perform();
//		 	.click()
//		 	.keyDown(txtUsername, Keys.SHIFT)
//		 	.sendKeys(txtUsername, "hello")
//		 	.keyUp(txtUsername, Keys.SHIFT)
//		 	.doubleClick(txtUsername)
//		 	.contextClick()
//		 	.build();
//		 	
//		 seriesOfActions.perform() ;

	}

}
