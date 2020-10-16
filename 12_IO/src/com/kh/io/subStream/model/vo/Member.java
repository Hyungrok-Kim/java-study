package com.kh.io.subStream.model.vo;

import java.io.Serializable;

/*
 * MVC : 프로그램 설계 기법
 * Model View Controller
 * 프로그램을 만들 때, 백지에서 만드는 것이 아니라
 * 일정한 형식을 바탕으로 만드는 기법을 설계 기법이라고 한다.
 * 
 * 이 중 MVC 설계 기법은 많은 기업에서 활용하고 있는
 * 생산성을 향상시키는 기법이다.
 * 
 * Model : 데이터, 객체를 선언하는 패키지 
 *         객체 선언 및 데이터 저장, 읽기 등에 쓰이는
 *         클래스를 가진다.
 *         
 *   - VO (Value Object) : 데이터 저장, 읽기에 쓰이는 객체 
 *     (DTO : Data Transfer Object)
 *     (Domain Object, Bean, Entity . . . )
 *   
 *   - DAO (Data Access Object) : VO를 저장, 읽는 등의 기능을
 *                                담당하는 클래스
 *   
 *   - Service : 회원 가입, 회원 정보 수정, 회원 탈퇴 등의 기능이
 *               하나의 회원 관리 서비스로 묶이듯, 각 기능들을
 *               하나의 서비스 단위로 묶어 관리하는 패키지
 *               
 * ----------------------------------------------
 * 
 * View : 사용자 화면을 담당하는 패키지
 *    - java : 메뉴 화면 출력 메소드
 *    - Web  : jsp / html / css 등의 화면 파일
 * 
 * ----------------------------------------------
 * 
 * Controller : 사용자 화면과 Service 기능을 연결하는
 *              패키지
 *     - java : Manager 클래스
 *     - Web  : Servlet 클래스         
 */
public class Member implements Serializable {
	// VO 의 조건
	// 1. 모든 필드는 반드시 private여야 한다.
	// 2. 기본 생성자와 Getter & Setter를 반드시 포함해야 한다.
	// 3. 직렬화 처리가 되어야 한다.
	
	// 직렬화
	// 객체를 다른 프로그램, 운영체제에 전달할 때
	// 여러 필드를 한 줄로 구성하여 처리함으로써
	// 서로 다른 컴퓨터 구조를 가지더라도
	// 전달하는 객체를 올바르게 인식시키는 기술
	// 1. 필드 변수
	private String name;    // 이름
	private int age;        // 나이
	private String address; // 주소
	private String phone;   // 연락처
	
	// 2. 생성자
	public Member() { }

	public Member(String name, int age, String address, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}

	// 3. Getter & Setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return name+", " + age + ", " + address + ", " + phone;
	}
}
