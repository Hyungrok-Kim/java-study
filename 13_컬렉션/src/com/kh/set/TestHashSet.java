package com.kh.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	// Set : 
	//  자료 구조 유형 중 List와 대조되는 특성을 가진 기법,
	//	순서 유지 X, 중복 허용 X, 
	//	이를 집합이라고도 부른다.
	//	Set의 종류는 HashSet, TreeSet, LinkedHashSet 등이 있다.
	
	
	public static void main(String[] args) {
		// HashSet 연습 
		HashSet hset = new HashSet();
		
		// 다형성을 활용할 경우 
		// Set setA = new HashSet();
		// Collection setB = new HashSet();

		hset.add("가을");
		hset.add(12345);
		hset.add(true);
		hset.add(128.15);
		hset.add('수');
		
		System.out.println(hset);
		System.out.println("hset의 갯수 : " + hset.size());
		System.out.println("특정 값을 포함하고 있는지 : " + hset.contains("가을"));
		
		hset.add("여름");
		
		System.out.println(hset);
		
		// 1. set의 내용을 배열로 만들어
		// 만들어 하나씩 꺼내는 방법 
		
		Object[] oArr = hset.toArray();
		
		for(Object obj : oArr) {
			System.out.println(obj);
		}
		
		// 2. set의 각 요소를 
		// 순서가 없는 목록처럼 만들어 
		// 그냥 나열된 순서대로 하나씩 꺼내는 방법 
		// 목록 : (Iterator)
		Iterator iter = hset.iterator();
		
		// 다음에 꺼내 올 요소가 있는지 확인 
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		// set 비우기 
		hset.clear();
		
		System.out.println(hset);
		System.out.println("비었는지 확인 : " + hset.isEmpty());
		
	}

}
