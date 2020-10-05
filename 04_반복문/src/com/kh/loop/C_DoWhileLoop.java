package com.kh.loop;

import java.util.*;

public class C_DoWhileLoop {

	Scanner sc = new Scanner(System.in);
	
	public void beforeDoWhile() {
		// 기존의 while문은
		// 실행 조건이 참 / 거짓 이냐에 따라 
		// 실행이 한 번도 되지 않는 경우가 
		// 생길 수 있다!
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		//while (num < 5) {
		//	System.out.println("Hello World!");
		//	num++;
			
		//}
		
		
		// while의 경우 조건을 먼저 비교하기 때문에
		// 조건에 맞지 않으면 실행을 하지 않는다.
		// 하지만, 만약 최소 한 번은 꼭 실행해야 한다면?
		
		do {
			
			System.out.println("Hello World!");
			num ++;
			
		}while(num < 5);
		
		// do-while 은 조건식이 밑에 존재하여 최소 한 번은 
		// 꼭 실행 할 수 있다!
		
	}
	
	public void testDoWhile() {
		// do-while 사용 형식
		// do {
		//  ...
		// } while(조건식);
		
		// 키보드로 문자열을 입력받아 
		// 화면에 출력하기 
		// 단, '나가기' 라는 문자열을 입력하면 
		// 프로그램 종료하기 
		
		String msg = null;
		// 컴퓨터 상 아무것도 없는 공간 'null'이라고 함.
		// 문자열은 사용자가 입력하기 전까지 얼마나 긴 내용이 
		// 들어올 지 알 수 없다.
		
		// 따라서, 이러한 문자열은 
		// Heap 메모리 공간에 
		// 또한 해당 공간에 저장된 주소(의 고유번호)를 변수에 전달하며, 
		// 변수에 전달하며, 변수명.equals("비교할 값")으로 
		// 주소의 고유번호가 아닌 실제 값을 비교하도록 
		// 해야 한다.
		
		do {
		
			System.out.println("문자열 : ");
			msg = sc.next();
			
			System.out.println("입력한 문자열은 : " + msg + "입니다.");
			
		}while(!msg.equals("나가기")); // equals의 반대 연산자는 앞에 !붙여주면 됨.
		
		
		
		
	}
	public void testDoWhile2() {
		// 문자열 입력 시 
		// 해당 문자열을 화면에 출력하기 
		// 단, exit라는 문자열이 입력 되면 
		// 프로그램 종료하기 
		String str = null;
		
		do {
			System.out.println("문자열 입력 : " );
			
			str = sc.next();
			if(str.equals("exit")) {
			 System.out.println("프로그램을 종료합니다.");
			 break;
				} 
			else { // 입력한 문자열이 exit이 아니라면

				System.out.println("입력한 문자열은 : " + str + "입니다.");
				
			}
			
		}while(!str.equals("exit"));
		
	}
	
	
	
}
