package com.kh.var;

import java.util.Scanner;

public class InputVariable {
	// 기능 제공용 클래스 
	// Java 1.5 버전 이전
	
	
	// Java 1.5 버전 이후부터는 키보드의 입력값을 위보다 쉽게 
	// 처리하게 되었다.
	public void inputMethod2() {
		// System.in : 키보드(입력자원) 
		// System.out : 모니터(출력자원) 
		// System.err : 표준 에러 출력 
		
		// Scanner : 각각의 자료형 별로 
		// 			 키보드의 입력값을 처리해주는 객체 
		
		Scanner sc = new Scanner(System.in); 
		
		// 키보드 입력을 위한 변수 공간 선언
		String name; // 이름 
		int   point; // 점수
		double avg;  // 평균
	
		// 화면의 값을 입력받기 위한 안내 메시지 출력하기 
		
		System.out.print("이름을 입력하세요 : " );
		name = sc.nextLine();
		
		System.out.print("점수를 입력하세요 : ");
		point = sc.nextInt();
		
		System.out.print("평균을 입력하세요 : ");
		avg = sc.nextDouble();
		
		// 키보드로 입력한 내용 출력하기 
		System.out.println("이름 : " + name);
		System.out.println("포인트 : " + point);
		System.out.println("평균 :" + avg);
		
	}
	
	public void myInputMethod() {
		// 기본 자료형 3가지 이상을 사용하여 
		// 도서 정보를 입력받는 프로그램 만들어보기 
		// 단, Scanner 을 사용하며 ,
		// 변수의 이름은 aaa, bbb (x)
		// 그럴듯하게 직접 지어 사용하세요.! 
		
		String bookname;
		int price; 
		boolean buy;
		short stock;
		
		Scanner ac = new Scanner(System.in);
		//java.util.Scanner ac = new java.util.Scanner(System.in);
		// 풀패키지(풀클래스명) : 사용하려는 자바 클래스 파일의 이름을 
		//					 해당 클래스가 속한 모든 패키지명을 기술하여 
		//					 선언하는 것을 말한다.
		//					 만약, 사용하려는 클래스가 여러 개 있고, 그 클래스들의 
		//					 이름이 같다면 이렇게 풀패키지명으로 선언하여 사용해야 한다!
		
		
		System.out.print("도서 이름을 입력하세요 :");
		bookname = ac.nextLine();
		System.out.print("책 가격을 입력하세요 : " );
		price = ac.nextInt();
		System.out.print("재고가 있나요 : ");
		buy = ac.nextBoolean();
		if (buy == true) {
			System.out.print("재고 수 : " );
			stock = ac.nextShort();
			
			System.out.println("도서 이름은 : " + bookname);
			System.out.println("책 가격은 : " + price);
			System.out.println("구매 가능 여부는  : " + buy);
			System.out.println("재고 수 : " + stock);
		}
		else if(buy == false) {
			stock = 0;
			
			System.out.println("도서 이름은 : " + bookname);
			System.out.println("책 가격은 : " + price);
			System.out.println("구매 가능 여부는  : " + buy);
			System.out.println("재고 수 : " + stock);

		}
		
		
		}
	}

