package seleniumBasicFeatures;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoQa {
	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Batch1\\Automation_Batch1\\drivers\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		
		//Navigate to URL
		dr.get("https://demoqa.com/links");
		
		//how to maximize the window
		dr.manage().window().maximize();
		
		//click on Home
		//WebElement ele=dr.findElement(By.id("simpleLink")); or use below xpath
		WebElement ele=dr.findElement(By.xpath("//a[@id='simpleLink']"));
		
		//Validate text --> Home
		Assert.assertEquals(ele.getText(), "Home");
		String parent=dr.getWindowHandle();
		
		//getWindowHandles will return ids of all windows open at that time in form of Set
		Set<String> wins=dr.getWindowHandles();
		
		//count of windows open
		int numOfWindows=wins.size();
		System.out.println("Number of windows open before click: "+numOfWindows);
		
		//verify link is working
		ele.click();
		
		wins=dr.getWindowHandles();
		
		//count of windows after clicking on Home 
		int numOfWindowsAfterClick=wins.size();
		System.out.println("Number of windows open after click: "+numOfWindowsAfterClick);
		
		Assert.assertEquals(numOfWindowsAfterClick, numOfWindows+1);
		
		for(String w:wins) {
			if(!w.equals(parent)) {
				dr.switchTo().window(w);
			}
		}
		
		  WebElement xp=dr.findElement(By.xpath("//img[@class='banner-image']"));
		  xp.click();
		 
				
	}
		

}
