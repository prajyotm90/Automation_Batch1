package seleniumBasicFeatures;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Element_WebTables {
	@Test
	public void test1() {
	System.setProperty("webdriver.chrome.driver","D:\\Automation_Batch1\\Automation_Batch1\\drivers\\chromedriver.exe");
	ChromeDriver dr = new ChromeDriver();
	dr.get("https://www.w3schools.com/html/html_tables.asp");	
	
	List<WebElement> rows=dr.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
	
	for(int r=2; r<=rows.size(); r++)
	{
		List<WebElement> cols=dr.findElements(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td"));
		for(int c=1; c<=cols.size(); c++)
		{
			WebElement ele=dr.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td["+c+"]"));
			
			System.out.println(ele.getText());
		}
	}
	}
}

	/*// Navigate to URL
	dr.get("https://www.w3schools.com/html/html_tables.asp");

	// how to maximize the window
	dr.manage().window().maximize();
	
	//number of rows in webtable
	List<WebElement> rows=(List<WebElement>) dr.findElement(By.xpath("//table[@id='customers']/tbody/tr"));
	
	
	//data is coming from row no 2 hence we start from r=2
	for(int r=2;r<=rows.size();r++) {
		List<WebElement> cols=(List<WebElement>) dr.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td"));
		for(int c=1;c<cols.size();c++) {
			WebElement ele=dr.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td["+c+"]"));
			System.out.println(ele.getText());
		}
	}
	
	
	
	}
	

}
*/