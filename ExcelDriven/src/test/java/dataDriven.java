import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C://Users//jayasus//Documents//Documents//demotest.xlsx");
		XSSFWorkbook  work = new XSSFWorkbook(fis);
		int sheets = work.getNumberOfSheets();
		for(int i=0;i<sheets;i++) {
			if(work.getSheetName(i).equalsIgnoreCase("testdata")) {
				XSSFSheet sheet = work.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();
				Iterator<Cell> cell=firstrow.cellIterator();
				int k=0;
				int column = 0;
				while(cell.hasNext()) {
					Cell value = cell.next();
					
					if(value.getStringCellValue().equalsIgnoreCase("Testcases")) {
						
						column=k;
					}
					k++;
				}
				System.out.println(column);
			}
			
		}
		

	}

}
