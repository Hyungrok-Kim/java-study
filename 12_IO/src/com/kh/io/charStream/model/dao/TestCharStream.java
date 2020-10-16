package com.kh.io.charStream.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCharStream {
	// 	// 문자 기반 데이터 입출력 클래스
	// 입력 : Reader
	// 출력 : Writer
	
	public void fileOpen() {
		try(FileReader fr = new FileReader("sample.txt")){
			
			int value;
			
			while ((value = fr.read()) != -1) {
				System.out.print((char)value + " ");
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println("파일이 없습니다!");
			
		} catch (IOException e) {
			
			System.out.println("파일 읽는 도중 문제 발생!");
		}
	}
	
	public void fileSave() {
		try(FileWriter fw = new FileWriter("sample.txt")){
			
			fw.write("개발자");
			fw.write("세계정복");
			fw.write("Future Hope");
			fw.write(35675);
			
			char[] chArr = {'S', 'U', 'P', 'E', 'R'};
			
			fw.write(chArr);
			
		} catch(IOException e) {
			
			System.out.println("파일 저장 도중 문제 발생!");
		}
	}
	
}
