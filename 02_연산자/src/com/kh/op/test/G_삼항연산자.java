package com.kh.op.test;

import java.util.Scanner;

public class G_삼항연산자 {
	// 비교 항목이 3개인 연산자 
	// 형식 : (조건식) ? "참일 때 값" : "거짓일 때 값" 
	// ** 조건식 : 해당 연산의 결과가 반드시 참이나 거짓이 나오는 연산 식
	
	public void testMethod() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("지금 소지금이 얼마인가요?");
		int money = sc.nextInt();
		
		// 삼항 연산자를 1개 사용했을 때 
		String result = (money >= 5000) ? "에그드랍" : ((money >=	3000) ? "삼각김밥" : "초콜릿");
		 
		System.out.println("오늘 점심은 " + result + "입니다!");
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
