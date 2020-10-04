package com.kh.logic;

public class BeforeLogic {
	
	public static void main(String[] args) {
		// 조건문 : 어떠한 조건식을 통해 참과 거짓일 때 
		// 	          실행할 코드를 나눠주는 문법
		
		// 비교 연산자와 일반 논리 연산자 익숙해지기
		// ** 조건문에 들어가는 조건식은 대부분 비교 연산자와 
		// 일반 논리 연산자로 이루어져 있다.
		
		int minHeight = 120;
		int maxHeight = 190;
		int count = 10;
		double mass = 10.0;
		boolean check = false;
		char ch = 'A';
		
		
		// --------------------------------- //
		// 위의 여섯가지 변수를 활용하여 
		// 비교 연산자와 일반 논리 연산자를 사용한
		// true / false 를 각각 15개씩 만들기 
		
		// --true 15개 -- 
		System.out.println("true 결과 1 : " + (count == mass));
		System.out.println("true 결과 2 : " + (maxHeight > minHeight) );
		System.out.println("true 결과 3 : " + (check == false));
		System.out.println("true 결과 4 : " + (ch == 'A'));
		System.out.println("true 결과 5 : " + (minHeight == 120));
		System.out.println("true 결과 6 : " + (maxHeight == 190));
		System.out.println("true 결과 7 : " + (minHeight != maxHeight));
		System.out.println("true 결과 8 : " + (maxHeight - minHeight == 70));
		System.out.println("true 결과 9 : " + (check != true));
		System.out.println("true 결과 10 : " + (minHeight == 120 && maxHeight == 190));
		System.out.println("true 결과 11 : " + (minHeight == 120 || maxHeight == 170));
		System.out.println("true 결과 12 : " + (count >= 10 ));
		System.out.println("true 결과 13 : " + (maxHeight % minHeight == 70));
		System.out.println("true 결과 14 : " + (maxHeight + minHeight == 310));
		System.out.println("true 결과 15 : " + (ch != 'a'));
		
		// --false 15개--
		System.out.println("false 결과 1 : " + (count != mass));
		System.out.println("false 결과 2 : " + (maxHeight < minHeight));
		System.out.println("false 결과 3 : " + (check == true));
		System.out.println("false 결과 4 : " + (ch == 'a'));
		System.out.println("false 결과 5 : " + (maxHeight == 120));
		System.out.println("false 결과 6 : " + (minHeight == 190));
		System.out.println("false 결과 7 : " + (mass == 10 && check == true));
		System.out.println("false 결과 8 : " + (minHeight == 130 || maxHeight == 180));
		System.out.println("false 결과 9 : " + (maxHeight == 170 && minHeight == 120));
		System.out.println("false 결과 10 : " + (count < 10));
		System.out.println("false 결과 11 : " + (ch != 'A'));
		System.out.println("false 결과 12 : " + (check != false));
		System.out.println("false 결과 13 : " + (maxHeight + minHeight < 300));
		System.out.println("false 결과 14 : " + (maxHeight * minHeight == 300));
		System.out.println("false 결과 15 : " + (maxHeight / minHeight != 1));
		

		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
