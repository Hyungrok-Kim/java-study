package com.kh.member.model.vo;

public class Silver extends Member {

	public Silver() {}
	
	public Silver(String name, String grade, int point) {
		super(name,grade,point);
	}

	@Override
	public double getIncen() {
		// TODO Auto-generated method stub
		return super.getPoint() * 0.01;
	}
	
	
}
