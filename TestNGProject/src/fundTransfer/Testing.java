package fundTransfer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing {

	@BeforeTest
	public void beforePaymentModule() {
		System.out.println("");
		System.out.println("");
		System.out.println("FTFTFTFTFTFTFTFTFTFTFT");
		System.out.println("");
		System.out.println("Before FT module");
	}

	@AfterTest
	public void afterPaymentModule() {
		System.out.println("After FT module");
	}

	@Test
	public void test1() {
		System.out.println("Test case 1 FT");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method FT");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After method FT");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class FT");
		System.out.println("********************");
	}

	@Test
	public void test2() {
		System.out.println("Test case 2 FT");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class FT");
	}

}
