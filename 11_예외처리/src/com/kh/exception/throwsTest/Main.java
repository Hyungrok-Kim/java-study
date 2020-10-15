package com.kh.exception.throwsTest;

public class Main {

	public static void main(String[] args) throws Exception {
		ThrowsTest tt = new ThrowsTest();
		
		// 문제가 발생하는 예외 구문을
		// try-catch 구문으로 묶어 
		// 직접 예외 상황 시 처리할 코드를 
		// 작성할 수 있다.
		try {
			// 문제가 발생할 수 있는 코드 
			tt.methodA();
		}catch(Exception e) {
			// 예외(문제)가 발생한 시점에 동작할 대체 내용을 작성
			//e.printStackTrace();
			
			System.out.println("-- 실행 중 에러 발생 --");
			System.out.println("관리자에게 문의하세요.");
		} finally {
			// 예외가 발생하든 하지 않든
			// 무조건 실행할 코드를 작성하는 영역
			System.out.println("실행한 것들을 마무리 합니다. ");
		}
		
		System.out.println("프로그램 정상 종료! (업무 끝)");
		
	}

}
