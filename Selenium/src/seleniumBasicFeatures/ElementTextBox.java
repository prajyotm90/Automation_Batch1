package seleniumBasicFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElementTextBox {
	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Batch1\\Automation_Batch1\\drivers\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		
		//Navigate to URL
		dr.get("https://demoqa.com/text-box");
		
		//how to maximize the window
		dr.manage().window().maximize();
		
		WebElement value=dr.findElement(By.xpath("//input[@id='userName']"));
		value.sendKeys("Prajyot Mhalaskar");
		Thread.sleep(3000);
		value.clear();
		Thread.sleep(3000);
		value.sendKeys("Anil Dabhane");
		
		
		
	}

}
