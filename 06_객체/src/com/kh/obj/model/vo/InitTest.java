package com.kh.obj.model.vo;

public class InitTest {
	// 객체의 필드를 초기화하는 방법 
	// JVM -> 필드 선언 시 초기화 -> 초기화 블럭 -> 생성자를 통한 초기화 
	// 1. JVM이 명시한 초기값을 사용하는 경우
	private int num1; // int의 가장 기본값인 0으로 JVM이 명시 
	
	// 2. 필드 선언과 동시에 초기화하는 방법 
	
	private int num2 = 10; // 10 
	
	// [3. 초기화 블럭을 사용할 경우]
	{
		//num1 =100; 
		//
		num2 = 300;
		
		int sum = num1 + num2;
	}
	
	// static 변수 초기화의 경우 
	private static int num3 = 100; // JVM 초기화하면 0  또는  선언 시 초기화 가능
	
	static { // static 변수 전용 초기화 블럭 
		
		num3 = 150;
		
	}
	// 4. 생성자를 통해 초기화하는 방법 
	public InitTest() { // 기본 생성자 
		this.num1 = 7;
		this.num2 = 77;
	}
	
	public InitTest(int num1, int num2) {
		// 사용자 정의 생성자 
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public InitTest(int su) {
		this(su, su);
		
		this.num2 = 700; // 별도로 선언이 가능하다.
	}
	
	// Getter & Setter 
	// Getter
	public int getNum1() {
		return num1;
	}
		
	public int getNum2() {
		return num2;
	}
	
	public int getNum3() {
		return InitTest.num3; //static은 this를 사용하지 않는다. static은 공유 용도로 사용  공유용도기때문에 저는 이라는 this를 사용하지 않음.
		// static의 경우 객체 모두가 
		// 하나의 num3를 공유하는 개념이기 때문에 
		// this. 이라는 명령어를 사용하지 않는다.
		
	}
	// Setter
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public void setNum3(int num3) {
		InitTest.num3 = num3;
	}
}


