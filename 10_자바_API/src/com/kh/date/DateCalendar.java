package com.kh.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateCalendar {
	
	public DateCalendar() {}
	
	// 평년과 윤년 구별하는 메소드 
	public boolean isLeapYear(int year) {
		boolean result = false;
		
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			result = true;
		}
		
		else {
			result = false;
		}
		// 년도가 4의 배수이면서
		// 100의 배수가 아니거나 400의 배수인 연도
		
		
		return result;
	}
	
	// 이전 연도까지의 총 일수 
	public long getDays() {
		Calendar cal = new GregorianCalendar();
		long sumDays = 0;
		
		for(int i = 1; i <= cal.get(Calendar.YEAR); i++) {
			if(i == cal.get(Calendar.YEAR)) {
				sumDays += cal.get(Calendar.DAY_OF_YEAR);
			}else {
				sumDays += isLeapYear(i) ? 366 : 365;
			}
		
		}
		
		// 위의 isLeapYear를 사용하여
		// 윤년이면 366일, 평년이면 365일을
		// 1년 1월 1일부터 현재 날짜까지 계산하기 
		// **올해는 아직 366일이 안되었음
		
		return sumDays;
	}
}
