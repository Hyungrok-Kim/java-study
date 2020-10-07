package com.kh.obj.method;

public class NonStaticMethod {
	// 매개 변수 유무, 반환 자료형 유무
	// 스태틱 예약어를 사용하지 않는 일반 메소드
	
	// 1. 매개 변수가 없고, 반환 자료형이 없는 (return X)
	public void methodA() {
		// 아무 값도 받지 않고, 
		// 실행 후 돌려주는 값도 없는 메소드 
		// 본인의 역할을 수행한 뒤 
		// 자신을 호출했던 라인으로 돌아간다. 
		
		System.out.println("단순 실행 메소드입니다.");
		
		return; // 원래는 메소드 끝에 return일고 반드시 적어줘야하는데 void return일 경우 
				// return 명령어를 생략해도 JVM에 의해 자동으로 추가한다. 
	}
	
	// 2. 매개 변수가 없고, 반환 자료형이 있는(return O)
	public String methodB() {
		// 만약 메소드 실행 후 돌려주는 결과가 있다면,
		// 즉 void가 아니라면 반드시 해당 리턴 타입으로 결과를 
		// 반환해야 한다. 
		// 말이 좀 어렵지만 return하면 된다는 뜻
		String str = "촉촉한나라의초코칩공주가안촉촉함";
		
		return str;
	}
	
	// 3. 매개 변수가 있고, 리턴타입 x
	public void methodC(String name) {
		System.out.println(name + "이 그린기린그림은 목이 긴 기린 그림");
		
	}
	
	// 4. 매개 변수 O , 리턴타입 O 
	public int methodD(int num1, int num2) {
		// 양수이면 1을, 음수이면 -1을 돌려주는 메소드
		int result;
		
		if(num1 - num2 > 0) {
			result = 1;
		}
		else {
			result = -1;
		}
		
		return result;
	}
	
}
