package seleniumBasicFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.annotations.Test;

public class MouseHover {
	@Test
	public void test() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\Automation_Batch1\\Automation_Batch1\\drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();

		// Navigate to URL
		dr.get("https://www.flipkart.com/");

		// how to maximize the window
		dr.manage().window().maximize();
		
		//closed login page
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		
		//double click, mouse hover, right click, drag and drop
		Actions act=new Actions(dr);
		
		//Mouse hover on Men
		WebElement ele=dr.findElement(By.xpath("//span[text()='Men']"));
		
		act.moveToElement(ele).build().perform();
		
		
		//Click on jeans in mens section
		dr.findElement(By.xpath("//a[text()='Jeans']")).click();
		
		Thread.sleep(3000);
		//drag and drop operation. Create x and y coordinate at pricve. It works on pixel
		WebElement drag=dr.findElement(By.xpath("//div[@class='_3G9WVX oVjMho']/div[@class='_3aQU3C']"));
		act.dragAndDropBy(drag, 50, 0).build().perform();
		
		Thread.sleep(3000);
		dr.close();

}
}
