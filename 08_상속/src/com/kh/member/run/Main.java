package com.kh.member.run;

import com.kh.member.controller.MemberManager;
import com.kh.member.model.vo.Gold;
import com.kh.member.model.vo.Silver;
import com.kh.member.model.vo.VIP;

public class Main {

	public static void main(String[] args) {
		// # 각각 객체를 1개씩 사용해본 경우 
		
		/*
		Member m1 = new Member("김유신", "일반", 500);
		Silver s1 = new Silver("박문수", "실버2", 1000);
		Gold g1 = new Gold("김갑환", "금2" , 1500);
		VIP v1 = new VIP("김수로", "V5", 1000);
		
		System.out.println("m1 : " + m1.getIncen());
		System.out.println("s1 : " + s1.getIncen());
		System.out.println("g1 : " + g1.getIncen());
		System.out.println("v1 : " + v1.getIncen());
		*/
		
		// MemberManager로 회원 정보 등록하고 목록 조회하기 
		
		MemberManager mm = new MemberManager();
		
		// 실버 등급 회원 3명 , grade = "실버"
		mm.insertSilver(new Silver("이창한", "실버", 500));
		mm.insertSilver(new Silver("이상훈", "실버", 400));
		mm.insertSilver(new Silver("이청렴", "실버", 700));
		
		// 골드 등급 회원 3명, grade = "골드"
		mm.insertGold(new Gold("김다운", "골드", 800));
		mm.insertGold(new Gold("이진솔", "골드", 1000));
		mm.insertGold(new Gold("유정훈", "골드", 1500));

		// VIP 등급 회원 3명 , grade = "VIP"
		mm.insertVIP(new VIP("박하영", "VIP", 400));
		mm.insertVIP(new VIP("김종연", "VIP", 200));
		mm.insertVIP(new VIP("서형준", "VIP", 700));
		
		mm.memberPrint();
		
	}

}
