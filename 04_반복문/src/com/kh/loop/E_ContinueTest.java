package com.kh.loop;

import java.util.Scanner;

public class E_ContinueTest {
	// continue : 반복문 내에서 
	// 			    특정 조건을 만날 경우.
	//			    해당 반복을 건너뛰게 하는 역할
	
	// if(조건문) {continue;}
	
	// 반복 횟수는 여전히 1증가해서 
	// 마치 한 번 반복을 정상적으로 수행한 것처럼 
	// 넘길 수 있다. 
	
	public void testContinue1() {
		// 1 ~ 100번까지 사원들 중 
		// 40번 대의 사원을 제외한 
		// 나머지 사원의 수를 구하시오 
		
		int total = 0; // 총 사원 수 저장 공간
		
		for(int i = 1; i <= 100; i++) {
			if(i >= 40 && i < 50) {
				System.out.println(i + "번째 사원 제외! ");
				continue;
			}
			
				
				total++;
		
			
			
		}
		
		System.out.println("총 사원 수 : " + total);
		
	}
	
	
	public void testContinue2() {
		// 구구단 출력하기 
		// 단, for문을 활용하고 
		// 각 단의 홀 수 곱만 출력하기 
		// -----N단 -----
		// N * 1 = M 
		// N * 3 = M 
		// N * 5 = M
		// ...
		Scanner sc = new Scanner(System.in);
		System.out.println("단 입력 : ");
		
		int dan = sc.nextInt();
		
		System.out.printf("------%d단------ \n",dan );

		for (int i = 1; i <= 9; i++) {
			if(i % 2 == 0) {
				continue;
			}
			else {
				System.out.printf("%d * %d = %d \n", dan, i, dan*i);
			}
			
		}
		
	}
}

