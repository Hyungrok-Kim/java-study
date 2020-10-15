package com.kh.exception.silsub;

public class NumberProcess {
	
	public NumberProcess() {}
	
	public int checkDiv(int num1, int num2) throws DivException {
		// 만약 문제 상황이 발생할 경우
		// "어떤 수를 0으로 나눌 수 없습니다. " 출력하기
		
		int result = 0;
		
		try {
			result = num1/num2;
		//}catch(ArithmeticException e){ // uncheckedException
		}catch(Exception e) { // 사용자 정의 예외(Exception) 처리
			throw new DivException("관리자에게 문의하세요 !");
			//System.out.println("관리자에게 문의하세요.(Tel : 010-1234-1234)");	
		}
		
		return result;
	}
}
