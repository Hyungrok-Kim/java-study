package com.kh;

public class ExamString {
	public String preChar(String s) {
		String result = "";
		
		for(int i = 0; i < s.length(); i++) {
			if(i == 0) {
				result += s.toUpperCase().charAt(i);
			}
			else {
				result +=s.charAt(i);
			}
		}
		
		return result;
	}
	
	public int charSu(String s, char ch) {
		
		int total = 0;
		
		for(int i = 0; i< s.length(); i++) {
			if(s.charAt(i) == ch) {
				total++;
			}
		}
		
		return total;
	}
}
