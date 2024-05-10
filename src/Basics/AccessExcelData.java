package Basics;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;



public class AccessExcelData {

	@Test
	public void getData(String testcaseName) throws IOException
	{
		ArrayList<String> a = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("D:\\drivers\\Book1.xlsx");
		XSSFWorkbook workook = new XSSFWorkbook(fis);
		int sheets = workook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {
			if (workook.getSheetName(i).equalsIgnoreCase("data1")) {
				XSSFSheet sheet = workook.getSheetAt(i);    
				Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();
				Iterator<Cell> ce= firstrow.cellIterator();
				int k =0; int column =0;
				while(ce.hasNext())
				{
					Cell value = ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("table")) {
						
						column = k ;
					}
					k++;
				}
				System.out.println(column);
				while(rows.hasNext())
				{
					Row r = rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName)) {
						Iterator<Cell> cr = r.cellIterator();
						while(cr.hasNext()) {
							a.add(cr.next().getStringCellValue());
						}
					}
				}
			}
			
		}

	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
