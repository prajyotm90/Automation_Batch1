package seleniumBasicFeatures;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstSeleniumClass {
	
	@Test
	public void launchBrowser() {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Batch1\\Automation_Batch1\\drivers\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		
		//Navigate to URL
		dr.get("https://www.flipkart.com/");
		dr.manage().window().maximize();
	}

}
