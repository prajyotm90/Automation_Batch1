package payment;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}

	@BeforeTest
	public void beforePaymentModule() {
		System.out.println("Before payment module");
	}

	@AfterTest
	public void afterPaymentModule() {
		System.out.println("After payment module");
	}

	@Test
	public void test1() {
		System.out.println("Test case 1");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class");
		System.out.println("********************");
	}

	@Test
	public void test2() {
		System.out.println("Test case 2");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}

}
