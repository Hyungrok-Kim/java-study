package com.kh.inherit;

public class Main {

	public static void main(String[] args) {
		Parents p = new Parents(1, "나는 부모입니다.");
		
		System.out.println(p.print());
		
		Child1 c1 = new Child1(2, "나는 첫째 자식입니다.");
		System.out.println(c1.print());
		c1.myPrintFn();
		
		Child2 c2 = new Child2();
		
		System.out.println(c2.print());
		
		GrandChild3 c3 = new GrandChild3();
		
	}

}
