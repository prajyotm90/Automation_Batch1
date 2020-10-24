package basicFunctions;

import org.testng.annotations.Test;

public class DependOnMethodConcept2 {
	@Test
	public void launchBrowser() {
		System.out.println("Launch browser");
		System.out.println(10/0);
	}

	@Test(dependsOnMethods="launchBrowser")
	public void login() {
		System.out.println("Login");
	}

	@Test(dependsOnMethods="login")
	public void verifyHomePage() {
		System.out.println("Homepage");

		
	}
	

	@Test(dependsOnMethods="login", priority=1)
	public void logout() {
		System.out.println("logout");
	}

}
