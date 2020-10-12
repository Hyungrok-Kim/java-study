package com.kh.member.controller;

import com.kh.member.model.vo.*;

public class MemberManager {
	// 여러 회원을 배열로 관리하는 클래스
	
	private Silver[] silvers = new Silver[10];
	private Gold[] golds = new  Gold[10];
	private VIP[] vips = new VIP[10];
	
	private int silverCnt;   // 0으로 시작 
	private int goldCnt;     // 0
	private int vipCnt;      // 0
	
	public MemberManager() { }
	
	public void insertSilver(Silver s) {
		if(silverCnt < 10) {
		this.silvers[silverCnt] = s;
		silverCnt++;
		}
		else {
			System.out.println("정원 초과입니다.");
		}
	}
	
	public void insertGold(Gold s) {
		if(goldCnt < 10) {
		this.golds[goldCnt] = s;
		goldCnt++;
		}
		else {
			System.out.println("정원 초과입니다.");
		}
	}
	
	public void insertVIP(VIP v) {
		if(vipCnt < 10) {
			this.vips[vipCnt] = v;
			vipCnt++;
		}else {
			System.out.println("정원 초과입니다.");
		}
	}
	
	public void memberPrint() {
		System.out.println("-------- 회원 정보 출력 --------");
	      System.out.printf("%-15s%-15s%-15s%-15s\n",
	                      "이름", "등급", "포인트", "인센티브");
	      for(int i = 0 ; i < silverCnt ; i++) {  // 실버 회원 정보
	         System.out.printf("%-15s%-15s%-15d%-15.2f\n",
	                   silvers[i].getName(), 
	                   silvers[i].getGrade(), 
	                   silvers[i].getPoint(), 
	                   silvers[i].getIncen());
	      }
	      
	      for(int i = 0 ; i < goldCnt ; i++) {   // 골드 회원 정보
	         System.out.printf("%-15s%-15s%-15d%-15.2f\n",
	                   golds[i].getName(), 
	                   golds[i].getGrade(), 
	                   golds[i].getPoint(), 
	                   golds[i].getIncen());
	      }
	      
	      for(int i = 0 ; i < vipCnt ; i++) {
	         System.out.printf("%-15s%-15s%-15d%-15.2f\n",
	                   vips[i].getName(), 
	                   vips[i].getGrade(), 
	                   vips[i].getPoint(), 
	                   vips[i].getIncen());
	      }
	}
	
}
