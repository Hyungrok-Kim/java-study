package com.kh.silsub;

import java.util.*;

public class Silsub {

	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		System.out.println("문자열 입력 :");
		String str = sc.next();
		
		for(int i = 0; i < 10; i++) {
			System.out.println(str);
		}
		
	}
	
	public void test2() {
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		
		if(num > 0) {
			for(int i = 1; i <= num; i++) {
				if(i % 2 == 1) {
					System.out.print("당");
				}
				else {
					System.out.print("근");
				}
				
			}
		}
		
		
	}
	
	public void test3() {
		System.out.println("정수 입력");
		int num = sc.nextInt();
		
		int i = 1;
		int total = 0;
		while(i <= num) {
			total += i;
			i++;
		}
		
		System.out.println("합 :" + total);
		
		
	}
	
	
	// 제어문 심화 문제
	public void simcha1() {
		System.out.print("월 급여 입력 :");
		int num1 = sc.nextInt();
		
		System.out.print("매출액 입력 :");
		int num2 = sc.nextInt();
		
		double borate = 0;
		
		
		if(num2 >= 50000000) {
			borate = 0.05;
		}
		else if(num2 >= 30000000) {
			borate = 0.03;
		}
		else if(num2 >= 10000000) {
			borate = 0.01;
		}
		else {
			borate = 0;
		}
		
		double bonus = num2 * borate;
		double total = (num2 * borate) + num1;
		
		System.out.println("=================");
		System.out.println("매출액 :" + num2);
		System.out.println("보너스 율 : " + borate +"%");
		System.out.println("월 급여 : " + num1);
		System.out.println("보너스 금액 : " + (int)bonus);
		System.out.println("=================");
		System.out.println("총 급여 :" + (int)total);
	}
	
	public void simcha2() {
		System.out.println("받으신 금액을 입력하세요 : ");
		int money = sc.nextInt();
		System.out.println("상품 가격을 입력하세요 :");
		money -= sc.nextInt();
	
		// 거스름돈을 화폐 단위에 따라 
		// 나눠 받을 공간 
		int charge = money;
		
		if (money < 1) {
			// 만약에 금액이 부족하다면 
			System.out.println("금액이 부족합니다.");
			return;
			
			
			
		}
		
		
		// 50000 -> 10000 -> 5000 -> 1000 
		// -> 500 -> 50 -> 10
		int unit = 50000;
		
		boolean sw = true; //켰다 껐다 하는 변수를 switch 변수라고 함.
		
		for (int i = 0; i < 9; i++) {
			//화폐단위 8가지 기준 반복 
			int count = money/unit; // 각 금액 단위 별 개수 (매수) 
			
			if(count != 0) {
				if(i < 5) {
					// 지폐
					System.out.println(unit + "원 권 지폐" + count + "장");
				}
				else {
					// 동전
					System.out.println(unit + "원 동전 " + count + "개");
				}
				
				
				
			}
			money -= (unit * count);
			// 현재 처리한 거스름 돈을 뺀 
			// 나머지 화폐 거스름 돈 
			
			if (sw) { // 5로 시작하는 단위
				unit /= 5;
			}
			else { // 1로 시작하는 단위
				unit /= 2;
			}
			
			sw = !sw; // true -> false / false -> true
		}
		System.out.println("====================");
		System.out.println("거스름돈 : " + charge + "원");
	}
}
