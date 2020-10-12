package com.kh.cafe.run;

import com.kh.cafe.model.vo.Book;
import com.kh.cafe.model.vo.Coffee;
import com.kh.cafe.model.vo.Drink;
import com.kh.cafe.model.vo.Tea;

public class Main {

	public static void main(String[] args) {
		
		
		Coffee c1 = new Coffee("아메리카노", "듁스", "벤티", 7000, 1);
		Coffee c2 = new Coffee("아메리카노", "한국", "라지", 18000 ,3);
		
		System.out.println(c1.drinkInfo());
		System.out.println(c2.drinkInfo());
		
		Tea t1 = new Tea("캐모마일", "국산" , "일반" , 4500, true, "4계절");
		Tea t2 = new Tea("자몽티", "캘리포니아" , "일반", 5200, false, "겨울");
		Tea t3 = new Tea("반팔티", "동대문", "라지", 5500, true, "여름");
		
		System.out.println(t1.drinkInfo());
		System.out.println(t2.drinkInfo());
		System.out.println(t3.drinkInfo());
		
		Drink d1 = new Drink("팥죽맛음료", "자판기" , "캔" , 2500);
		
		System.out.println("------------------");
	
		Book bk1 = new Book("네크로노미콘", "사탄", 666);
		
		// 참조 자료형의 경우
		// 단순히 system.out으로 객체 이름을 
		// 출력할 때 자동으로 .toString() 이라는 
		// 메소드가 실행되며 문자열로 바뀐 결과가 나온다. 
		
		System.out.println(bk1); //아래의 bk1.toString()과 같은 결과 
		System.out.println(bk1.toString());
		
		Book bk2 = new Book("네크로노미콘", "사탄", 666);
		
		System.out.println(bk1 == bk2); //주소가 다르니까 false
		System.out.println(bk1.equals(bk2));
		
		
	}

}
