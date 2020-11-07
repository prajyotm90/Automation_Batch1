package seleniumBasicFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FunctionLibrary {
	public WebDriver launchBrowser(String browserName) {
		WebDriver dr = null;
		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\Automation_Batch1\\Automation_Batch1\\drivers\\chromedriver.exe");
			dr=new ChromeDriver();
		}else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver","D:\\Automation_Batch1\\Automation_Batch1\\drivers\\msedgedriver.exe");
			dr=new EdgeDriver();
		}else if(browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\Automation_Batch1\\Automation_Batch1\\drivers\\geckodriver.exe");
			dr=new FirefoxDriver();
		}
		return dr;
	}
}
