package seleniumBasicFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkElement {
	
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Batch1\\Automation_Batch1\\drivers\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		
		//Navigate to URL
		dr.get("http://sampleapp.tricentis.com/101/index.php");
		
		//how to maximize the window
		dr.manage().window().maximize();
		
		//click on Automobile
		String text=dr.findElement(By.id("nav_automobile")).getText();
		System.out.println(text);
		
		dr.findElement(By.id("nav_automobile")).click();
		
		
	}

}
