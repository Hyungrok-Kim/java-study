package com.kh.test.duck.model.vo;

public class Mallard extends Duck{

	private String location;
	private String color;
	
	public Mallard() {
		super();
		
	}
	public Mallard(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "주 서식지는" + location + "이며, 색상은"
				+ color + "입니다.";
	}
	
	
	
	@Override
    public void quack() {
		System.out.println(super.toString() + "주 서식지는" + location + "이며, 색상은"
				+ color + "입니다.");
	}
	
	
	
	
}
