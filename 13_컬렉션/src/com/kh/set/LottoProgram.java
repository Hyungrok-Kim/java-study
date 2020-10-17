package com.kh.set;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoProgram {

	public static void main(String[] args) {
		// 1. 1 ~ 45 사이의 난수(nance : 임의의 수 (랜덤한 수)) 6개
		// 2. 중복이 존재하지 않아야 함.
		// 3. 오름차순 정렬을 하여 화면에 보여주기 
		
		Set lottoSet = new TreeSet();
		
		// for
//		for( ; lottoSet.size() < 6;) {// 0 ~ 44 --> 1 ~ 45
//			lottoSet.add(new Random().nextInt(45) + 1);
//		}
//		
		
		
		
		// while 
		while(lottoSet.size() < 6) {
		
			lottoSet.add(new Random().nextInt(45) + 1);
		}
		
		System.out.println(lottoSet);
		
		
	}

}
