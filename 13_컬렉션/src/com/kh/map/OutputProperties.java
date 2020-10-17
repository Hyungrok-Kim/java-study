package com.kh.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class OutputProperties {

	public static void main(String[] args) {
		// Properties로 저장한 파일 읽어오기 
		
		
		Properties prop = new Properties();
		
		try {
			
			//prop.load(new FileInputStream("settings.txt"));
			prop.loadFromXML(new FileInputStream("settings.xml"));
			
			
			// 가져온 설정 불러오기 
			System.out.println(prop.getProperty("width"));
			System.out.println(prop.getProperty("heigth"));
			System.out.println(prop.getProperty("projectName"));
			System.out.println(prop.getProperty("color"));
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
