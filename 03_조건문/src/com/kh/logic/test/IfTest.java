package com.kh.logic.test;

import java.util.Scanner;

public class IfTest {
	/*
	 * if 문은 특정 조건을 만족시킬 때 
	 * 실행할 구문을 구현하는 조건문이다.
	 * 순서도에서 마름모 역할을 한다.
	 * 
	 */
	public void testMethod1() {
		// 기본적인 if문
		// 마스크 착용 유무를 입력받아 
		// 마스크를 착용해주세요 혹은 이용해주셔서 감사합니다.
		// 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("마스크를 착용하셨나요? (Y/N) : ");
		char answer = sc.next().charAt(0);
		
		// 입력받은 값을 비교하여
		// 상황에 따른 결과 출력하기
		
		if (answer == 'Y' || answer == 'y') {
			
			System.out.println("이용해 주셔서 감사합니다!");
			
		}
		else {
			// 위의 조건을 만족하지 않는 / 조건문이 거짓인 나머지 상황
			System.out.println("마스크를 반드시 착용해주세요!" );
			
		}
			
	}
	
	public void testMethod2() {
		// 조건에 따른 결과가 3개 이상일 경우 
		// if-else if 를 사용한다.
		
		// 국어, 영어, 수학, 점수를 입력받아 
		// 평균에 따른 성적 구하기
		
		/*
		 * - 기준 - 
		 * 평균이 90점 이상이면 A
		 * 평균이 80점 이상이면 B
		 * 평균이 70점 이상이면 C
		 * 평균이 60점 이상이면 D
		 * 아니면 F 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//안내 문구
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int mat = sc.nextInt();
		
		int avg = (kor + eng + mat)/3;
		
		String grade = "";
		
		if (avg  >= 90) {
			grade = "A";
		}
		else if(avg >= 80) {
			grade = "B";
		}
		else if(avg >= 70) {
			grade = "C";
		}
		else if(avg >= 60) {
			grade = "D";
		}
		else {
			grade = "F";	
		}
		
		System.out.println("당신의 성적은" + grade + " 입니다.");
		
	}
	
	public void testSimya() {
		// if문을 활용하여 메뉴판 만들기
		
		// 1. 메뉴판 출력하기 
		System.out.println("-- 김진호's 심야식당 ver 1.0 --");
		System.out.println("1. 떡볶이");
		System.out.println("2. 닭똥집");
		System.out.println("3. 두리안");
		System.out.println("4. 취두부");
		System.out.println("5. 솔의눈");
		
		System.out.println("---------------------------");
		
		// 2. 사용자에게 메뉴 고르게 하기
		System.out.print("메뉴나 선택하든지 : ");
		Scanner sc = new Scanner(System.in);
		
		int selectMenu = sc.nextInt();
		
		if(selectMenu == 1) {
			
			System.out.println("떡볶이를 선택하셨습니다.");
			System.out.println("가격은 5000원입니다. (4인 이상 주문)");
			
		} else if (selectMenu == 2) {
			System.out.println("닭똥집을 선택하셨습니다.");
			System.out.println("가격은 30000원입니다. (단일 메뉴)");
			
			
		} else if (selectMenu == 3) {
			System.out.println("두리안을 선택하셨습니다.");
			System.out.println("두리안은 서비스입니다. (Take out 비용 별도)");
			
		} else if (selectMenu == 4) {
			System.out.println("취두부 선택하셨습니다.");
			System.out.println("가격은 100000원 입니다. (VAT 별도)");
			
		} else if (selectMenu == 5) {
			System.out.println("솔의눈울 선택하셨습니다.");
			System.out.println("가격은 7500원 입니다.");
			
		} else {
			System.out.println("잘못 선택하셨습니다.");
			System.out.println("ㄲ ㅈ ~!");
		}
		
		
		
		
	}
	
	public void testMethod3() {
		// 다중 if문 (중첩 if문) 구현하기 
		
		// 학생 점수 입력 받아 성적을 표시하되
		// 90점 이상 A --> 95점 이상 A+
		// 80점 이상 B --> 85점 이상 B+
		// 70점 이상 C --> 75점 이상 C+
		// 70점 미만 F
		
		// ** 각 점수가 F 점수 보다 높고,
		// 	  5점 이상이면 '+' 추가하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 점수 입력 :");
		
		int score = sc.nextInt();
		
		String grade = "";
		
		if (score >= 90) { // score >= 90보다 , score > 89가 아주 미세한 차이로 빠름. >만 처리하면 되니까. >=는 >한번 =한번 처리해야함.
			grade = "A";
			if (score >= 95) {
				grade += "+";
			}
		} 
		else if(score >= 80){
			grade = "B";
			if (score >= 85) {
				grade += "+";
			}
		}
		else if(score >= 70) {
			grade = "C";
			if (score >= 75) {
				grade += "+";
			}
		}
		else {
			grade = "F";
		}
		
		System.out.print("당신의 성적은" + grade + " 입니다." );
	}
	
	public void exercise() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--김형록's 과일 가게 ver 1.0--");
		System.out.println("사과");
		System.out.println("바나나");
		System.out.println("복숭아");
		System.out.println("키위");
		System.out.println("------------------");
		
		System.out.print("과일 이름을 골라 주세요 :");
		String fruit = sc.next();
		String fruit2 = "";
		int price = 0;
		
		if (fruit.equals("사과")) {
			fruit2 = "사과";
			price = 1000;
			
		}
		else if(fruit.equals("바나나")) {
			fruit2 = "바나나";
			price = 3000;
			
		}
		else if(fruit.equals("복숭아")) {
			fruit2 = "복숭아";
			price = 2000;
			
		}
		else if(fruit.equals("키위")) {
			fruit2 = "키위";
			price = 5000;
			
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		System.out.printf("%s - %d원", fruit2 , price );
	}
	
	
}
