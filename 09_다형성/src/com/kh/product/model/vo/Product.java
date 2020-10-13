package com.kh.product.model.vo;

public abstract class Product {
	// 1. 필드 변수 
	private String modelName; // 제품명 
	private int price; // 제품가격
	
	// 2. 생성자
	public Product() {}

	public Product(String modelName, int price) {
		super();
		this.modelName = modelName;
		this.price = price;
	}

	// 3. 메소드
	
	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// 공통 메소드
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	// abstract : 미완성
	// 만약 메소드의 내용을 직접 만들 수 없거나 
	// 다른 자식들이 해당 메소드를 반드시 만들어야 하지만,
	// 그 내용이 각기 다른 경우, 해당 메소드의 구현부({})를
	// 작성하지 않고 미완성된 상태에서 선언하는 메소드
	public abstract void display();
	
}
