package com.kh.inherit;

public class Child1 extends Parents {
	// Parents 클래스의 코드를 그대로 상속받아 
	// 재사용하는 클래스
	
	public Child1() {}
	
	
	public Child1(int num1, String str) {
		super(num1, str); 
		// 부모 생성자 호출 시엔 
		// super() 라는 메소드를 사용한다. 
		// 상속관계에 있어서는 생성자가 반드시 존재해야한다.
		
		
	}
	
	/*
	 * @ : 어노테이션(Annotation)
	 * 	  JVA이 컴파일할 때, 해당 코드를 
	 *    읽고 어떤 처리를 해야 하는지 
	 *    가이드하기 위한 명령어 
	 */
	
	@Override    // 부모의 메소드 재정의! 부모의 메소드 이름과 똑같이
	public String print() {
		return "자식 : " + this.getNum1() + ", " + this.getStr();
	}
	
	public void myPrintFn() {
		System.out.println("내가 바로 첫째다 !");
	}
}
