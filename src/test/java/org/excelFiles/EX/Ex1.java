package org.excelFiles.EX;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex1 {
         public static void main(String[] args) {
		
        try {//(flow=FileInpuStream=WorkBook=Sheet=Row=Cell)
        	//Using File o=Object fis create workbook and using WookBook Object wb.create Row 
        	//And using Row Object r1. Call to Cell and cellValue
        	String path= System.getProperty("user.dir");
			FileInputStream fis = new FileInputStream(path+"\\Excel\\Testdata.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			int totalsheet = wb.getNumberOfSheets();
			System.out.println("totalsheet="+totalsheet);
			System.out.println("sheetname="+wb.getSheetName(0));
		
			for(int i=0;i<totalsheet;i++) {
				System.out.println(wb.getSheetName(i));
			}
			
			} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	

    }
