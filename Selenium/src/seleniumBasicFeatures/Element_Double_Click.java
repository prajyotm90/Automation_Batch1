package seleniumBasicFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Element_Double_Click {
	@Test
	public void test() {

		System.setProperty("webdriver.chrome.driver","D:\\Automation_Batch1\\Automation_Batch1\\drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();

		// Navigate to URL
		dr.get("https://demoqa.com/buttons");

		// how to maximize the window
		dr.manage().window().maximize();
		
		
		//double click, mouse hover, right click, drag and drop
		Actions act=new Actions(dr);
		WebElement ele=dr.findElement(By.xpath("//button[text()='Double Click Me']"));
		
		act.doubleClick(ele).build().perform();
		
		dr.close();

	}
	
}
