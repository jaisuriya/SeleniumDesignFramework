package excelDataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excel {
	
	@Test
	public void getExcel() throws IOException {
		FileInputStream fis = new FileInputStream("C://Users//jayasus//Desktop//excelDriven.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int columnCount = row.getLastCellNum();
		Object data[][] = new Object[rowCount-1][columnCount];
		for(int i=0;i<rowCount-1;i++) {
			row = sheet.getRow(i+1);
			for(int j=0;j<columnCount;j++) {
				XSSFCell cell = row.getCell(j);
				
			    data[i][j]=row.getCell(j); 
				
			}
			
		}
	}

}
