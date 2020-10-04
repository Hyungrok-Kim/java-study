package com.kh.logic.test;

import java.util.Scanner;

public class SwitchTest {
	/*
	 * Switch 문은 특정 조건문을 작성하는 것이 아니라
	 * 조건에 들어가는 문장의 결과 값에 따라
	 * 해당 값과 일치하는 문장을 실행하는 조건문
	 * [사용 형식]
	 * int select = 000;
	 * 
	 * switch(select) {
	 * 		case 값1 : ........... break;
	 * 		case 값2 : ........... break;
	 * 			...
	 * 		default : ...........[break]; // 브레이크는 쓸 수도 있고 안쓸 수도 있음 마지막엔
	 * }
	 * 
	 * 
	 */
	
	Scanner sc = new Scanner(System.in);
	
	public void testSwitch1() {
		// switch문을 활용한 메뉴판 만들기 
		
		System.out.println("--김진호's 소주창고 ver 1.0  --");
		System.out.println("1. 청주 ");
		System.out.println("2. 탁주");
		System.out.println("3. 학주");
		System.out.println("4. 주주");
		System.out.println("5. 호주");
		System.out.println("--------------------------");
		
		
		//1. 안내문구
		System.out.println("메뉴 선택 : ");
		int selectMenu = sc.nextInt();
		
		// switch문 사용하기
		switch(selectMenu) {
		case 1 : // if(selectMenu == 1)
			System.out.println("청주를 선택하셨습니다.");
			break;
			
		case 2 : 
			System.out.println("탁주를 선택하셨습니다.");
			break;
			
		case 3 :
			System.out.println("학주를 선택하셨습니다.");
			break;
		
		case 4 : 
			System.out.println("주주를 선택하셨습니다.");
			break;
			
		case 5 :
			System.out.println("호주를 선택하셨습니다.");
			break;
			
		default : //else의 역할 
			System.out.println("잘못 선택");
			break;
		}
		
		}
		
	public void testSwitch2() {
		// fall-through 현상	
		// switch에서 각 case 별로 break;를
		// 사용하지 않았을 때 발생하는 현상
		// 현재 실행할 case 구문 뿐만 아니라 
		// 다른 구문마저도 실행해버린다.
		
		// 일반적으로 이러한 현상을 방지하기 위해
		// break; 를 잘 작성해야 하겠으나,
		// 반대로 이를 응용한 코드도 작성 가능하다.
		
		// 한자리의 정수를 입력받아 
		// 그 수가 짝수인지, 홀수인지 판단하는 코드 
		
		System.out.print("한 자리 정수 입력 : ");
		int num = sc.nextInt() % 10; // 입력받은 수의 나머지를 num에 주입
		
		switch(num) {
		case 1 : 
		case 3 : 
		case 5 : 
		case 7 : 
		case 9 : 
			System.out.println("홀수입니다!");
			break;
			
		case 2 :
		case 4 :
		case 6 :
		case 8 :
			System.out.println("짝수입니다!");
			break;
			
		default : 
			System.out.println("잘못 입력 하셨습니다.");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public void testSwitch3() {
		// Switch 조건에 들어갈 값은 
		// 숫자외에도 문자열과 문자도 가능하다.
		// 단 , 비교할 자료형은 모두 같아야 한다.
		
		// 간단한 사칙연산 계산기 만들기
		
		System.out.println("김형록의 간단 계산기.");

		System.out.print("첫 번째 수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 수 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("수행할 사칙연산 입력 :");
		char oper = sc.next().charAt(0);
		
		int result = 0;
		
		switch(oper) {
		
		case '+' :
			result = num1 + num2;
			break;
			
		case '-' :
			result = num1 - num2;
			break;
		
		case '*' :
			result = num1 * num2;
			break;
			
		case '/' :
			result = num1 / num2;
			break;
		
		case '%' :
			result = num1 % num2;
			break;
			
		default : 
			System.out.println("현재 지원하지 않는 연산자 입니다.");
			return; // 현재 실행 중인 메소드를 강제 종료하는 명령어 
			
		}
		
		System.out.printf("%d %c %d = %d \n", num1, oper , num2, result);
		
		
		
		
	}
	
	public void testSwitch4() {
		// Switch 조건에 들어갈 수 있는 것은 
		// 숫자, 문자, 문자열과 같은 값 뿐이며,
		// 조건식이나 계산식은 들어갈 수 없다.
		//
		// 날이 좋은 날, 그는 그녀를 만나 
		// 자신의 성적을 자랑하고 싶었다.
		// 총점 100점 만점에 
		// 90점 이상은 A,
		// 80점 이상은 B,
		// 70점 이상은 C,
		// 그 미만은 F인 시험에서 
		// 100점을 맞았기 때문이다.
		// 이 날, 그는 그녀를 만나기 전 
		// 개발자인 당신을 만나 switch로 
		// 성적을 계산하는 프로그램을 짜달라고 하였다.
		// 모든 날이 좋았다. 
		// [문재] 다음 내용에서 주인공인 개발자가 되어 만들었을 코드를 직접 구현하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 :");
		int score = sc.nextInt();
		//int score = sc.nextInt();
		
				
		switch(score/10){
		case 10 : case 9 : 
			System.out.println("A");
			break;
		case 8 : 
			System.out.println("B");
			break;
		case 7 : 
			System.out.println("C");
			break;
		default : 
			System.out.println("F");
			break;
			
		}
		
	}
}
