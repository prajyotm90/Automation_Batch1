package basicFunctions;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersConcept {
	
	@Test
	@Parameters("browser")
	public void launchBrowser(String br) {
		System.out.println("Launch Firefox browser");
		System.out.println("Launch "+br+" browser");
	}
	
	

}

