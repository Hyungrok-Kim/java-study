package com.kh.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		// 기존의 저장 순서가 유지되지 않던 
		// HashSet의 단점을 보완한 클래스(자료구조)
		
		Set lset = new LinkedHashSet();
		
		lset.add("아메리카노");
		lset.add("크로와상샌드위치");
		lset.add("아이스크림");
		lset.add("마카롱");
		lset.add("초코칩쿠키");
		
		System.out.println("lset : " + lset);
		
	}

}
