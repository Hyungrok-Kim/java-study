package com.kh.emp.view;

import java.util.Scanner;

import com.kh.emp.controller.EmployeeManager;

public class EmpMenu {
	
	//private Employee emp; // 관리할 사원 객체 
	// 키오스크를 생각해보면 A 키오스크랑 B 키오스크랑 화면이 같음 즉 공유!!
	// 그리고 주문을 다하고 나면 초기화면으로 돌아옴 즉 반복문!!
	
	
	public static void empDisplay() {
		// 사원 관리 프로그램 화면 
		
		Scanner sc = new Scanner(System.in);
		EmployeeManager em = new EmployeeManager();
		
		do {
			
			System.out.println("-- 이진솔's 사원 관리 프로그램 ver 2.0 --");
			System.out.println("-- 총 입사 가능 인원 : " + EmployeeManager.SIZE);
			System.out.println("-- 현재 입사자 수 : " + EmployeeManager.getCount() + "명");
			System.out.println("1. 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 전체 조회");
			System.out.println("5. 사원 한 명 정보 조회");
			System.out.println("0. 퇴근하기");
			System.out.println("----------------------------");
			System.out.println("메뉴 선택 >> ");
			
			int sel = sc.nextInt();
			
			switch(sel) {
			case 1 : 
				em.empInsert();
				break;
			case 2 : 
				em.empUpdate();
				break;
			case 3 :
				em.empDelete();
				break;
			case 4 :
				em.printAllEmp();
				break;
			case 5 : 
				em.printOneEmp();
				break;
			case 0 :
				System.out.println("아싸~ 그럼 저 퇴근합니다~!");				
				return;
			default :
				System.out.println("잘못 입력하셨습니다.");
			}
			
			
		}while(true);
	}

}


