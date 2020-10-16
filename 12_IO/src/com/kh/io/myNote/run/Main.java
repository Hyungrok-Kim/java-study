package com.kh.io.myNote.run;

import java.util.Scanner;

import com.kh.io.myNote.controller.NoteController;

public class Main {

	public static void main(String[] args) {
		NoteController nc = new NoteController();
		
		Scanner sc = new Scanner(System.in);
		
		// 메뉴판 만들기
		do {
		
			System.out.println("==== 김형록's myNote ====");
			System.out.println("1. 파일 저장하기");
			System.out.println("2. 파일 불러오기");
			System.out.println("3. 파일 이어쓰기");
			System.out.println("4. 종료하기");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 : 
				nc.fileSave();
				break;
			case 2 :
				nc.fileOpen();
				break;
				
			case 3 : 
				nc.fileEdit();
				break;
				
			case 4 : 
				System.out.println("프로그램을 종료합니다.");
				return;
				
			default:
				System.out.println("번호를 잘못 누르셨습니다.");
			}
			
			
		}while(true);
		
	}

}
