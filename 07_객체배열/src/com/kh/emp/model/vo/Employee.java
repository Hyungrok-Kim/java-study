package com.kh.emp.model.vo;

public class Employee {
	// 사원 클래스 구현하기 
	// 1. 필드 변수 선언 
	private String name; // 사원명
	private int empNo; // 사원번호 
	private int age; // 사원 나이
	private String phone; // 사원 연락처 
	private int salary; // 사원 급여 
	
	// 2. 생성자
	//기본 생성자
	public Employee() {
		
	}
	
	//사용자 정의 생성자
	public Employee(String name, int empNo, int age, String phone, int salary) {
		this.name = name;
		this.empNo = empNo;
		this.age = age;
		this.phone = phone;
		this.salary = salary;
	}
	
	// 3. 메소드
	// 사원 정보 출력용 메소드
	public String empInfo() {
		
		return name + "," + empNo + "," + age + "," + phone + "," + salary;
	}
	
	// Getter
	public String getName() {
		return name;
	}
	
	
	public int getEmpNo() {
		return empNo;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public int getSalary() {
		return salary;
	}
	
	// 단축기 !! Alt + Shift + 'S'
	

	// Setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
