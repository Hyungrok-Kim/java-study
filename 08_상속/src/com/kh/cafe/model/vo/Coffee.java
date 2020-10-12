package com.kh.cafe.model.vo;

public class Coffee extends Drink {
	// Drink가 가진 기본 정보 전부 상속받기 
	private int shot; // 샷 추가 
	
	public Coffee() {
		super();
	}

	public Coffee(String name, String origin, String size, int price) {
		super(name, origin, size, price);
		
	}

	public Coffee(String name, String origin, String size, int price, int shot) {
		super(name, origin, size, price);
		this.shot = shot;
	}

	public int getShot() {
		return shot;
	}


	public void setShot(int shot) {
		this.shot = shot;
	}
	
	@Override
	public String drinkInfo() {
		return super.drinkInfo() + ", " + shot + "잔 추가함";
	}
	
}
