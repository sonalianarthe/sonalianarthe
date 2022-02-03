package org.excelDatePrint;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrint {

	public static void main(String[] args) {
		Date dt =new Date();
		System.out.println(dt);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy-ss");//for month write MM and minute write mm
        String date =sdf.format(dt);
        System.out.println(date);
       date= date.replaceAll("-", "").replaceAll(":", "").replaceAll("", "");
       //use for constant no.i.e after using this method the is not change anytime
       System.out.println(date);
	}

}
