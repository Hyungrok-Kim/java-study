	package com.kh.io.myNote.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NoteController {
	Scanner sc = new Scanner(System.in);
	
	public NoteController() {}
	
	public void fileSave() {
		// 파일 저장하는 
		StringBuilder sb = new StringBuilder();
		
		System.out.println("-- 파일에 저장할 내용을 입력하세요 --");
		
		// 값을 Scanner로 등록하고, "exit"라는 문자열을 입력했을 때 종료하기 
		while(true) {
			String str = sc.nextLine();
			
			if( str.equals("exit")) {
				break;
			}
			
			sb.append(str + "\n");
			
		}
		
		// 저장하시겠습니까? 
		// 입력 받은 값이 대문자든, 소문자든 'y'만 받으면 저장하기 
		System.out.println("저장 할래요? (Y/N) : ");
		char ch = sc.next().toUpperCase().charAt(0);
		if(ch == 'Y') {
			// 엔터값 제거! \
			sc.nextLine();
			
			System.out.println("저장할 파일 명 입력 : ");
			String fileName = sc.nextLine();
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
				
				bw.write(sb.toString());
				System.out.println("파일 저장 완료!");
				
			}catch(IOException e){
				System.out.println("파일 저장 중 에러 발생 :" + e.getMessage());
			}
		}
		System.out.println("메인 메뉴로 돌아갑니다.");
	}
	
	public void fileOpen() {
		// open할 파일 명 
		System.out.print("open할 파일 명 : ");
		String fileName = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
			
			StringBuilder sb = new StringBuilder();
			
			while(br.ready()) {
				sb.append(br.readLine() + "\n");
			}
			
			System.out.println("---- 읽어 온 내용 ----");
			System.out.println(sb.toString());
			
			System.out.println("파일 읽기 성공!");
			
		}catch(FileNotFoundException e) {
			System.out.println("파일 없음");
			
		}catch(IOException e) {
			
			System.out.println("파일 읽는 도중 에러 발생");
			
		}
		System.out.println();
	}
	
	public void fileEdit() {
		
		System.out.println("이어쓸 파일 명 :");
		String fileName = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileName));
				BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))){ // , true를 적어줘야 기존 내용에 이어쓰기가 가능
			
			System.out.println("--- 현재 저장된 내용 ---");
			
			StringBuilder sb = new StringBuilder();
			
			while(br.ready()) {
				sb.append(br.readLine() + "\n");
			}
			
			System.out.println(sb.toString());
			sb.setLength(0); // 임시공간의 값의 길이를 0으로 초기화 함으로써
							 // 기존의 값을 비우게 된다.
			
			System.out.println("---- 이어 쓸 내용 작성 ----");
			
			while(true) { // 마치 fileSave처럼
				String str = sc.nextLine();
				
				if(str.equals("exit")) {
					break;
				}
				
				sb.append(str + "\n");
			}
			
			System.out.println("저장 할래요? (Y/N) : ");
			
			char ch = sc.next().toUpperCase().charAt(0);
			
			if(ch == 'Y') {
				bw.write(sb.toString());
				
				System.out.println("이어쓰기 완료");
			}
			
			System.out.println();
			
		} catch(IOException e) {
			
			System.out.println("파일 이어쓰기 중 문제 발생 " );
		}
	}
}
