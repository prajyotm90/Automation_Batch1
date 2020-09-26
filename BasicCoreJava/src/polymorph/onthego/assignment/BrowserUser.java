package polymorph.onthego.assignment;

public class BrowserUser {

	public static void main(String[] args) {
		SuperBrowser dr = null;
		dr=new SuperBrowser();
		dr.get();
		String browser = "Chrome";

		if (browser.equals("Chrome")) {
			dr = new ChromeDriver();
		} else if (browser.equals("Firefox")) {
			dr = new FirefoxDriver();
		} else if (browser.equals("Edge")) {
			dr = new EdgeDriver();
		} else {
			dr = new SuperBrowser();
		}
		dr.get();
		dr.findElements();
		dr.close();

	}

}
