package com.kh.set;

import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		TreeSet tset = new TreeSet();
		
		tset.add("Car");
		tset.add("Ear");
		tset.add("Air");
		tset.add("Bear");
		tset.add("Deer");
		
		
		// treeset 은 안에 저장되는 값(데이터)들을 
		// 오름차순으로 자동 정렬해주는 기능을 가지는 set이다.
		System.out.println(tset);

	}

}
