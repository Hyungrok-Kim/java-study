package com.kh.op.test;

public class H_시프트연산자 {
		// 일반 값이 아닌 2진수의 비트 단위 계산을 수행할 때
		// 사용하는 연산자로 비트 단위로 좌측, 우측 이동을 통해
		// 값의 배수 계산, 보수 계산등을 효율적으로 처리하는 방식이다.
		
		public void testMethod(){
			byte num1 = 10; // 00001010 
			byte num2 = 9;  // 00001001
			byte shft = 1;  // 이동할 칸 수
		
			// and 연산 : 두 비트가 모두 1이어야 결과가 1인 연산법
			System.out.println(Integer.toBinaryString(num1) + " & " + Integer.toBinaryString(num2) + " = "
					+ Integer.toBinaryString(num1 & num2)); // 00001000 == 8
			
			// or 연산 : 둘 중 하나가 1이면 결과가 1인 연산법
			System.out.println(Integer.toBinaryString(num1) + " | " + Integer.toBinaryString(num2) + " = "
					+ Integer.toBinaryString(num1 | num2)); // 00001011 == 11
			
			// xor 연산 : 두 비트가 같으면 0, 다르면 1인 결과를 출력하는 연산법
			System.out.println(num1 + " ^ " + num2 + " = "
					+ (num1 ^ num2)); // 00000011 == 3
			
			// 비트 반전 연산자 : 현재 가진 비트를 정 반대로 만드는 연산자
			System.out.println("~10 = " + (~num1)); // 11110101
			
			// 시프트 연산 : 정해진 수 만큼 좌측, 우측으로 이동하는 연산자
			// 왼쪽 1비트 시프트(앞으로 이동하며 빈칸을 0으로 채운다.)
			// 00001010
			// 00010100
			System.out.println(num1 + " << " + shft + " = "
					+(num1 << shft));
			
			
			// 오른쪽 1비트 시프트(뒤로 밀리기 전 첫번째 비트와 같은 비트로 채운다.)
			// 00001010
			// 00000101
			
			System.out.println(num1 + " >> " + shft + " = "
					+(num1 >> shft));
			
			// >>>  오른쪽 1비트 논리 시프트 연산자
			// 앞을 반드시 0으로 채우는 비트 연산자
			System.out.println(num1 + " >>> " + shft + " = "
					+(num1 >>> shft));
			
			// 시프트 복합 대입 연산자도 있다. 
			num1 >>= shft;
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
