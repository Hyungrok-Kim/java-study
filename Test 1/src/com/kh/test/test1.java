package com.kh.test;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위바위보 게임 시작");
		
		do {
			System.out.println("가위 바위 보 하나 입력 :");
			String input = sc.nextLine();
			
			System.out.println("당신은" + input + "를 냈습니다.");
			
			int random = (int)(Math.random() * 3);
			String computer = "";
			
			switch(random) {
			case 0 : computer = "가위"; break;
			case 1 : computer = "바위"; break;
			case 2 : computer = "보" ; break;
			
			}
			
			System.out.println("컴퓨터는" + computer + " 를 냈습니다.");
			
			if(computer.equals(input)) {
				System.out.println("비겼습니다. 다시 시작");
				
			}else {
				boolean win = false;
				
				if(computer.equals("가위")) {
					if(input.equals("바위")) {
						win = true;
					}
					
				}else if(computer.equals("바위")){
					if(input.equals("보")) {
						win = true;
					}
				}else {
					if(input.equals("가위")) {
						win = true;
					}
				}
				
				if(win == true) {
					System.out.println("당신이 이겼슴");
					break;
					
				}else {
					System.out.println("당신이 졌음");
					break;
				}
			}
		}while(false);
	}

}
