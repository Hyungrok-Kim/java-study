package com.kh.test;

public class test2 {

	public static void main(String[] args) {
		Object[] sarr = new String[3];
		
		
		try {
			
		sarr[0] = new String("123");
		sarr[1] = String.valueOf(new Integer(456));
		sarr[2] = (String) new Object();
		sarr[3] = String.valueOf(789);
		
		}catch(ClassCastException c) {
			System.out.println("형변환 할 수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 초과하였습니다.");
		}
		
		
		
		for(Object obj : sarr) {
			System.out.println(obj);
		}

	}

}
