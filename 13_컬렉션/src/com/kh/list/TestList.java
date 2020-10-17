package com.kh.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestList {
	   // List :
	   //   자료를 저장하는 구조(자료구조) 형태 중,
	   //   순서가 유지되고 중복을 허용하는 자료구조 기법을 말한다.
	   //   자바에서는 ArrayList, Vector, LinkedList 등이 있다.
	   //   이 중 ArrayList와 Vector는 기능이 동일하나
	   //   Vector는 ThreadSafe 기능이 있고, ArrayList는 ThreadSafe
	   //   기능이 없는 클래스이다.
	
	   // main + Ctrl + space바 
	public static void main(String[] args) {
		// ArrayList 연습 
		
		ArrayList listA = new ArrayList();
		
		// 다형성을 적용한다면 
		//List listB = new ArrayList();
		//Collection listC = new ArrayList();
		
		// 특징 1. list 자료형에 어떠한 값이든 다 넣을 수 있다. 
		listA.add("주말");
		listA.add(12345);   // 기본 자료형의 경우 
		listA.add(true);	// 일반 값이 wrapper 클래스로 바뀌면서
		listA.add(64.58);	// 객체화되어 들어간다.
		listA.add('수');		// int 값 -> Integer(Object의 후손)
							// 오토박싱(Auto Boxing)
		
		// 2. 입력한 순서대로 값이 차곡차곡 들어간다.(순서 유지) 
		System.out.println(listA); //** 주소값이 안나오고 바로 값이 나오는 걸 보니 ** toString() 메소드 오버라이딩(재정의) 되어 있음.
		
		// 순서가 유지되므로 반복문을 활용할 수 있다.
		// for문을 활용한 출력
		//					arr.length()와 같음 , list는 size로!
		for(int i = 0; i < listA.size(); i++) {
			System.out.println(listA.get(i)); // arr[i]처럼 
		}
		
		listA.add("주말");
		listA.add('수');
		// 중복 가능
		
		System.out.println("listA :" + listA);
		
		// 4. 배열의 중간 값도 쉽게 바꿀 수 있다. 
		listA.set(3, "포카칩");
		
		System.out.println("list A : " + listA);
		
		// 5. 배열 중간의 값 삭제도 편하다!
		// 리스트를 사용하면 배열 중간의 값을 삭제할 때 
		// 알아서 앞으로 한 칸씩 이동한다.
		listA.remove(4);
		
		System.out.println("listA : " + listA);
		
		// 6. 정렬도 기본적으로 제공한다. 
		
		ArrayList sortList = new ArrayList();
		
		sortList.add("포카칩");
		sortList.add("썬칩");
		sortList.add("스윙칩");
		sortList.add("꼬북칩");
		sortList.add("허니버터칩");
		
		System.out.println("정렬 전 : " + sortList);
		
		// 오름차순 정렬  (ASCending)
		Collections.sort(sortList);
		
		System.out.println("오름차순 정렬 결과 : " + sortList);
		
		// 내림차순 정렬 (DESCending)
		
		Iterator iter = new LinkedList(sortList).descendingIterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
