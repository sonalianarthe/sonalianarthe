package org.excelFiles.EX;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex2 {
	public static void main(String[] args) {

		try {
			String path= System.getProperty("user.dir");
			FileInputStream fis = new FileInputStream(path+"\\Excel\\Testdata.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			int totalsheet = wb.getNumberOfSheets();
			System.out.println("totalsheet="+totalsheet);
			
			Sheet s1= wb.getSheet("Sheet1");
			int NumOfRows=s1.getPhysicalNumberOfRows();
			System.out.println("NumOfRows="+NumOfRows);
			//it give the NumOf Row And Cell
			Row r1=s1.getRow(1);
			int NumOfCell =r1.getPhysicalNumberOfCells();
            System.out.println("NumOfCell="+NumOfCell);
            //Using getrow(1) And getCell(1) give O/p of row 1 and cell 1 value=Gaikar
            Cell c1=r1.getCell(1);
            System.out.println(c1.getStringCellValue());
           
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	

    }
