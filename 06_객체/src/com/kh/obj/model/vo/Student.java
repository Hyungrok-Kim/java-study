package com.kh.obj.model.vo;

public class Student {
	
	// 1. 필드 변수 (속성 / 멤버 / 전역 = global) 
	// public > protected > default > private ㄴ
	public String name; // 이름 (Abstraction 추상화)
	protected String hakbun; // 학번
	int score; // 성적
	private char gender; // 성별
	
	// 2. 생성자 (무언가 만들고, 무언가 주고 시작하려고) 
	public Student() {
		// 기본 생성자
	}
	
	public Student(String name) {
		// 사용자 정의 생성자 
		this.name = name;
	}
	
	// 3. 기능 제공 메소드
	public void sayMyname() {
		System.out.println(this.name + "입니다.");
	}
	
	public String printName() {
		return name;
	}	
	
	
	// 4. Getter & Setter (기능 제공 메소드) 
	// 다른 기능제공 메소드와 다르게 
	// private로 선언된 필드 변수를
	// 밖에서 불러올 수 없어 편의를 위해 
	// 만드는 기능 제공 메소드
	// Getter : 필드 변수의 값을 불러오는 메소드
	// [사용 형식] 
	// public 필드 변수의 자료형 get필드변수명() {
	// 			return 필드변수명;
	//	}
	
	public String getName() {
		return name;
	}
	
	public char getGender() {
		return gender;
	}
	
	// Setter : 필드 변수의 값을 전달받은 매개변수의 값으로 
	// 			변경해주는 메소드
	// [사용형식]
	// public void set필드변수명(필드변수 자료형 변수명){
	// 		this.필드변수명 = 변수명;
	//	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
}














