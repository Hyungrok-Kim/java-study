package com.kh.obj.model.vo;

public class Main_3 {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.name = "김지노";
		s1.hakbun = "1004";
		s1.score = 150;
		
		Student s2 = new Student("홍길동");
				
		s2.sayMyname();
		s1.sayMyname();
		
		System.out.println(s2.printName() + "은 학생입니다.");
		
		s1.setGender('M');
		s2.setGender('F');
		
		// s1.gender; private 이기 때문에 외부에서 함부로 접근할 수 없다
		
		System.out.println("s1 gender : " + s1.getGender());
		System.out.println("s2 gender : " + s2.getGender());
		
	}

}
