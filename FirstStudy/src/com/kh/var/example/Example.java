package com.kh.var.example;

import java.util.Scanner;

public class Example {

	public void example1() {
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : " );
		num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		num2 = sc.nextInt();
		
		System.out.print("더하기 결과 :" + (num1 + num2));
		System.out.print("빼기 결과 :" + (num1 - num2));
		System.out.print("곱하기 결과 :" + (num1 * num2));
		System.out.print("나누기한 결과 :" + (num1 / num2));
		System.out.print("나누기한 나머지 :" + (num1 % num2));
		
		
	}
	

	public void example2() {
		float num3;
		float num4;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가로 : ");
		num3 = sc.nextFloat();
		
		System.out.println("세로 : ");
		num4 = sc.nextFloat();
		
		System.out.println("면적 : " + (num3*num4) + "둘레 :" + (num3+num4)*2);
		
		
		
	}
	
	public void example3() {
		Scanner sc = new Scanner(System.in);
		char A = sc.next().charAt(0);
		char B = sc.next().charAt(1);
		char C = sc.next().charAt(2);
	}
	
}

