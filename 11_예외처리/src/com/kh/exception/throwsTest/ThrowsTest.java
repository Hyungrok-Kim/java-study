package com.kh.exception.throwsTest;

public class ThrowsTest {
	// 예외상황을 발생시키고
	// 어떻게 처리하는 지 확인하기 위한
	// 메소드 그룹을 가진 클래스 
	
	public void methodA() throws Exception {
		System.out.println("저는 메소드 김지노입니다.");
		
		methodB();
		
		System.out.println("저 퇴근할게요~! :)");
		
	}
	
	public void methodB() throws Exception {
		System.out.println("저는 메소드 최진캐슬입니다. ^_^");
		
		methodC();
		
		System.out.println("저 퇴근 할게욤 ^-^");
	}
	
	public void methodC() throws Exception {
		System.out.println("저는 해외 메소드 스테틱환입니다. -__-");
		
		// 강제로 예외상황(에러)를 발생시키는 명령어 
		throw new Exception("화재 상황 발생!");
		
		// 예외상황이 발생했을 때 
		// 예외가 발생한 코드까지만 수행하고 
		// 끝나기 때문에 그 아래의 코드는 수행하지 않는다. 
		// System.out.println("저 일 끝났어요 ~ -_-");
	}
}
