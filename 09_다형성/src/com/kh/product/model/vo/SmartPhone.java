package com.kh.product.model.vo;

public class SmartPhone extends Product {

	private boolean telFn; // 전화 유무
	
	public SmartPhone() {}
	
	public SmartPhone(String modelName, int price) {
		super(modelName, price);
	}
	
	
	@Override
	public void display() {
		System.out.println(super.getModelName() + " : " 
				+ "휴대폰 화면으로 전화를 합니다. ");
	} 
	
	

}
