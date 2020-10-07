package com.kh.repeat.model.vo;

public class Person {	
	// 1. 추상화를 통해 필드 변수 도출하기
	// private (-) / default(~) / protected(#) / public (+)
	private String name; // 이름
	private char gender; // 성별
	private int age; // 나이 
	private String addr; // 주소
	private String tel; // 연락처
	
	// 2. 생성자
	// - 기본 생성자(default constructor)
	// 만약 우리가 생성자를 정의하지 않으면 
	// 기본적으로 JVM에 의해 생성된다.
	// 단, 상속 관계에 있어 기본 생성자는 자동으로 
	// 만들어 주지 않는다.
	public Person() {}
	
	// - 사용자 정의 생성자 
	public Person(String name, char gender, int age, String addr, String tel) {
		this.name = name; //지역변수의 이름과 전역변수의 이름이 같을 때 this를 붙여준다.
		this.gender = gender;
		this.age = age;
		this.addr = addr;
		this.tel = tel;
	}
	
	public Person(String name,String addr, String tel,  char gender, int age) {
		this.name = name; //지역변수의 이름과 전역변수의 이름이 같을 때 this를 붙여준다.
		this.gender = gender;
		this.age = age;
		this.addr = addr;
		this.tel = tel;
	}
	
	// 3. 기능 제공 메소드 (이 안에 Getter 와 Setter도 포함되는 것)
	public String personInfo() {
		
		return name + "," + gender + "," + age + "," + addr + "," + tel;
		
	}
	
	// Getter & Setter
	// Getter - 사용자의 정보 하나를 가져오는 역할
	public String getName() {
		return name;
	}
	
	// Setter - 사용자의 정보 하나를 세팅하는 역할 (즉 변경하거나 수정하거나, 대입하는 역할)
	public void setName(String name) {
		this.name = name;
	}
}
