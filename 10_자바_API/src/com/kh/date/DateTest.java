package com.kh.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
		DateTest dt = new DateTest();
		
		dt.testDate();
		dt.testCalendar();

	}
	
	
	public void testDate() {
		Date d = new Date();
		
		System.out.println("date : " + d);
		
		// 시스템 시간 : 
		// 일반적인 시간이 아니라
		// 1000분의 1초 기준으로 날짜를 센 숫자로도 시간을 표현할 수 있다. 
		// 숫자 세기의 기준은 1970년 1월 1일을 기준으로 한다.
		// 1970년대에 달력의 기준을 정했기 때문
		
		System.out.println("시스템 시간 : " + new GregorianCalendar().getTimeInMillis());
		Date d2 = new Date(1598505140403L);
		
		System.out.println("date2 : " + d2);
		
		// -- 1000분의 1초로 변경해서 출력 -- //
		System.out.println("date 시간 : " + d.getTime());
		
		
	}
	
	public void testCalendar() {
		// 기존의 Date 클래스에서 
		// 보다 폭넓은(각 지역 표준 시간대) 시간 정보를 
		// 담은 날짜 처리 클래스 
		
		// 다형성
		Calendar cal = new GregorianCalendar();
		
		System.out.println("date : " + cal);
		
		// 날짜 표현 형식 변경하기 
		// 1. 직접 연월일 시분초 정보를 뽑아오기 
		
		int year = cal.get(Calendar.YEAR);
		// 월의 정보는 1월, 2월, 3월등의 정보가 영어 문자열로
		// 배열화 되어 있기 때문에 시작은 0부터이다. 
		// 1월 - month[0]
		// ... -- 12개
		// 12월 - month[11]
		int month = cal.get(Calendar.MONTH) + 1;
		
		
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		int am_pm = cal.get(Calendar.AM_PM);
		
		System.out.printf("%d년 %d월 %d일 \n", year, month, date);
		
		System.out.printf("%d : %d : %d (%s) \n", hour, min, sec, (am_pm > 0 ? "오후" : "오전"));
		
		// 2. 날짜 표현 형식(format)을 변경해주는 클래스 사용하기 
		
		// yyyy-mm-dd 형식
		// yyyy : 연도
		// mm : 월
		// dd : 일
		SimpleDateFormat dateFormat
			= new SimpleDateFormat("yyyy년 MM월 dd일 E요일, hh시 mm분 ss초");
		String dateStr = dateFormat.format(cal.getTime());
		
		System.out.println("날짜 형식 변경 : " + dateStr);
		
		// 날짜 직접 변경하기(사용자 정의 날짜)
		cal.set(2020, 7, 31);
		
		dateStr = dateFormat.format(cal.getTime());
		
		System.out.println(dateStr);
	}
	

}
