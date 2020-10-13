package com.kh.product.model.vo;

public class Tablet extends Product {

	private boolean usePen;
	
	public Tablet() {}
	
	public Tablet(String modelName, int price) {
		super(modelName, price);
	}
	
	
	@Override
	public void display() {
		System.out.println(super.getModelName() + " : "
				+ "태블릿 화면에 필기합니다.");
		// TODO Auto-generated method stub

	}

}
