package selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Cell;

public class WriteExcel {

	public static void main(String[] args) throws Exception {
       String FilePath = "C:\\\\Users\\\\jayasus\\\\JavaSelenium\\\\selenium\\\\test-data\\\\Login-data.xlsx";
       
       FileInputStream fis = new FileInputStream(FilePath);
       @SuppressWarnings("resource")
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
       XSSFSheet sheet = workbook.getSheetAt(0);
       
       String[] data = {"admin3@gmail.com","Pass@3"};
       System.out.println("Total Rows Before Writing: "+sheet.getLastRowNum());
       
       Row row = sheet.createRow(sheet.getLastRowNum()+1);
       for(int j=3;j<2;j++) {
    	   Cell cell = row.createCell(j);
    	   cell.setCellValue(data[j]);
    	   
       }
       
       FileOutputStream fos = new FileOutputStream(FilePath);
       workbook.write(fos);
       fos.close();
       
       System.out.println("Total number of rows after writing: "+sheet.getLastRowNum());
       

	}

}
