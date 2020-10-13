package com.kh.interfaceTest;

// 미완성 클래스
public abstract class Product {
	
	public Product() {}
	
	// 일반 메소드 
	public void printProduct() {
		System.out.println("제품 정보 입니다.");
	}
	
	// 미완성된 메소드 
	public abstract void display();
	
	// 미완성된 메소드를 모아놓은것이 겉표면만 있다고 해서 인터페이스 
}
