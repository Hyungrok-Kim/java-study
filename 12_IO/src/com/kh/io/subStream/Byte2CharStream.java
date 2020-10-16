package com.kh.io.subStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Byte2CharStream {
	// 바이트스트림을 문자 스트림으로 바꾸는
	// 보조 스트림
	// ** 사용하려면 기본 스트림이 반드시 필요함
	// 입력 : InputStreamReader
	// 출력 : OutputStreamWriter
	
	public void fileSave() {
		
		try(OutputStreamWriter ow =
				new OutputStreamWriter(
						new FileOutputStream("sample3.dat"));
				){
			
			ow.write("괜찮아요");
			ow.write(35775);
			ow.write("Apple");
			
			System.out.println("파일 저장 완료!");
			
		} catch(IOException e) {
		
			System.out.println("파일 저장 중 에러 발생!");
		}
		
	}
	
	public void fileOpen() {
		
		try(InputStreamReader ir = new InputStreamReader(
								new FileInputStream("sample3.dat"))){
			
			// 1byte 씩 데이터를 읽어서 문자형(2byte)로 바꿔준다.
			
			int value;
			
			while((value = ir.read()) != -1) {
				System.out.println((char)value);
			}
			
		} catch(IOException e) {
			
			System.out.println("파일 읽기 중 에러 발생!");
			
		}
		
	}
}
