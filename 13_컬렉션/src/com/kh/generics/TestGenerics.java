package com.kh.generics;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {

	public static void main(String[] args) {
		// 제네릭스란, 여러 자료형을 받을 수 있는
		// 컬렉션을 하나의 자료형만 받도록 제한하는 기술 
		
		// Book --> Object
		// Book --> Book
		
		// [사용형식]
		// 컬렉션클래스<사용할 타입> 변수명
		
		// 책만 받는 리스트를 만들겠다 !	( Java 8 버전부터 뒤에 <Book>생략해도 됨! 단 모양은 맞춰줘야 함 )
		ArrayList<Book> list = new ArrayList<>();
		
		list.add(new Book("향수"));
		// list.add(new Car()); <Book> 책만 받겠다. 
		
		// list 자체에서 Book 만을 받도록 한정 지었기 때문에 
		// 꺼낼 때도 Book만 꺼낸다.
		for(Book bk : list) {
			System.out.println(bk);
		}
		
		// ---------
		// ArrayList list2를 선언하여 Car 객체만 받을 수 있도록 
		// 한정 지은 뒤, Car 객체 5개를 안에 넣고 하나씩 
		// 출력하는 코드 작성해보기 
		
		
		ArrayList<Car> list2 = new ArrayList<>();
		list2.add(new Car("유자차"));
		list2.add(new Car("전기차"));
		list2.add(new Car("현기차"));
		list2.add(new Car("마트차"));
		list2.add(new Car("차차차"));
		
		for(Car c : list2) {
			System.out.println(c);
		}
		
		new TestGenerics().printCar(list2);
		
		
	}
	
	public void printCar(List<Car> clist) {
		for(Car c : clist) {
			System.out.println(c);
		}
	}
	

}
