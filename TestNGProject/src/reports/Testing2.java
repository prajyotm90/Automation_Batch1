package reports;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing2 {
	@Test
	public void test1() {
		System.out.println("Test case in testing2 reports");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method testing2 reports");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After method testing2 reports");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class testing2 reports");
	}

	@Test
	public void test2() {
		System.out.println("Test case 2 in testing2 class reports");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class testing2 reports");
	}

}
