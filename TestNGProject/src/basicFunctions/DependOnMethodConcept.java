package basicFunctions;

import org.testng.annotations.Test;

public class DependOnMethodConcept {
	@Test(priority=0)
	public void launchBrowser() {
		System.out.println("Launch browser");
		System.out.println(10/0);
	}

	@Test(priority=1)
	public void login() {
		System.out.println("Login");
	}

	@Test(priority=2)
	public void verifyHomePage() {
		System.out.println("Homepage");

	}

	@Test(priority=3)
	public void logout() {
		System.out.println("logout");
	}

}
