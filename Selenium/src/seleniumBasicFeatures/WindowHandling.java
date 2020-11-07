package seleniumBasicFeatures;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandling {

	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation_Batch1\\Automation_Batch1\\drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.naukri.com/");

		dr.manage().window().maximize();

		String parent = dr.getWindowHandle();

		Set<String> wins = dr.getWindowHandles();

		for (String w : wins) {
			if (w.equals(parent)) {

				System.out.println("You are on parent window");
			} else {
				dr.switchTo().window(w);
				dr.close();

			}
		}
		dr.switchTo().window(parent);
	}
}
