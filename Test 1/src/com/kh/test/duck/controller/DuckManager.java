package com.kh.test.duck.controller;


import com.kh.test.duck.model.vo.Duck;
import com.kh.test.duck.model.vo.Mallard;
import com.kh.test.duck.model.vo.RubberDuck;

public class DuckManager  {

	public static void main(String[] args) {
		
		Duck d1[] = new Duck[5];


		d1[0] = new RubberDuck("러버덕" , "도날드", 100);
		d1[1] = new Mallard("청둥오리", "꽥꽥이", "서울", "white");
		d1[2] = new RubberDuck("러버덕", "고무고무", 100);
		d1[3] = new Mallard("청둥오리", "청둥이", "부산", "blue");
		d1[4] = new Mallard("청둥오리", "미세먼지", "중국", "yellow");
		
//		for(int i = 0; i < d1.length; i++) {
//			System.out.println(d1[i]);
//		}
		
		for(Duck d : d1) {
			d.quack();
		}
	}
	
}	
