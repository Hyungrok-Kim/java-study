package com.kh.op.test;

public class F_복합대입연산자 {
	// 대입 연산자와 산술 연산자를 함께 사용하는 연산자 
	// 산술대입 연산자 : += , -=, *= , /= , %=
	// 증감 연산자와 같이 CPU를 거치지 않고 
	// 메모리에서 직접 연산을 처리하기 때문에 
	// 처리 속도가 빠르다.
	
	public void testMethod() {
		/*
		 * +=  : 왼쪽의 공간 안의 값에 오른쪽의 값을 더한 후 
		 * 	  	  다시 왼쪽 공간에 넣어라.
		 * -=  : 왼쪽의 공간 안의 값에 오른쪽의 값을 뺀 후 
		 * 		  다시 왼쪽 공간에 넣어라.
		 * 
		 * *=  : 왼쪽의 공간 안의 값에 오른쪽의 값을 곱한 후 
		 * 		  다시 왼쪽 공간에 넣어라.
		 * 
		 * /=  : 왼쪽의 공간 안의 값에 오른쪽의 값을 나눈 후
		 *  	  다시 왼쪽 공간에 넣어라.
		 *  
		 * %=  : 왼쪽의 공간 안의 값에 오른쪽의 값을 나눈 나머지를 
		 * 		  다시 왼쪽 공간에 넣어라. 
		 *  
		 *  
		 *  
		 *  
		 */
		
		int num = 10 , result;
		
		System.out.println("num : " + num); 
		
		// num의 값에서 3을 증가 시키기 
		//num = num + 3; 
		num += 3;
		
		System.out.println("num + 3 : " + num);
		
		// 다른 복합대입 연산자 써보기 
		num -= 3; 
		System.out.println("num - 3 : " + num);
		
		num *= 3;
		System.out.println("num * 3 : " + num);
		
		num /= 3;
		System.out.println("num / 3 : " + num);
		
		num %= 3;
		System.out.println("num % 3 : " + num);
		
		
		
		
		
		
		
	}
	
	
}
