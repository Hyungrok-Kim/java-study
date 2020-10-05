package com.kh.loop;

import java.util.*;

public class B_WhileLoop {
	
	Scanner sc = new Scanner(System.in);
	
	public void testWhileLoop1() {
		// for문은 특정 반복 횟수안의 반복을 
		// 수행할 때 사용하지만,
		// while문은 별도의 반복 횟수 없이 
		// 특정 조건만 만족하면 무한정 수행하는 
		// 무한 반복의 특성을 지닌다. 
		
		// while 사용형식
		// while(조건식) {...} // if랑 유사한 형태 
		
		while(true) {
			System.out.println("Hello world!");
			
		}
		
		
		
		
	}
	public void testWhileLoop2() {
		// 문자열을 하나 입력받아 
		// 문자열의 길이만큼 
		// 문자 하나씩 추출하기 
		
		// 안내 문구 
		System.out.println("문자열 입력 : ");
		String str = sc.next();
		
		// while 문을 일정 횟수만큼 정해서
		// 반복 시키고자 한다면 
		// while문 전에 반복 횟수용 변수를 하나 
		// 생성하여 해당 변수를 조건으로 사용한다. 
		
		int i = 0;
		
		while(i < str.length()) {
			
			// 반복 횟수가 불확실할 때 주로 while을 사용한다. 
			
			System.out.println(i + "번째 문자 : " + str.charAt(i));
			i++;
			
		}
		
		
	}
	
	public void testWhileLoop3() {
		// 1부터 입력받은 수까지의 합 계산하기 
		
		int sum = 0;
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		int i = 1;
		
		while(i <= num) {
			sum += i;
			i++;
		}
		
		System.out.println("합 : " + sum);
		
	}
	
	
	public void testWhileLoop4() {
		// while문 중첩 사용( while 안의 while문 ) 
		// 구구단 2에서 9단까지 모두 출력하기
		
		
		int dan = 2;
		
		while(dan < 10) {
			// 각 단을 반복한다.
			System.out.println("------------" + dan + "단-----------");
			int su = 1;
			
			while(su < 10) { //각 단의 곱셈 구현
				System.out.printf("%10d * %d = %d \n" , dan , su , dan*su);
				su++;
			}
			
			dan++;
			
			
		}
		
		
		
	}
	
	public void testWhileLoop5() {
		// while 문을 이중 반복하여 
		// 직사각형 * 찍기 
		// 가로, 세로 길이를 입력받아 
		// 직사각형 모양의 별 찍기 
		
		System.out.println("세로 줄 수 입력 : ");
		int row = sc.nextInt();
		
		System.out.println("가로 줄 수 입력 : ");
		int col = sc.nextInt();
		
		int i = 1;
		while(i <= row) { // 세로 줄 수 반복
			
			int j = 1;
			
			while(j <= col) { // 가로 줄 수 반복
			 if(j != col ) {
				 System.out.print("*");
				}
			 else {
				 System.out.println("*");
			 	}
			 
			 j++;
				
			}
			i++;
		}
			
	}
	
	public void testWhileLoop6() {
		// while 과 for문 반복문은 서로 바꿀 수 있다.
		
		// for --> while
		// 1~5까지의 합
		int sum = 0;
		
		for(int i =1; i <= 5; i++) {
			sum += i;
		}
		
		// 1. 초기값을 밖에 선언한다. 
		int i = 1;
		
		// 2. 조건식을 사용하여 while 반복문을 만든다. 
		
		while(i <= 5) {
			
			sum += i;
			
		// 3. 증감식을 반복문 안에 선언한다. 
			i++;
		}
		
		// while --> for
		/*while(true) {
			sum += i;
			
		}
		*/
		/*
		for(;;) {
			sum += i;
			
		}
		*/
		
	}	
	
	
	
}
