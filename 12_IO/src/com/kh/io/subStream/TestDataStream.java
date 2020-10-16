package com.kh.io.subStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataStream {
	// 입력한 데이터를 해당 자료형(Type)에 맞게 
	// 저장하고 출력하는 보조 스트림 
	// 각각의 자료형을 byte 기준으로 쪼개어 
	// 출력 시에 각 byte 단위에 맞게 
	// 읽어서 출력하는 보조 스트림 
	// 입력 : DataInputStream
	// 출력 : DataOutputStream
	
	public void testDataStream() {
		// 데이터를 자료형 단위로 저장하고 
		// 저장한 내용을 출력까지 한번에 하는 메소드이다. 
		
//		DataInputStream din = null;
//		DataOutputStream dout = null;
		
//		try {
//		 din = new DataInputStream(new FileInputStream("score.txt"));
//		 dout = new DataOutputStream(new FileOutputStream("score.txt"));
//		} catch(IOException e) {
//			
//			System.out.println("프로그램 IO 실행 중 에러 발생 :" + e.getMessage());
//			
//		}finally {
//			try {
//			din.close();
//			dout.close();
//			
//			}catch(IOException e) {
//				System.out.println(e.getMessage());
//			}
//			
//		}
		
		try(DataInputStream din = new DataInputStream(new FileInputStream("score.txt"));
				DataOutputStream dout = new DataOutputStream(new FileOutputStream("score.txt"));){
			
			// score.txt 에 데이터 저장하기 
			dout.writeUTF("홍길동"); // 문자열 저장
			dout.writeInt(90); 	   // int 자료형 저장
			dout.writeChar('A');   // 문자 하나 저장
			dout.writeBoolean(true); // 논리 자료형 저장
			
			// -----------------------
			
			dout.writeUTF("고길동"); // 문자열 저장
			dout.writeInt(60); 	   // int 자료형 저장
			dout.writeChar('C');   // 문자 하나 저장
			dout.writeBoolean(false); // 논리 자료형 저장
			
			// score.txt로 부터 읽기 
			while(true) {
				String result = din.readUTF() + ", "
								+ din.readInt() + ", "
								+ din. readChar() + ", "
								+ din.readBoolean();
				System.out.println("result : " + result);
			}
		
		} catch(EOFException e) {
			// End Of File : 파일의 끝을 알리는 예외
			// 파일을 끝까지 읽었음에도 불구하고 
			// 추가로 더 읽으려고 할 때 발생하는 예외
			System.out.println("파일을 끝까지 다 읽었습니다!	");
	
			
		}catch(IOException e) {
			System.out.println("프로그램 IO 실행 에러 발생 : " + e.getMessage());
		}
				
		
		
		
		
		
		
		
	}
}
