package com.kh.map;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties1 {
	   // Properties : 
	   //    어떠한 프로그램을 실행할 때
	   //    함께 읽어오는 설정 정보들을 (화면 사이즈, 언어 설정)
	   //    저장하는 파일을 말한다.
	   //    Map 객체와 동일하게 Key와 Value로
	   //    나뉘어 있으나 추가로 Key와 Value 모두
	   //    문자열만 사용하는 객체이다.
	   
	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		// 설정 값을 저장할 때 setProperty() 메소드를 사용한다.
		
		prop.setProperty("width", "300px");
		prop.setProperty("height", "200px");
		prop.setProperty("projectName", "352Fighting!");
		prop.setProperty("color", "green");
		
		System.out.println(prop);
		
		try {
			prop.store(new FileOutputStream("settings.txt"), "프로그램 설정");
			
			prop.storeToXML(new FileOutputStream("settings.xml"), "프로그램 설정");
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}
	
	
}
