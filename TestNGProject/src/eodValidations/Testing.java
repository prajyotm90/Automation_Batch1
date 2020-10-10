package eodValidations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing {

	@BeforeTest
	public void beforeEODModule() {
		
		System.out.println("Before eod module");
	}

	@AfterTest
	public void afterEODModule() {
		System.out.println("After eod module");
	}

	@Test
	public void test1() {
		System.out.println("Test case 1 eod");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method eod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After method eod");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class eod");
		System.out.println("********************");
	}

	@Test
	public void test2() {
		System.out.println("Test case 2 eod");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class eod");
	}

}
