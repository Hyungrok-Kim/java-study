package com.kh.myObj.model.vo;

public class MemberShip {
	// 1. 필드 변수 선언 
	private String name; // 이름 
	private char gender; // 성별
	private String birth; // 생년월일 (YYYY-MM-DD)
	private int age; // 나이
	private String tel; // 연락처 
	//alt + Shift + a를 누르면 단체 지정으로 다같이 쓰고 다같이 복사하는게 가능함.
	//alt + Shift + a를 다시 누르면 해제됨
	
	// 2. 생성자  (기본 생성자와 이름을 받는 생성자)
	public MemberShip() {
		
	}
	
	public MemberShip(String name) {
		this.name = name;
	}
	
	public MemberShip(String name, char gender,  String birth, int age, String tel) {
		this.name = name;
		this.gender = gender;
		this.birth = birth;
		this.age = age;
		this.tel = tel;
		
		
	}
	
	// 3. 기능 제공 메소드 
	
	// -1. 필드 변수에 대한 Getter & Setter 구현
	// -- Getter -- //나중에는 자동으로 만들어주기때문에 자동으로 만들어질때 이러한 형식으로 만들어져서 하나의 약속임.
	public String getName() {
		return name;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getBirth() {
		return birth;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getTel() {
		return tel;
	}
	
	// -- Setter --
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	// -2. 회원의 모든 정보를 출력하는 memberInfo() 메소드 구현하기 
	//     매개변수 (x), 리턴타입 (x),  논스테틱인 내용으로 
	
	public void memberInfo() {
		
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + (gender == 'M' ? "남성" : "여성"));
		System.out.println("생년월일 : " + birth);
		System.out.println("나이 : " + age);
		System.out.println("전화번호 : " + tel);
		
		
	}
	
}
