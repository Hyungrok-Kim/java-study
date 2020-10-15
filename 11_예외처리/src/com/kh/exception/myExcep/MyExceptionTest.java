package com.kh.exception.myExcep;

import java.util.Scanner;

public class MyExceptionTest {

	public static void main(String[] args) {
		MyExceptionTest mt = new MyExceptionTest();
		mt.inputValue();
	}
	
	public void inputValue() {
		// 숫자를 입력받아 10 이상이면 
		// 화재 발생 이라는 예외 상황이 
		// 발생하도록 프로그램 만들기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("현재 수치 입력 : ");
		int value = sc.nextInt();
		try {
		checkFire(value);
		}catch(FireException e) {
			// 1. 사용자에게 문제 상황 인지
			System.out.println("문제 상황 : " + e.getMessage());
			System.out.println("고객분들은 신속히 대피하시고,");
			System.out.println("관리자 김지노씨는 0000 내선 번호로 연락주세요.");
			
			// 2. 어디서부터 에러가 발생했는지 추적 
			e.printStackTrace();
			
		}finally {
			// 반드시 해야 할 일 
			
		}
	}
	
	public void checkFire(int value) throws FireException{
		if(value >= 10) {
			System.out.println("화재 감지 확인");
			throw new FireException("화재 수치가 10 이상입니다.");
		}
		else if(value < 0) {
			throw new FireException("실내 온도가 영하입니다.");
		}
		else {
			System.out.println("현재 수치는 정상입니다.");
		}
	}

}
