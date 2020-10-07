package com.kh.obj.run;

import com.kh.obj.model.vo.Student;

public class Main_2 {

	public static void main(String[] args) {
		
		Student kimZino = new Student(); // import는 ctrl + shift + 영문자 o
		
		kimZino.name = "김지노";
		// 다른 패키지의 클래스에서 해당 객체 정보를
		// 함부로 바꾸지 못하게 막는 것 -> 접근 제한자 
		// 막았더니 해당 정보가 안보임(not visible) -> 정보 은닉
		//kimZino.hakbun = "200824001";
		//kimZino.score = 80;
		//kimZino.gender = 'M';
		
		//System.out.println(kimZino.name +"는 " + kimZino.gender + " 입니다.");

		Student s2 = new Student();
		
		System.out.println(kimZino);
		System.out.println(s2);
		
		//kimZino.gender = 'F'; 
		
		
	}

}
