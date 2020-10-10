package eodValidations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing2 {
	@Test
	public void test1() {
		System.out.println("Test case in testing2 eod");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method testing2 eod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After method testing2 eod");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class testing2 eod");
	}

	@Test
	public void test2() {
		System.out.println("Test case 2 in testing2 class eod");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class testing2 eod");
	}

}
