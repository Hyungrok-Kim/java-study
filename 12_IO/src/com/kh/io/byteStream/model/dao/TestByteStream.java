package com.kh.io.byteStream.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStream {
	
	// 특정 데이터를 바이트 단위로 읽고 쓰는 
	// 바이트 입출력 객체 테스트
	// 입력 : InputStream
	// 출력 : OutputStream
	
	public void fileOpen1() {
		// 특정 파일로부터 데이터를 읽어오는 객체
		FileInputStream fin = null;
		try {
		
			fin = new FileInputStream("test.dat");
			
			// 파일의 크기 확인하기
			int fileSize = (int)new File("test.dat").length();
			
			System.out.println("파일 사이즈 : " + fileSize);
			
			/*
			//  byte 배열을 사용한 파일 읽어오기
			byte[] readData = new byte[fileSize];
			
			// 해당 파일 정보 읽어오기
			fin.read(readData);
			
			// 읽어온 파일 정보 출력하기
			for(int i = 0; i < fileSize ; i++) {
				// 자바에서 문자를 읽을 때는 
				// 유니코드 기준으로 읽기 때문에
				// 1byte로 표현하려고 하면 오버플로우가 발생한다.
				System.out.println(i + " : " + readData[i]);
				
				System.out.println(i + " : " + (char)readData[i]);
				
			}
			*/
			
			int value;
			
			// 일반적으로 프로그램 파일을 읽어올 때
			// 처음부터 끝까지 데이터를 쭉 읽고,
			// 마지막에 도달했다면 -1을 리턴한다.
			// 그 값을 파일의 끝으로 인식시켜 작성한다.
			
			while((value = fin.read()) != -1) {
				System.out.print(value + " " + (char)value);
				
				System.out.println();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없어요~!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void fileOpen2() {
		// try with resource 사용하기
		try (
			FileInputStream fin = new FileInputStream("test.dat");
				) {
			
			int value;
			
			while((value = fin.read()) != -1) {
				
				System.out.println(value);
				
			}
			
		} catch (IOException e) {
			
			System.out.println("파읽 읽다 에러났어요~");
		}
	}
	
	public void fileSave() {
		
		try(
			// FileOutputStream fout = new FileOutputStream("test.dat");
				FileOutputStream fout = new FileOutputStream("test.dat", true);
				) {
			
			fout.write(97);
			
			byte[] writeData = { 10, 20, 30, 40, 50 };
			
			fout.write(writeData);
			
			fout.write(writeData, 1, 3);
			
			System.out.println("파일 출력이 완료되었습니다!");
		} catch (IOException e) {
			System.out.println("파일 쓰다 엘러 났어요~!");
		}
		
	}

}
