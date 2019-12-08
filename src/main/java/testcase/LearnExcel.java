package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook book = new XSSFWorkbook("./Data/CreateLead.xlsx");
		XSSFSheet sheet = book.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row Count :"+rowCount);
		short colCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Column Count: "+colCount);
		for(int i = 1; i<= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<colCount;j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.println(value);
				
			}
		}

	}

}
