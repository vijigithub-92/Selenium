import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trainlist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://erail.in/trains-between-stations/new-delhi-NDLS/mumbai-central-BCT");
		 String max;
		//driver.findElementByXPath("(//input[@type='button'])[1]").click();
		 List<WebElement>  col = driver.findElements(By.xpath(".//*[@id=\"divTrainsListHeader\"]/table/tbody/tr/td"));
	        System.out.println("No of cols are : " +col.size()); 
	        
	        List<WebElement>  row = driver.findElements(By.xpath(".//*[@id=\"divTrainsList\"]/table[1]/tbody/tr/td[2]/a"));
	        System.out.println("No of rows are : " +row.size()); 
	        int j = row.size();
	        //String a = driver.findElement(By.xpath(".//*[@id=\\\"divTrainsList\\\"]/table[1]/tbody/tr[1]/td[2]/a")).getText();
	        for (int i =0;i<j;i++)
	        {    
	        	Thread.sleep(3000);
	            max= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/table[1]/tbody/tr[" + (i+1)+ "]/td[2]/a")).getText();
	            Set<String> sel = new TreeSet<String>();
	            for(String each:sel) { System.out.println(each); 
			/*
			 * Boolean b = sel.add(max); for(String each:sel) { System.out.println(each);
			 * if(max==each) { System.out.println("matched"); } }
			 */
			/*
			 * if(b==true) { System.out.println(); }
			 */
	            System.out.println(max);
	        
	        }
	        
		/*
		 * Set<String> set = new TreeSet<String>(); System.out.println(set.g);
		 */
	        
	      
	        //System.out.println("No of cols are : " +col.length());
	        //No.of rows 
		
		/*
		 * List rows =
		 * wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		 * System.out.println("No of rows are : " + rows.size());
		 * driver.findElementByXPath();
		 */
		 
	}

}
