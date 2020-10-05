package com.kh.loop;

import java.util.*;

public class D_BreakTest {
	// 분기문 : 반복문 내에서 반복 수행 중 
	// 		  특정 상황에 놓였을 때 
	// 		  해당 반복에 영향을 주는 문법 
	// break : 반복을 강제 종료하고 해당 반복문을 나가는 문법 
	
	// 일반적으로 if문과 함께 쓰이며,
	// 특정 조건에 만족할 때 반복을 강제 종료할 
	// 목적으로 쓰인다. 
	
	Scanner sc = new Scanner(System.in);
	
	public void testBreak1() {
		// 문자열을 입력받아
		// 글자 수를 출력하는 반복 프로그램 작성하기 
		// 단, exit가 입력되면 강제 종료 
		
		String words = null;
		
		do {
			
			System.out.println("문자열 입력 : ");
			words = sc.next();
			
			if(words.equals("exit")){
					break;
					}
			else {
				System.out.println("글자 수 : " + words.length());
			}
		}while(true);
		
	}
	
}
