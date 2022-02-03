package org.excelFiles.EX;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteOperationInExcel {

	public static void main(String[] args) {
		try {
			System.out.println("Program Starts");
			String path= System.getProperty("user.dir");
			FileInputStream fis = new FileInputStream(path+"\\Excel\\Testdata.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			int totalsheet = wb.getNumberOfSheets();
			System.out.println("totalsheet="+totalsheet);
			Sheet s1= wb.getSheet("loginCredintial");
			s1.getRow(1).createCell(2).setCellValue("Pass");
			s1.getRow(2).createCell(2).setCellValue("Fail");
			s1.getRow(3).createCell(2).setCellValue("Fail");
			FileOutputStream fos = new FileOutputStream(path+"\\Excel\\Testdata.xlsx");
			wb.write(fos);
			fos.close();
			wb.close();
			
			System.out.println("Program Ends");
		}catch(Exception e){
			e.printStackTrace();
		}
		}}
			
			
			
			
			
	

