package com.kh.wrapper;

public class WrapperTest {
	// 래퍼클래스란,
	// 기본 자료형들을 
	// 참조자료형처럼 사용하여 
	// 여러 부가적인 메소드(기능)을 포함시킨 클래스를 말한다.
	
	public static void main(String[] args) {
		WrapperTest wt = new WrapperTest();
		wt.wrapperTest();
	}
	
	public void wrapperTest() {
		// String을 특정 자료형으로 바꾸는 방법 
		// 어떠한 데이터가 그 형태를 완전히 바꾸는 것을 
		// parse라고 한다. 
		
		// 문자열 --> 숫자  (기본 자료형) 
		byte b = Byte.parseByte("7");
		short s = Short.parseShort("300");
		int i = Integer.parseInt("1001");
		
		float f = Float.parseFloat("3.14");
		double d = Double.parseDouble("3.141");
		
		char ch = "apple".charAt(0);
		
		// 기본 자료형 --> 문자열
		String str1 = String.valueOf(123);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		String str4 = String.valueOf('A');
		
		// 각 자료형이 가진 최소 / 최댓값을 가지고 있다.
		
		// int 의 최솟값 / 최대값 
		
		System.out.println("int 최솟값 : " + Integer.MIN_VALUE);
		System.out.println("int 최댓값 : " + Integer.MAX_VALUE);
		System.out.println("int byte 수 : " + Integer.BYTES);
		
		
	}
	
	
	

}
