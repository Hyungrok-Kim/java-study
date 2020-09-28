// 1. 패키지 생성

package com.kh.var;

// 2. 클래스 생성(앞글자는 대문자로 !) 

public class TestVariable {
	
	// 기능 제공 메소드 만들기 
	public void method1() {
	
			// 일반 데이터 출력
			System.out.println(2500000);
			
			// ----------------------//
			
			// 변수 사용하기
			// 공간(변수) <- 값
			// 공간에 값을 대입해라! 
			int sal = 2500000;
			
			System.out.println(sal);
			
			
	}
	
	public void method2() {
		// 변수 선언하기 
		
		// 1. 변수 선언(회원 정보)
		String name; // 이름 - String (문자열) 
		String num;// 전화번호 - String (문자열)
		String id;// 아이디 - String (문자열)
		String pw;// 비밀번호 - String (문자열)
		char gender;// 성별 - char
		double hei;// 신장 - double (숫자형)
		double wei;// 몸무게 - double (숫자형)
		int age;// 나이 - int (숫자형)
		boolean mrg;// 결혼여부 - boolean
		
		// 2. 선언한 변수에 값 대입하기(넣기) 
		name = "박재현";
		num = "0106589****";
		id = "angeloutus";
		pw = "angeloutus123";
		gender = 'M'; //한 단어를 넣을때는 싱글 쿼테이션
		hei = 183.3;
		wei = 83.3;
		age = 25;
		mrg = false;
		
		// 3. 변수 안의 값 확인하기 
		System.out.println(name);
		System.out.println(num);
		System.out.println(pw);
		System.out.println(gender);
		System.out.println(hei);
		System.out.println(wei);
		System.out.println(age);
		System.out.println(mrg);
		
		
		
	} 
	
}
