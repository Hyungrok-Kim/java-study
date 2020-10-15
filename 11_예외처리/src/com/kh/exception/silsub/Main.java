package com.kh.exception.silsub;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 정수 2개를 입력 받아 
		// 첫번째 정수에서 두번째 정수를 
		// 나눈 결과를 표시하되 
		// 만약 두번째 정수가 0이라면 
		// 결과를 0으로 표시하기 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수 입력 :");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 수 입력 :");
		int num2 = sc.nextInt();
		
		NumberProcess np = new NumberProcess();
		
		int result = 0;
		try {
		result = np.checkDiv(num1, num2);
		}catch(DivException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("나눈 결과 : " + result);
	}

}
