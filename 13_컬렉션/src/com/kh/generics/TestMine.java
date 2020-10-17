package com.kh.generics;

public class TestMine {

	public static void main(String[] args) {
		// 내가 만든 자료형 My Generics
		
		String[] arr = { "월", "화", "수" };
		
		MyGenerics<String> my1 = new MyGenerics<>(arr);
		
		my1.output();
		
		Integer[] arr2 = {100, 200, 300 ,400 ,500};
		
		MyGenerics<Integer> my2 = new MyGenerics<Integer>(arr2);
		my2.output();
	}

}
