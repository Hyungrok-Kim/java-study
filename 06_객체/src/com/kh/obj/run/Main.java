package com.kh.obj.run;

import com.kh.obj.model.vo.InitTest;
public class Main {

	public static void main(String[] args) {
		// 단순 실행 전용 메소드 
		
		// 객체를 	사용하는 방법
		// 1. 기본 생성자를 통해 만드는 방법
		// 클래스명 변수명(객체의 별칭) = new class명();
		//                       ------------- 생성자
		
		/*
		Human h1 = new Human();
		
		System.out.println("h1 주소 고유 번호 확인 :" + h1); //heap이라는 곳에 저장이 됐다. 
		h1.name = "홍길동";
		
		h1.sayMyName();
		
		// 2. 사용자 정의 생성자로 만드는 방법 
		Human h2 = new Human("고길동");
		System.out.println("h2 주소 고유 번호 확인 :" + h2);
		
		h2.sayMyName();
		
		System.out.println(FieldTest.count);
		*/
		
		InitTest i = new InitTest();
		
		int num1 = i.getNum1();
		int num2 = i.getNum2();
		System.out.println(num1 + " / " + num2);
		
		InitTest j = new InitTest(10, 20);
		System.out.println(j.getNum1() + " / " + j.getNum2());
		
		
		System.out.println("i 의 num3 : " + i.getNum3());
		i.setNum3(10);
		System.out.println("i 의 num3 : " + i.getNum3());
		System.out.println("j 의 num3 : " + j.getNum3());
	}

}
