package readExcel;

import java.io.IOException;

public class TestExcelLibrary2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelFunctionLibrary2 E=new ExcelFunctionLibrary2(System.getProperty("user.dir")+"\\src\\readExcel\\testData.xlsx");
		
		
		
		String data1=E.getCelllData("Sheet1", 0, 0);
		System.out.println(data1);
		
		String data2=E.getCelllData("Sheet2", 2, 0);
		System.out.println(data2);
		
		String data3=E.getCelllData("Sheet3", 1, 0);
		System.out.println(data3);
		
		E.setCellData("Sheet2", 11, 18, "testing value");
		
		System.out.println("***********");
		
		
		for(int r=0;r<=2;r++) {
			for(int c=0;c<=1;c++) {
				System.out.println(E.getCelllData("Sheet1",r,c));
			}
		}
		
		System.out.println("#############");
		int rows=E.getNumberOfRows("Sheet2");
		int columns=E.getNumberOfColumns("Sheet2", rows-3);
		System.out.println(rows);
		System.out.println(columns);
				
		
		

	}

}
