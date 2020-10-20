package com.loop;

import java.util.Scanner;

public class ForWhile {

	Scanner sc = new Scanner(System.in);

	
	public void printStar1() {
		System.out.println("정수 하나 입력 :");
		int num = sc.nextInt();
		
		if(num > 0 ) {
			for(int i = 1; i <= num; i++) {
				for(int j = 1; j < i; j++) {
					System.out.print("*");
				}
				System.out.println(i);
			}
		}
		else{
			System.out.println("양수가 아닙니다.");
		}
			
	}

	public void printStar2() {
		System.out.println("정수 입력 :");
		int num = sc.nextInt();
		
		if(num > 0) {
			for(int i = 0; i <= num; i++) {
				for(int j= 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		else if(num < 0){
			
			num *= -1;
			
			for (int i = 0; i <= num; i++) {
				String byul = "";
				for(int j = 0; j <= num; j++) {
					byul += (j > i) ? "*" : " ";
					
				}
				System.out.println(byul); 
			}
		}
		else {
			System.out.println("출력 기능이 없습니다.");
		}
			
	}
	
	public void countInputCharacter() {
		String str = "";
		int total = 0;
		
		boolean  yn = false;
		
		System.out.print("문자열 입력 : ");
		str = sc.next();
		char ch[] = new char[str.length()];
		
		for(int i = 0; i < ch.length; i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'z') {
				ch[i] = str.charAt(i);
				yn = true;
			}
			else{
				yn = false;
			}
		}
		
		if(yn == true) {
			System.out.print("문자 입력 :");
			char ch2 = sc.next().charAt(0);
			
			for (int i = 0; i < ch.length; i++) {
				if(ch[i] == ch2) {
					total++;
				}
				
			}
		
			System.out.println("포함된 갯수 : " + total);	
		}
		else {
			System.out.println("영문자가 아닙니다.");
		}
		
		//System.out.print("문자 입력 : ");

//		if(str == "[A-Z]")
//		for (int i = 0; i < ch.length; i++) {
//			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'z') 
//			{
//			ch[i] = str.charAt(i);
//			}
//			else {
//				System.out.println("영문자가 아닙니다.");
//				break;
//			}
//		}
//		
		
//		if(str.charAt() >= 'A' && str.charAt() <= 'z') {
//			for(int i = 0 ; i < ch.length; i++) {
//				ch[i] = str.charAt(i);
//			} 
//		}
//		else {
//			System.out.println("영문자가 아닙니다.");			
//		}
		
		
		
	}
}


