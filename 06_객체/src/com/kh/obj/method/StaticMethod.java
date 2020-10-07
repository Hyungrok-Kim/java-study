package com.kh.obj.method;

public class StaticMethod {
	// 프로그램 실행 시 static 메모리 영역에 보관되며 
	// 프로그램 종료 시 static 메모리에서 제거된다. 
	
	// 1. 매개 변수 x, 리턴 타입 x
	public static void methodA() {
		
		System.out.println("안녕하세요, 환영합니다~!");
		
	}
	
	// 2. 매개 변수 x, 리턴 타입 O
	
	public static String methodB() {
		return "샤토네프-뒤-빠프";
	}
	
	
	// 3. 매개 변수 o, 리턴 타입 x
	
	public static void methodC(String name, String msg) {
		
		System.out.println(name + " : " + msg);
	}

	
	// 4. 매개 변수 o, 리턴 타입 o 
	public static String methodD(String name) {
		
		return name + " : 오늘 일을 내일로 미루지 말자.";
		
	}
}
