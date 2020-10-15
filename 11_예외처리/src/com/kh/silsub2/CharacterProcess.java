package com.kh.silsub2;

public class CharacterProcess {

	public CharacterProcess() {
		super();
	}
	
	public int countAlpha(String s) throws CharCheckException {
		int count = 0;

		if(s.contains(" "))
			throw new CharCheckException("체크할 문자열 안에 공백을 포함할 수 없습니다.");
		
		for(int i = 0; i < s.length(); i++) {
			if(('A' <= s.charAt(i) && s.charAt(i) <= 'Z')
					|| 'a' <= s.charAt(i) && s.charAt(i) <='z') {
			count++;	
			
			}
			
		}
		
		return count;
	}
}
