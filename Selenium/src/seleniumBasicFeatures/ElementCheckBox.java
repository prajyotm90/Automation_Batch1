package seleniumBasicFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElementCheckBox {
	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Batch1\\Automation_Batch1\\drivers\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		
		//Navigate to URL
		dr.get("https://demoqa.com/checkbox");
		
		//how to maximize the window
		dr.manage().window().maximize();
		
		dr.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
		
		
		dr.findElement(By.xpath("//button[@title='Toggle']")).click();
		dr.findElement(By.xpath("//label[@for='tree-node-documents']/span[@class='rct-checkbox']")).click();
		dr.close();
	}
}
