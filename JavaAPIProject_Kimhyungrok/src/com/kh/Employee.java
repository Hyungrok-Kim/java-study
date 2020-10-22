package com.kh;

public class Employee {
	
	String ename;//사원명
	int age;//나이
	int sal;//급여
	double tax;//세율(소수둘째자리)

	public Employee() {}
	
	public Employee(String ename, int age, int sal, double tax) {
		this.ename = ename;
		this.age = age;
		this.sal = sal;
		this.tax = tax;
	}
	
	public String EmpInfo() {
		
		return ename + "," + age + "," + sal + "," + tax + "% \n 실제 급여 :" + (sal-(sal*(tax/100)));
		
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
}
