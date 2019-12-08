package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel1 {

	public String[][] readExcel(String excelFileName) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook book = new XSSFWorkbook("./Data/"+excelFileName+".xlsx");
		XSSFSheet sheet = book.getSheet("Sheet1");
		//Sheet name is unknown => book.getSheetAt(0);
		
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row Count :"+rowCount);
		short colCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Column Count: "+colCount);
		String[][] data = new String[rowCount][colCount];
		for(int i = 1; i<= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<colCount;j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				data[i-1][j] = value;
				//System.out.println(data);
			}
		}
		return data;
	} 
}
