package com.kh.exception;

import java.io.IOException;

public class SuperClass {
	// 예외를 처리하는 메소드
	// 자식에게 예외처리를 하는 메소들들
	// 물려주는 클래스
	
	public SuperClass() {}
	
	public void testMethod() throws IOException{
		System.out.println("IO 예외가 발생할 수 있는 메소드 입니다.");
	}
}

