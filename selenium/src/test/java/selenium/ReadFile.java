package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



import org.apache.poi.ss.usermodel.Cell;

public class ReadFile {

	public static void main(String[] args) throws IOException  {
	String filepath = "C:\\Users\\jayasus\\JavaSelenium\\selenium\\test-data\\Login-data.xlsx";
	
	FileInputStream fis = new FileInputStream(filepath);
	@SuppressWarnings("resource")
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheetAt(0);
	for(int i=0; i<=sheet.getLastRowNum();i++) {
		for(int j=0;j<sheet.getRow(i).getPhysicalNumberOfCells();j++) {
			Row row = sheet.getRow(i);
		    Cell cell = row.getCell(j);
		    System.out.println(cell.getStringCellValue());
			
			System.out.println("    |    ");
		}
		System.out.println();
	}
	

	}

}
