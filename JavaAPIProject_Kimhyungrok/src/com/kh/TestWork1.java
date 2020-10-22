package com.kh;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestWork1 {

	public static void main(String[] args) {
	
		Calendar cal = new GregorianCalendar();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int dw = cal.get(Calendar.THURSDAY);
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월 %d일 요일 ", year,month,day);
		
		System.out.println("--------------");
		
		SimpleDateFormat SDF = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		String str = SDF.format(cal.getTime());
		
		System.out.println(str);
	}
	
	

}
