package com.kh.map;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

	// Map :
	//   데이터를 저장할 때
	//   각각의 자료를 구분 지을 수 있는
	//   고유의 값을 정하여 해당 값으로
	//   접근할 수 있는 실제 객체를 묶어
	//   함께 관리하는 자료 구조 클래스
	//   해당 객체를 저장할 때에,
	//   Key(고유의 값)는 Set의 특성으로,
	//   Value(실제 객체)는 List의 특성으로
	//   관리한다.
	//   종류는 크게 HashMap, HashTable, TreeMap,
	//   Properties 등이 있다.
	
	
	public static void main(String[] args) {
		// HashMap 사용하기
		
		HashMap map = new HashMap();
		
		// Map map = new HashMap();
		
		// 1. key는 순서가 유지되지 않는다.
		
		map.put("user01", "안녕하세요, 저는 user01입니다.");
		map.put("오늘 하루", new Date());
		map.put(123, 456); // 리터럴 -- 박싱 -> 래퍼클래스(Wrapper Class)
		
		System.out.println(map);
		
		// 2. key는 중복되지 않는다.
		//	   똑같은 key를 넣으면 새로운 value로 덮어 씌워진다.
		map.put("user01" , "안냐세요@_@, 저는 user01임둥!" );
		
		System.out.println(map);
		
		
		// 3. value는 중복이 허용된다.
		
		map.put("user02", "안냐세요@_@, 저는 user02임둥!");
		System.out.println(map);
		
		// 각 key에 해당하는 값을 각각 출력할 수도 있다.
		
		System.out.println("user01 : " + map.get("user01"));
		System.out.println("123 :" + map.get(123));
		System.out.println("오늘 하루  :" + map.get("오늘 하루"));

		System.out.println("오늘 하루  :" + map.get("user02"));
		
		System.out.println("--------------------");
		// 저장된 map 객체를 하나씩 꺼내오는 방법 
		// 1. keySet() 메소드를 사용하여 
		// set을 하나씩 꺼냈던 것 처럼
		// key를 하나씩 꺼내는 방법 
		
		Set keys = map.keySet();
		
		Iterator iter = keys.iterator();
		
		while(iter.hasNext()) {
			// key를 하나씩 꺼내어 
			// value를 찾아오는 방법
			Object key = iter.next();
			System.out.println(map.get(key));
		}
		
		System.out.println("------------------");
		
		//2. values() 메소드를 사용하는 방법
		
		Collection values = map.values();
		
		Iterator iter2 = values.iterator();
		
		while(iter2.hasNext()) {
			
			System.out.println(iter2.next());
		}
		
		System.out.println("---------------");
		// 3. Map.Entry 객체 사용하여
		//    key와, value를 한 쌍으로 꺼내는 방법
		
		Set entrySet = map.entrySet();
		
		Iterator iter3 = entrySet.iterator();
		
		
		while(iter3.hasNext()) {
			// key와 value를 모두 꺼내어 
			// 하나의 entry 객체로 담는다. 
			Map.Entry entry = (Map.Entry)iter3.next();
			
			// key와 value를 분리한다.
			Object key = entry.getKey();
			Object value = entry.getValue();
			
			System.out.println("entry : " + entry);
			System.out.println(key +  " : "+ value);
			
		}
		
		
	}

}
