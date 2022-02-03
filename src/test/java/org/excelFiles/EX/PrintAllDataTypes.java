package org.excelFiles.EX;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllDataTypes {
   public static void main(String[] args) {
		
		String path= System.getProperty("user.dir");
		FileInputStream fis;
		try {
			fis = new FileInputStream(path+"\\Excel\\Testdata.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s1= wb.getSheet("AllData");
			for(int j=1; j<s1.getPhysicalNumberOfRows(); j++) {
				Row r1=s1.getRow(j);
				for(int k=0; k<r1.getPhysicalNumberOfCells(); k++) {
					//System.out.println(r1.getCell(k).getCellType());
					//It give all cell data types ie.string,boolean,numeric
					CellType ct=r1.getCell(k).getCellType();
					switch(ct){
					case STRING:System.out.println(r1.getCell(k).getStringCellValue());
					break;
					case NUMERIC:
						if(DateUtil.isCellDateFormatted(s1.getRow(j).getCell(k))) {
							SimpleDateFormat dateformate = new SimpleDateFormat("dd-MM-yyyy-ss");
							System.out.println( dateformate.format(s1.getRow(j).getCell(k).getStringCellValue()));
						}else {System.out.println((long)r1.getCell(k).getNumericCellValue());
						}break;

					case BOOLEAN:System.out.println(r1.getCell(k).getBooleanCellValue());
					break;
					case FORMULA:System.out.println(r1.getCell(k).getCellFormula());
					break;
					case BLANK:System.out.println("Is blank cell");
					break;
					default:System.out.println("is invalid CellType");
					}
						}
					}	
					
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
	}

}
