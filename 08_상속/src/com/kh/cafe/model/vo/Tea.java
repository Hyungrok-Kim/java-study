package com.kh.cafe.model.vo;

public class Tea extends Drink {
	private boolean isChi; // 알코올 유무 
	private String season; // 계절 설명 
	
	public Tea() {}

	public Tea(String name, String origin, String size, int price) {
		super(name, origin, size, price);
	}
	
	public Tea(String name, String origin, String size, int price , boolean ischi, 
			String season) {
		// super()나 this() 생성자 참조 메소드는 
		// 반드시 생성자 선언 내의 첫 줄에 위치해야 한다.
		super(name, origin, size, price);  
		this.isChi = ischi;
		this.season = season;
	}

	public boolean isChi() {
		return isChi;
	}

	public void setChi(boolean isChi) {
		this.isChi = isChi;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	@Override
	public String drinkInfo() {
		// TODO Auto-generated method stub
		return super.drinkInfo() + ", 알코올 유무 :" + isChi + ", " +season
				+ "상품";
	}
	
	

}
