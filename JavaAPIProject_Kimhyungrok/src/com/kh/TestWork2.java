package com.kh;

import java.util.StringTokenizer;

public class TestWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "J a v a P r o g r a m";
		int gongback = 0;
		
		System.out.println(str);
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				gongback++;
			}
		}
		
		int sum = str.length() - gongback;
		
		System.out.println("공백을 제외한 문자 수 : " + sum);
		
		StringTokenizer tokens = new StringTokenizer(str);
		
		System.out.println(tokens.countTokens());
		//System.out.println(tokens.nextElement());
		System.out.println("-----------------");

		char ch[] = new char[11];
		String str2 = "";
		
		while(tokens.hasMoreTokens()) {
			System.out.print(tokens.nextToken(" "));
			str2 += tokens.nextToken(" ");
		}
			
		}
		
		
		
	

}
