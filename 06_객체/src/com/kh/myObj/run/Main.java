package com.kh.myObj.run;

import com.kh.myObj.model.vo.MemberShip;

public class Main {

	public static void main(String[] args) {
		MemberShip m1 = new MemberShip();

		m1.setName("김형록");
		m1.setGender('M');
		m1.setBirth("1996-07-15");
		m1.setAge(25);
		m1.setTel("01031712272");
		
		m1.memberInfo();
		
		System.out.println("------------------");
		
		MemberShip m2 = new MemberShip("육현승", 'M', "1995-08-06", 26, "019-1234-1234");
		
		m2.memberInfo();
	}

}
