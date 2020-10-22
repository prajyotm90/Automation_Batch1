package readExcel;

import java.io.IOException;

public class TestExcelLibrary {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelFunctionLibrary E=new ExcelFunctionLibrary();
		String data1=E.getCellData("Sheet1", 0, 0);
		System.out.println(data1);
		
		String data2=E.getCellData("Sheet2", 2, 0);
		System.out.println(data2);
		
		String data3=E.getCellData("Sheet3", 1, 0);
		System.out.println(data3);
		
		System.out.println("***********");
		
		
		for(int r=0;r<=2;r++) {
			for(int c=0;c<=1;c++) {
				System.out.println(E.getCellData("Sheet1",r,c));
			}
		}
		
		System.out.println("#############");
		int rows=E.getNumberOfRows("Sheet2");
		int columns=E.getNumberOfColumns("Sheet2", rows-3);
		System.out.println(rows);
		System.out.println(columns);
				
		
		

	}

}
