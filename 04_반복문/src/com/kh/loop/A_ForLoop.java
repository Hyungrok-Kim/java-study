package com.kh.loop;

import java.util.Scanner;

public class A_ForLoop {
	
	
	Scanner sc = new Scanner(System.in);
	
	public void beforeForLoop(){
		
		// syso + Ctrl + space누르면 자동으로 만들어줌.
		
		for(int i = 0;  i < 5;  i++) {
			System.out.println("Hello World!");
			
		}
	}
	
	public void testForLoop1() {
		// 반복문
		// 어떠한 	계산, 출력을 연달아 수행해야 할 경우 
		// 직접 하나하나 작성하지 않고,
		// 컴퓨터를 통해 자동으로 반복을 수행하는 문법 
		
		// 1. for : 반복 횟수에 제한이 있는 반복문 (중요)
		// 2. While : 반복 횟수에 제한이 없는 반복문 (중요)
		// 3. do-while : 최초 한 번은 반드시 실행하는 반복문 
		
		// for 사용형식 
		// for(시작할 숫자 ; 비교할 조건 ; 증가할 반복 숫자){....}
		
		// 1부터 10까지의 합을 구하시오.
		
		// 반복문 사용 전 
		//System.out.println(1+2+3+4+5+ . . . + 9 + 10);
		
		// 반복문 사용
		int sum = 0;
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("i 반복 확인 : " + i);
			sum += i; 
			
		}
		
		System.out.println("sum : " + sum);
		
	}
	
	public void testForLoop2() {
		// 1. 단순 반복 (기본 형태) 
		// 1 ~ 100까지의 합을 구하시오.
		int sum1 = 0;
		
		for (int i = 1; i <= 100; i++) {
			
			sum1 += i;
			
		}
		
		System.out.println("sum1 : " + sum1);
	
		// 2. 역 반복 형태 
		// 5 ~ 1까지 반복하기.
		// 시작할 값(숫자) : 5
		// 끝나는 값(숫자) : i >= 1  
		// 증감식 ( ++ / -- ) : i--
		System.out.println("---------------------");
		
		for (int j = 5; j >= 1; j--) {
			
			System.out.println("j : " + j );
			
		}
		
	}
	
	public void testForLoop3() {
		// for 반복문 응용하기 1
		
		// 구구단 2단
		
		for(int i = 2; i <= 2; i++ ) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %2d \n", i , j, i*j);
			}
			
		}
	
		System.out.println("-----------------");
		
		// 실습. 1
		// for문과 if문을 활용하기 
		// 속칭 (for안에 if있다.)
		// 1~10까지의 수 중 홀수 들의 합 구하기 
		// walkthrough (공략, 해결법) 
		// 1. 반복에 쓰일 시작값, 끝값, 증감식 구하기 (조건 구하기) 
		// 2. 계산에 쓰일 변수 (공간) 선언하기
		// 3. 반복 시 필요한 조건식 만들기 
		
		// 4. 1 ~ 3 까지 나온 재료들로 코드 구현하기 
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if(i%2!=0) {
				sum += i;
			}
			
		}
		System.out.println("sum :" + sum);
		
			
		
		
	}
	
	public void testForLoop4() {
		// for문  + Scanner 
		
		// 실습 1 
		// 정수 하나를 입력받아 
		// 1부터 해당숫자까지의 합을 구하시오.
		
		// 실습 2
		// 한 자리의 정수를 입력받아 
		// 1부터 해당 숫자까지의 짝수들의 합을 구하시오. 
		
		// 실습 3
		// 한 자리의 정수를 입력받아 
		// 해당 숫자에 맞는 구구단을 출력하시오 
		
		//실습 1
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("sum : " + sum);
		
		
		System.out.println("---------------------\n");
		
		//실습 2
		
		System.out.println("정수 입력2 :");
		int num2 = sc.nextInt();
		int sum2 = 0;
		
		for(int j = 1; j <= num2; j++) {
			if( num2 < 10) {
			
				if(j%2 == 0) {
				sum2 += j;
				}
			}
			else {
				j = 0;
				num2 = sc.nextInt();
			}
		}
		System.out.println("짝수들의 합 : " + sum2);
		
		System.out.println("--------------------\n");
		
		// 실습 3
		
		System.out.println("정수 입력 3 : ");
		int num3 = sc.nextInt();
		for(int c = 1; c <=10; c++) {
			if(num3 < 10) {
			System.out.printf("%d * %d = %d \n", num3, c, num3*c);
			}
			else {
				
				c = 0;
				num3 = sc.nextInt();
				
			}
		}
	}
	
}

