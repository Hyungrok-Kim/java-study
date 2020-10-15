package com.kh.silsub2;

import java.util.Scanner;

public class TestSilsub {

	public static void main(String[] args) {
		TestSilsub ts = new TestSilsub();
		ts.testMethod();

	}

	public void testMethod(){
		Scanner sc = new Scanner(System.in);
		CharacterProcess cp = new CharacterProcess();
		int str = 0;
		
		try {
		System.out.println("문자열 입력 :");
		str = cp.countAlpha(sc.nextLine());
		
		System.out.println("영문자는 " + str + "입니다.");
		}catch(CharCheckException e) {
			System.out.println(e.getMessage());
		}
		
		}
		
		
	}

