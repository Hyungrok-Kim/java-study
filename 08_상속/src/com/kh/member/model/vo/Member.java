package com.kh.member.model.vo;

public class Member {
	// 1. 필드 변수 
	private String name;
	private String grade;
	private int point;
	
	// 2. 생성자
	
	public Member() {
		
	}
	
	public Member(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
		
	}
	
	// 3. 메소드

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	
	// 모든 등급이 사용할 수 있는 
	// 등급별 포인트 적립 메소드
	
	public double getIncen() {
		return point * 0.0;
	}
	
	
}
