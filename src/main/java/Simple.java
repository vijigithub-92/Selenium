//import org.openqa.selenium.Alert;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.Select;

public class Simple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		 ChromeDriver driver = new ChromeDriver(option);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		 
		// driver.get("https://acme-test.uipath.com/account/login");
		 driver.get("https://www.facebook.com/");
		 WebElement sel = driver.findElementByXPath("(//*[@class='inputtext login_form_input_box'])[1]");
		 sel.sendKeys("n.kirubanandhan@gmail.com");
		 WebElement sel2 = driver.findElementByXPath("(//*[@class='inputtext login_form_input_box'])[2]");
		 sel2.sendKeys("Kiruba@90");
		 driver.findElementByXPath("//input[@data-testid='royal_login_button']").click();
		 
		 WebElement cel = driver.findElementByXPath("//input[@data-testid='search_input']");
		 cel.sendKeys("testleaf solutions");
		 Thread.sleep(3000);
		 driver.findElementByXPath("//button[@data-testid='facebar_search_button']").click();
		 //{"ct":"like_page"}
		 driver.findElementByXPath("//button[@class='_42ft _4jy0 PageLikedButton _52nf PageLikeButton _4jy3 _517h _51sy']").click();
		 String a = driver.findElementByXPath("//button[@class='_42ft _4jy0 PageLikedButton _52nf PageLikeButton _4jy3 _517h _51sy']").getText();
		 if(a.equalsIgnoreCase("Liked")) {
			 System.out.println("Already like the page Test Leaf");
		 }
		 else
		 {
			 System.out.println("Have to like the page Test Leaf");
		 }
		/*
		 * Select ses = (Select)
		 * driver.findElementByXPath("//button[@data-bt='{\"ct\":\"like_page\"}']");
		 * ses.se
		 */
		 
		 
		 
		 
		 
	}

}
