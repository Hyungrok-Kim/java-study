package com.kh.interfaceTest;

import java.io.Serializable;

/*
 * 상속
 * 미완성 클래스 혹은 클래스 : extends
 * 인터페이스 : implements 
 * (인터페이스는 여러 개 상속 받을 수 있다.) 
 * 
 */

public class TV extends Product 
				implements IProduct, Serializable{ 
	
	// 미완성 메소드를 통해 상속받을 자식 클래스에게 
	// 반드시 구현해야 할 기능 제공 메소드를 강제화 시킬 수가 있다.
	
	@Override
	public void display() {
		// 미완성 클래스에서 온 미완성 메소드 
		
		
	}

	@Override
	public void testMethod2() {
		// 인터페이스에서 온 미완성 메소드
		
	}

	@Override
	public void testMethod3() {
		// 인터페이스에서 온 미완성 메소드
		
	}
	

}
