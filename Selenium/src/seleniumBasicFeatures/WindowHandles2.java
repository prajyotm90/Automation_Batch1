package seleniumBasicFeatures;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandles2 {

	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation_Batch1\\Automation_Batch1\\drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.naukri.com/");

		dr.manage().window().maximize();

		String parent = dr.getWindowHandle();

		Set<String> wins = dr.getWindowHandles(); // all the windows A, B, C, D

		for (String w : wins) {
			dr.switchTo().window(w);
			List<WebElement> ele = dr.findElements(By.xpath("//img[@alt='Cognizant']"));

			if (ele.size() > 0) {
				ele.get(0).click();
			}
		}

	}
}
