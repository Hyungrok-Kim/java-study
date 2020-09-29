package com.kh.op.test;

public class A_증감연산자_01 {
	
	// ++ : +1 의 의미를 지닌 연산자
	// -- : -1 의 의미를 지닌 연산자
	
	// 단일로 사용할 경우 값 자체 증가(감소)의 의미를 지니고, 
	// 어느 위치에서 연산을 수행해도 ( ++a / a++ ) 
	// 같은 결과가 나온다. 
	
	public void testMethod1() {
		
		int num = 100;
		
		System.out.println("현재 num의 숫자는?" + num);
		
		++num;	//전위 연산자
		
		System.out.println("++후의 num의 숫자는?" + num);
		
		num++;	//후위 연산자
		
		System.out.println("++후의 num의 숫자는?" + num);
		
		 // num = num + 1;
		
		--num;
		
		System.out.println("--후의 num의 숫자는?" + num);
		
		num--;
		
		System.out.println("--후의 num의 숫자는?" + num);
		
		
	}
	
	
	public void testMethod2() {
		// 다른 연산이 연관될 경우 증감 연산자 차이점
		
		int num = 10;
		
		int result1 = ++num + 3;
		// 전위 연산자 : 어떠한 연산을 함께 수행할 때,
		//			 현재 전위 연산을 먼저 수행하겠다. 
		
		
		System.out.println("result1 : " + result1);
		System.out.println("num : " + num);
		
		System.out.println("-------------------");
		
		int num2 = 10;
		int result2 = num2++ + 3;
		// 후위 연산자 : 어떠한 연산을 함께 수행할 때에
		//		   	  다른 연산을 먼저 수행하고, 자신을 나중에 수행하는 연산
		
		
		System.out.println("result2 : " + result2);
		System.out.println("num2 : " + num2);
		
		
		
		
		
		
		
	}
	
	
	
}
