package seleniumBasicFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Elements_Button {
	
	FunctionLibrary lib=new FunctionLibrary();
	
	@Test
	@Parameters("browser")
	public void test1(String browser) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver", "D:\\Automation_Batch1\\Automation_Batch1\\drivers\\chromedriver.exe");
	WebDriver dr=lib.launchBrowser(browser);
	
	//Navigate to URL
	dr.get("https://demoqa.com/buttons");
	
	//how to maximize the window
	dr.manage().window().maximize();
	
	
	
	  WebElement btn=dr.findElement(By.xpath("//button[text()='Click Me']"));
	  btn.click();
	  Thread.sleep(4000);
	  dr.close();
	  
	 
	}

}
