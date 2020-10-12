package com.kh.inherit;

// final을 붙이면 Child2에 대한 자식이 더이상 생기지 않도록 못박아두는 것.

public final class Child2 extends Parents{
	
	
	// 기본 생성자
	public Child2() {
		super(); 
		// 기본적으로 super() 메소드가 생략된다.
	}
	
	
	@Override
	public String print() {
		return "자식 2입니다.";
	}
	

}
