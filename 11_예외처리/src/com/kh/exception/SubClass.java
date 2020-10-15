package com.kh.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {
	// 자식 메소드는 
	// 부모로부터 전달된 throws Exception 을 
	// 그대로 상속 받아 사용하거나 
	// 부모에 정의된 Exception 보다 하위 Exception을 
	// 정의할 수 있다.
	
	/*
	@Override
	public void testMethod() throws FileNotFoundException{
		// 자식이 부모보다 더 낮은(하위의) 예외를 던지는 것은
		// 전혀 문제가 되지 않는다.
	}
	*/
	
//	@Override
//	public void testMethod() throws IOException{
//		// 부모와 같은 예외가 발생해도 문제가 되지 않는다.
//	}
	
	/*
	@Override
	public void testMethod() throws Exception{
		//부모보다 더 노픈 단계이거나,
		//부모와 관련없는 Exception을 작성하면 
		//오버라이딩 할 수 없다.
	}
	*/
	
	
}
