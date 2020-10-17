package com.kh.list.sort;

import java.util.ArrayList;

public class ObjectSort {

	public static void main(String[] args) {
		// 객체 리스트 준비하기 
		
		ArrayList list = new ArrayList();
		list.add(new Product("러버덕", 20000000, 0.01));
		list.add(new Product("아이폰11", 1000000, 0.05));
		list.add(new Product("cpu_i7-7700", 400000, 0.1 ));
		
		System.out.println("list : " + list);
		

		for(Object obj : list) {
			System.out.println(obj);
		}
		
		// 가격 기준 오름차순 정렬하기
		// list.sort(정렬의 기준역할을 할 클래스);
		list.sort(new AscPrice());
	}

}
