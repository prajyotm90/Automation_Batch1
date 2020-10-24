package additionalAnnotations;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import accessModifiers.AccessModifiers;
import readExcel.ExcelFunctionLibrary2;

public class DataProviderConcept {
	


	@Test(dataProvider = "testData2")
	public void loginTest(String userName, String password) {
		System.out.println("Enter username: " + userName);
		System.out.println("Enter password " + password);
		System.out.println("Click Login");
		System.out.println("***********************");
		AccessModifiers aa=new AccessModifiers();
	}

	@DataProvider
	public String[][] testData() {

		// unm | pwd
		// unm1 | pwd1
		// unm2 | pwd2

		String[][] data = new String[3][3];
		data[0][0] = "username";
		data[0][1] = "password";
		data[0][2] = "1234";

		data[1][0] = "username1";
		data[1][1] = "password1";
		data[1][2] = "3421";

		data[2][0] = "username2";
		data[2][1] = "password2";
		data[2][2] = "6354";

		return data;

	}
	
	@DataProvider
	public String[][] testData2() throws IOException {
		
		ExcelFunctionLibrary2 lib=new ExcelFunctionLibrary2(System.getProperty("user.dir")+"\\src\\readExcel\\testData.xlsx");
		int rows=lib.getNumberOfRows("testData");
		int cols=lib.getNumberOfColumns("testData");
		// unm | pwd
		// unm1 | pwd1
		// unm2 | pwd2

		String[][] data = new String[rows][cols];
		for(int r=0;r<rows;r++) {
			for(int c=0;c<cols;c++) {
				data[r][c]=lib.getCelllData("Sheet2", r, c);
				
			}
			
		}



		return data;

	}
	


	/*
	 * @Test public void test1() { String[][] data = testData(); for (int r = 0; r <
	 * data.length; r++) { for (int c = 0; c < data[r].length; c++) {
	 * System.out.println(data[r][c]); } }
	 * 
	 * }
	 */
}
