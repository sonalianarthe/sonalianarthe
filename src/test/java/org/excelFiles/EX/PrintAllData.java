package org.excelFiles.EX;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllData {

	public static void main(String[] args) {
       System.out.println("Program Starts");
		try {
			String path= System.getProperty("user.dir");
			FileInputStream fis = new FileInputStream(path+"\\Excel\\Testdata.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s1= wb.getSheet("AllString");
			/*int NumOfRows=s1.getPhysicalNumberOfRows();
			System.out.println("NumOfRows="+NumOfRows);

			Row r1=s1.getRow(1);
			int NumOfCell =r1.getPhysicalNumberOfCells();
			System.out.println("NumOfCell="+NumOfCell);

			Cell c1= r1.getCell(1);
			System.out.println(c1.getStringCellValue());*/ 
			for(int j=1; j<s1.getPhysicalNumberOfRows(); j++) {
				Row r1=s1.getRow(j);
				for(int k=0; k<r1.getPhysicalNumberOfCells(); k++) {
					System.out.println(r1.getCell(k).getStringCellValue());
				}System.out.println();

			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	       System.out.println("Program ends");

	}

	

}
