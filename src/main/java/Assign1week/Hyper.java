package Assign1week;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leafground.com/pages/Link.html");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.findElementByPartialLinkText("Go to Home Page").click();
		 driver.findElementByPartialLinkText("HyperLink").click();
		 
		 WebElement element = driver.findElementByPartialLinkText("Find where am supposed to go without clicking me?");
		 String locs = element.getAttribute("href");
		 System.out.println("Here we go : "+locs);
		 
		 WebElement ink = driver.findElementByXPath("//a[@href='error.html']");
			
			List<WebElement> lin = ink.findElements(By.tagName("a"));
			
			for(int i=0;i<lin.size();i++)
			{
				
				WebElement ele= lin.get(i);
				
				String url=ele.getAttribute("href");
				
				verifyLinkActive(url);
				
			}
		 
		 WebElement link = driver.findElementByXPath("(//a[@link='blue'])[1]");
		 link.click();
		 driver.findElementByPartialLinkText("HyperLink").click();
		 
		 WebElement hlink = driver.findElementByXPath("//div[@id='contentblock']//section[1]");
		 
		 
		 java.util.List<WebElement> links = hlink.findElements(By.tagName("a"));
		 
		 System.out.println("Total links are "+links.size());

			System.out.println(links.size());

			for (int i = 0; i<=links.size(); i=i+1)

			{

				System.out.println(links.get(i).getText());

			}
			
			
		}
		
		public static void verifyLinkActive(String linkUrl)
		{
	        try 
	        {
	           URL url = new URL(linkUrl);
	           
	           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
	           
	           httpURLConnect.setConnectTimeout(3000);
	           
	           httpURLConnect.connect();
	           
	           if(httpURLConnect.getResponseCode()==200)
	           {
	               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
	            }
	          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
	           {
	               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
	            }
	        } catch (Exception e) {
	           
	        }
	    } 
}
