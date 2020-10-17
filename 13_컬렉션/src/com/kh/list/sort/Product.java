package com.kh.list.sort;

public class Product {
	// 1. 필드 변수 
	private String name; // 이름 
	private int price; // 가격 
	private double discount; // 할인율 
	
	
	
	// 2. 
	public Product() {
		super();
	}
	
	public Product(String name, int price, double discount) {
		super();
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	
	
	// 3. 기능 제공 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", discount=" + discount + "]";
	}
	
	
	
	
	
	
}
