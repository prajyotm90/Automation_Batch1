package reports;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing {

	@BeforeTest
	public void beforeReportsModule() {
		System.out.println("Before reports module");
	}

	@AfterTest
	public void afterReportsModule() {
		System.out.println("After reports module");
	}

	@Test
	public void test1() {
		System.out.println("Test case 1 reports");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method reports");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After method reports");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class reports");
		System.out.println("********************");
	}

	@Test
	public void test2() {
		System.out.println("Test case 2 reports");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class reports");
	}

}
