package com.kh.obj.method;

public class MethodTest {

	// 메소드는 다른 메소드를 호출할 수 있다!
	
	public void methodA() {
		System.out.println("메소드 A입니다. ");
		
		methodB();
	}
	
	public void methodB() {
		System.out.println("메소드 B입니다. ");
		
		methodC();
	}
	
	public void methodC() {
		
		System.out.println("메소드 C입니다. ");
		
	}
}
