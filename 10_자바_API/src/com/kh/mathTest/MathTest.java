package com.kh.mathTest;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 3.5;
		
		System.out.println("num : " + num);
		
		// 반올림, 올림, 버림(내림)
		System.out.println("round() : " + Math.round(num));
		System.out.println("ceil() : " + Math.ceil(num));
		System.out.println("floor() : " + Math.floor(num));
		
		// 소수점 둘째 자리에서 반올림
		
		double num2 = 12.345;
		
		// 12.345 --> 123.45( * 10)
		
		num2 *= 10; // 123.45
		
		System.out.println("num2 : " + Math.round(num2) / 10.0);
		
		// 제곱 수 구하기 
		int num3 = 5;
		// 5 * 5 (pow)
		
		num3 = (int)Math.pow(5, 3); // 세 제곱
		
		System.out.println("num3^3 : " + num3);
		
		System.out.println("------------------");
		// 랜덤 메소드
		//Math.random() 0부터 1전까지의 실수를 임의로 구하는 메소드 
		System.out.println("Math.random() : " + Math.random());
		
		// Math.random() * 6 --> 0 ~ 5.99999999 + 1 --> 1~6.999999999
		// (int) 1 ~ 6
		
		// (Math.random() * 최댓값)
		int dice = (int)(Math.random() * 6 ) + 1;
		
		System.out.println("오늘의 운세 : " + dice);
		
	}
	
	
	

}
