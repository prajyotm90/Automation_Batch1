package basicFunctions;

import org.testng.annotations.Test;

public class Testing {
	@Test(priority=1)
	public void test2() {
		System.out.println("In test1");
	}
	
	@Test
	public void test1() {
		System.out.println("In test2");
	}
	
	@Test
	public void test3() {
		System.out.println("In test3");
		
	}

}
