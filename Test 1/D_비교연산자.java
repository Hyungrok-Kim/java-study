package com.kh.op.test;

public class D_비교연산자 {
	/*
	 *  비교 연산자( = 관계 연산자 )
	 *   --> 두 개의 값을 비교하는 연산자 
	 *   
	 *   해당 조건을 만족하면 true,
	 *   만족하지 않으면 false
	 *   
	 *   == :   ex) A == B : A와 B의 값이 같다. 
	 *   != :   ex) A != B : A와 B는 다르다.
	 *   >  :   ex) A > B : A는 B보다 크다.
	 *   <  :   ex) A < B : A는 B보다 작다. 
	 *   >= :   ex) A >= B : A는 B보다 크거나 같다. (B 이상이다.) 
	 *   <= :   ex) A <= B : A는 B보다 작거나 같다. (B 이하이다.)
	 *   
	 */
	
	public void testMethod() {
		/*
		int a = 10;
		int b = 20;
		*/
		
		int a = 10 , b = 20;
		boolean result1, result2, result3;
		
		result1 = (a == b); // false
		result2 = (a <= b); // true
		result3 = (a > b ); // false
		System.out.println("result1 : "  + result1);
		System.out.println("result2 : "  + result2);
		System.out.println("result3 : "  + result3);
		
	}
}
