import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
		 driver.switchTo().frame("iframeResult");
		 driver.findElementByXPath("//button[text()='Try it']").click();
		 Set<String> windowHandles = driver.getWindowHandles();
		 List<String> winbro = new ArrayList<String>();
		 winbro.addAll(windowHandles);
		 winbro.get(1);
		 driver.switchTo().window(winbro.get(1));
		 System.out.println("Title :"+driver.getTitle());

	}

}
