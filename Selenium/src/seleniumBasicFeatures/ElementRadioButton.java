package seleniumBasicFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElementRadioButton {
	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Batch1\\Automation_Batch1\\drivers\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		
		//Navigate to URL
		dr.get("https://demoqa.com/radio-button");
		
		//how to maximize the window
		dr.manage().window().maximize();
		
		dr.findElement(By.xpath("//label[@for='yesRadio']")).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//label[@for='impressiveRadio']")).click();
		Thread.sleep(3000);
		dr.close();
	}
}
