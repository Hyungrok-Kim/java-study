package test.method;

import java.util.Random;

public class NonStaticSample {

	public void printLottoNumbers() {
		
		int[] ran = new int[6];
		
		for(int i = 0; i < ran.length; i++) {
			ran[i] = new Random().nextInt(45) + 1;
			
			for(int j = 0; j < i; j++) {
				if(ran[j] == ran[i]) {
					i--;
				}
				
			}
		}
		
		for(int i = 0; i < ran.length; i++) {
			System.out.println(ran[i]);
		}
	}
	
	public void outputChar(int num, String str) {
		
		for(int i = 0; i < num; i++) {
			System.out.println(str);
		}
	}
	
	public char alphabette() {
		char str = 'A';
		
		for(int i = 0; i < 10; i++) {
			str = (char)((Math.random() * 26) + 65); 
		}
		
	//	for(int i = 0; i < str.length; i++) {
	//		return str[i];
	//	}
		
		return str;
		
	}
	
	public String mySubstring(String str, int start, int end) {
		
		String result = "";
		
		if(str != null) {
		for(int i = start; i <= end; i++) {
		 
			result += str.charAt(i-1);
			
		}
		}
		else {
			System.out.println("문자열이 없습니다.");
		}
		return result;
		
		
		
		
		
		
		
	}
	
}
