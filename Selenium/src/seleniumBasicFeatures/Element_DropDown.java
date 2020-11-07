package seleniumBasicFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Element_DropDown {
	
	@Test
	public void test1(){
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Batch1\\Automation_Batch1\\drivers\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		
		dr.get("http://sampleapp.tricentis.com/101/app.php");
		
		dr.manage().window().maximize();
		
		WebElement make=dr.findElement(By.xpath("//select[@id='make']"));
		
		Select sel=new Select(make);
		 sel.selectByValue("Ford");
	}

}
