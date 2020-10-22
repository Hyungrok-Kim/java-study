package com.kh;

import java.util.Scanner;

public class NumberOk {

	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		NumberOk no = new NumberOk();
		
		int count = 1;
		char ch = 'y';
		no.getNumber();
		do {
			
			if(no.getNumber() == 1) {
				System.out.println("크다");
			}
			else if(no.getNumber() == -1) {
				System.out.println("작다.");
			}
			else {
				break;
			}
			
			count++;
		}while(no.getNumber() != 0);
		
		System.out.printf("맞았습니다 (%d번)" , count);
		
		
		System.out.println(no.getNumber());

	}
	
	public int getNumber() {
		System.out.println("숫자 입력 : ");
		String str = sc.next();

		int num = Integer.parseInt(str);
		
		
		return questionNumber(num);
	}
	
	public int questionNumber(int num) {
		
		int ran = (int)(Math.random() * 100) + 1;
		int re = 0;
		
		
		
			if(ran == num) {
				
				re = 0;
			}
			else if(ran > num){
				
				re = -1;
			}
			else if(ran < num) {
			
				re = 1;
			}
			
			
		
		return re;
	}
	
	
	
}
