package com.kh.emp.view;

import java.util.Scanner;

import com.kh.emp.model.vo.Employee;

public class EmpMenu {
	
	private Employee emp; // 관리할 사원 객체 
	// 키오스크를 생각해보면 A 키오스크랑 B 키오스크랑 화면이 같음 즉 공유!!
	// 그리고 주문을 다하고 나면 초기화면으로 돌아옴 즉 반복문!!
	public static void empDisplay() {
		// 사원 관리 프로그램 화면 
		
		Scanner sc = new Scanner(System.in);
		EmpMenu em = new EmpMenu();
		
		do {
			
			System.out.println("-- 이진솔's 사원 관리 프로그램 ver 1.0 --");
			System.out.println("1. 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 조회");
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
				em.empPrint();
				break;
			case 0 :
				System.out.println("아싸~ 그럼 저 퇴근합니다~!");				
				return;
			default :
				System.out.println("잘못 입력하셨습니다.");
			}
			
			
		}while(true);
	}
	
	public void empInsert() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사원명 :");
		String name = sc.next();
		
		System.out.println("사번 : ");
		int empNo = sc.nextInt();
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		System.out.println("연락처 : ");
		String phone = sc.next();
		
		System.out.println("월 급여 : ");
		int salary = sc.nextInt();
		
		emp = new Employee(name, empNo, age, phone, salary);
		
		System.out.println("사원 정보 등록  완료!");
		
	}
	
	public void empUpdate() {
		// 사원 정보 수정 
		Scanner sc = new Scanner(System.in);
		
		// 연락처, 급여 
		System.out.println("현재 연락처 : " + emp.getPhone());
		System.out.println("바꿀 연락처 : " );
		emp.setPhone(sc.next());
		
		System.out.println("현재 급여 : " + emp.getSalary());
		System.out.println("바꿀 급여 : ");
		emp.setSalary(sc.nextInt());
		
		System.out.println("사원 정보 수정 성공!");
		
	}
	
	public void empDelete() {
		emp = null;
		
		System.out.println("사원 정보 삭제 완료!");
		System.out.println("기능 사용 시 사원 정보 추가를 먼저 해주세요!!");
	}
	
	public void empPrint() {
		
		System.out.println(emp.empInfo());
		
	}
}


