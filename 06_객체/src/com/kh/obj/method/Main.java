package com.kh.obj.method;

public class Main {

	public static void main(String[] args) {
		/*
		// 메소드 테스트용 실행 메소드 
		MethodTest t1 = new MethodTest();
		
		//t1.methodA(); // 메소드는 메모리 Stack영역에서 관리한다.
		
		NonStaticMethod nsm = new NonStaticMethod();
		//nsm.methodA();
		System.out.println(nsm.methodB());
		
		nsm.methodC("김형록");
		System.out.println(nsm.methodD(10, 15));
		*/
		
		/*
		StaticMethod.methodA();
		System.out.println(StaticMethod.methodB());
		StaticMethod.methodC("김형록" , "이라고 합니다.");
		System.out.println(StaticMethod.methodD("김형록"));
		*/
		
		OverloadingTest ot = new OverloadingTest();
		
		ot.isZero(150); //0이 아닙니다.
		ot.isZero(0.0); //0 입니다!
		ot.isZero('0'); //0 입니다.
		
		System.out.println("문자열입니다.");
		System.out.println(120.34);
		System.out.println(150);
		
		
	}

}
