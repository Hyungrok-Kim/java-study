package com.kh.obj.method;

public class OverloadingTest {
	// 오버로딩(Overloaing)
	// 다른 매개변수를 가진, 같은 이름의 메소드를 선언할 때 
	// 사용하는 기술 , 즉 , (= 메소드명 재활용) 
	
	// 일반적으로 메소드는 주어진 매개변수를 사용하여
	// 정해진 소스코드를 실행하는 기능을 지닌다.
	// 이 때, 만약 같은 기능을 실행하는 메소드일 경우
	// 굳이 이름을 여러 개로 만들 필요가 있을까?
    // 이런 문제점에 착안하여 같은 기능을 실행하되
    // 사용하는 매개변수가 다르면 같은 이름을 가지도록
    // 하는 기술이 오버로딩이다.
	   
	// ex)
	//   - 덧셈을 수행하는 메소드 
	//	 public int sumInt(int num1, int num2);
	//	 public double sumDouble(double num1, double num2);
	//	 public double sumIntDouble(int num1, double num2);
	
	// 	 public int sum(int num1, int num2);
	//   public double sum(double num1, double num2); // 메소드 이름들을 통일하자!!!
	//   ....
	
	// 1. 오버로딩 구현하기 
	public void isZero(int num) {
		if(num == 0) {
			System.out.println("0 입니다.");
		}
		else {
			System.out.println("0이 아닙니다.");
		}
		
	}
	
	public void isZero(double num) {
		if(num == 0.0) {
			System.out.println("0 입니다!");
		}
		else {
			System.out.println("0이 아닙니다 !");
		}
	}
	
	public void isZero(char ch) {
		if(ch == '0') {
			System.out.println("0 입니다.");
		}
		else {
			System.out.println("0이 아니잖아요.");
		}
	}
	
	/*
	 * 오버로딩 주의사항
	 * 1. 메소드 명이 반드시 같아야 한다. (메소드 명이 이미 다르면 오버로딩이 아님)
	 * 2. 매개변수의 자료형, 선언 순서가 반드시 달라야 한다. 
	 * 3. 리턴타입, 접근 제한자는 오버로딩과 관련이 없다. 
	 */
	
	
	public int sum(int num1, int num2) {
		return (num1 + num2);
	}
	
	public double sum(int num1, double num2) {
		return (num1+num2);
	}
	
	public double sum(double num1, int num2) {
		return (num1 + num2);
	} // 두번째랑 세번쨰랑 num1, num2의 자료형만 바뀌었을 뿐인데 인정해줌.
	
	// 안되는 경우
	/*
	// 1. 메소드 매개변수가 같을 경우 
	public int sum(int num1, int num2) {
		return (num1 + num2);
	}
	
	// 2. 리턴만 다를 경우 
	public double sum(int num1, int num2) {
		return (num1 + num2);
	}
	
	// 3. 접근 제한자가 다를 경우 
	
	private int sum(int num1, int num2) {
		return (num1 + num2);
	}
	*/
	
	
	
	
	
	
	
	
}
