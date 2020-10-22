package com.kh;

import java.util.Scanner;

public class ExamTest {

	public static void main(String[] args) {
		ExamString es = new ExamString();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 입력 :");
		
		String answk = sc.next();
		
		System.out.println(es.preChar(answk));
		
		System.out.println("---------------");
		
		System.out.println("문자열 입력 2 : ");
		String answk2 = sc.next();
		System.out.println("문자 입력 :" );
		char ch2 = sc.next().charAt(0);
		
		System.out.println("포함된 갯수 : "+ es.charSu(answk2, ch2));
		
		
		
		
		
	}

}
