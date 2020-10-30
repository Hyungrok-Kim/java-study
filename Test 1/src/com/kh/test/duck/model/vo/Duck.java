package com.kh.test.duck.model.vo;

public abstract class Duck {
	private String name;
	private String kinds;
	public Duck() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Duck(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}


	public String toString() {
		
		return "저는" + kinds + "이고, 이름은" + name + "입니다.";
	}
	
    public abstract void quack();
}
