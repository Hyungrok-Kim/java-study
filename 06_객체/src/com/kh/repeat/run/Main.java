package com.kh.repeat.run;

import com.kh.repeat.model.vo.Person;

public class Main {

	public static void main(String[] args) {
		// 실행 전용 메소드
		
		Person p1 = new Person();
		
		System.out.println(p1.personInfo());
		
		p1.setName("고길동");
		
		System.out.println(p1.personInfo());
		
		Person p2 = new Person("홍길동", 'M', 50, "서울시 강남구",
				"010-1234-1234"); // Setter와 같은 순서로 넣어야됨.
		
		System.out.println(p2.personInfo());

	}

}
