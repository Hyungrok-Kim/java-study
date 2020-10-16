package com.kh.io.subStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStream {
	// 입력 혹은 출력에 대한 임시 저장공간(버퍼)을
	// 사용하여 데이터를 한번에 처리하는 보조 스트림
	// 입력 : BufferedInputStream / BufferedReader
	// 출력 : BufferedOutputStream / BufferedWriter
	
	public void fileSave() {
		try(BufferedWriter bw = new BufferedWriter(
									new FileWriter("sample3.txt"))){
			
			bw.write("사과");
			bw.write("사과");
			bw.write("사과");
			bw.write("사과");
			bw.write("사과");
			
			bw.flush();
			// 현재까지 버퍼에 작성된 내용을
			// 모두 전송하고 버퍼를 비우는 메소드
						
		} catch (IOException e) {
			System.out.println("파일 저장 중 에러 발생!");
		}
	}
	
	public void fileRead() {
		try(BufferedReader br = new BufferedReader(
							new FileReader("sample3.txt"))) {
			
			String str = null;
			
			while((str = br.readLine()) != null) {
				
				System.out.println(str);
				
			}
			
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}
	}
	
	
}
