package selenium;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		 driver.switchTo().frame("iframeResult");
		 driver.findElementByXPath("//button[text()='Try it']").click();
		 //org.openqa.selenium.Alert alertText = driver.switchTo().alert();
		 
		 driver.switchTo().alert().sendKeys("Viji");
		 driver.switchTo().alert().accept();
		// driver.switchTo().alert().getText();
		 String a = driver.findElementById("demo").getText();
		 if(a.contains("Viji"))
		 {
			 System.out.println("Name is verified");
		 }
		 else
		 {
			 System.out.println("Name not found");
		 }
		 

	}

}
