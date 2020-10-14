package com.kh.date;

import java.util.Scanner;

public class ShowDate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 특정 년도가 윤년인지 확인하기");
		
		DateCalendar dc = new DateCalendar();
		
		System.out.println("연도 입력 : ");
		int year = sc.nextInt();
		
		String result = dc.isLeapYear(year) ? "윤년" : "평년";
		
		System.out.println("입력하신 연도는 " + result + "입니다.");
		
		System.out.println("2. 1년 1월 1일부터 현재까지 일 수 계산");
		
		long totalDate = dc.getDays();
		
		System.out.println("총 날짜 수 : " + totalDate);
		
		
	}

}
