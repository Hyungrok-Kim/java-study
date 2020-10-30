package com.kh.op.test;

import java.util.Scanner;

public class I_MyOperator {
	
	public void testMyMethod() {
		// 삼항 연산자, 일반 논리 연산자를 사용하여 
		// 카페 음료를 취향에 따라 선택하는 코드 만들기 
		// ex) 뜨거운 음료 ? : true
		//     사이즈 ? : small
		//     가격 ? : 4000 >= / 크면 카페모카 / 작으면 아아
		//	> : name 님은 000 음료 small 사이즈를 추천합니다. 
		
		boolean O;
		boolean size;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("고객명 : ");
		String name = sc.next();
		
		System.out.println("뜨거운 음료를 드시겠습니까?");
		O = sc.nextBoolean();
		
		System.out.println("사이즈는 small을 고르시겠습니까?");
		size = sc.nextBoolean();
		
		System.out.println("소지금은 얼마입니까?");
		int money = sc.nextInt();
		
		//뜨겁고 차갑고 
		//small big
		//4000이상, 이하
		
		
		String result = (O == true) ? ((size == true) ? ((money >= 4000) ? "뜨거운 카페모카 small 사이즈를  추천합니다." : "뜨거운 아아 small 사이즈를 추천합니다. ") : 
			(money >= 4000) ? "뜨거운 카페모카 big 사이즈를 추천합니다." : "뜨거운 아아 big 사이즈를 추천합니다.") 
				: ((size == true) ? ((money >= 4000) ? "차가운 카페모카 small사이즈를 추천합니다." : "차가운 아아 small사이즈를 추천합니다.") : ((money >= 4000) ? "차가운 카페모카 big 사이즈를 추천합니다." : "차가운 아아 big 사이즈를 추천합니다."));
		
		
		System.out.println(name +"님은 " + result);
		
		
		// next(), nextInt(), nextDouble(), nextBoolean()은 모두 엔터값을 읽지 않음. 
		// 오직 nextLine()만이 엔터값까지 읽음. 
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
