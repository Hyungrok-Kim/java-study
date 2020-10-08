package com.kh.emp.controller;

import java.util.Scanner;

import com.kh.emp.model.vo.Employee;

public class EmployeeManager {
	// 화면(view)와 각 객체(vo)를 연결하는 클래스
	
	// 사원 배열을 최대로 담을 수 있는 길이 설정 
	public static final int SIZE = 10; //final은 변하면 안되기 때문에 
	//최대로 10명까지밖에 안된다.
	
	// 사원목록을 관리하기 위한 배열 선언 
	private Employee[] empArr = new Employee[SIZE];
	// private int[] array; 랑 모양이 비슷함
	// 일반 기본 자료형 배열처럼 객체를 가지고 똑같이 배열을 만들 수 있다. 
	
	// 현재 등록된 사원 수 
	private static int count;
	
	Scanner sc = new Scanner(System.in);
	
	// 초기화 블럭 (매번 실행할 때마다 초기화 되는 것을 방지하기 위해 ) 
	// 미리 값을 지정할 경우 
	// 초기화할 내용들만 따로 묶어 놓은 블럭( { } : block)
	{
		empArr = new Employee[SIZE];
		
		empArr[0] = new Employee("김길동", 1, 3, "010-1234-1112" , 500);
		empArr[1] = new Employee("박길동", 2, 5, "010-1002-2003" , 550);
		empArr[2] = new Employee("최길동", 3, 10, "010-2222-2222", 700);
		empArr[3] = new Employee("한소진", 4, 25, "010-7777-7777", 1000);
		
		// 초기화를 통해 추가한 만큼 현재 사원 수 늘리기 
		count = 4;
	}
	
	// 2. 사원 관리자 생성을 위한 생성자
	
	public EmployeeManager() {
		
	}

	// 3. 기능 제공 메소드 
	
	// Getter & Setter
	
	public static int getCount() {
		return count;
	}
	
	public static void setCount(int count) {
		EmployeeManager.count = count;
	}

	// 전체 사원 수 조회 
	public void printAllEmp() {
		for(int i = 0; i < count; i++) {
			System.out.println(i + " : " + empArr[i].empInfo());
		}
		
	}
	
	// 사원 정보 추가
	
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
		
		empArr[count] = new Employee(name, empNo, age, phone, salary);
		
		System.out.println("사원 정보 등록  완료!");
		
		count++; // 추가된 사원 정보만큼 현재 입사자 수 + 1
	}
	
	// 사원 정보 업데이트

	// 사원 번호를 입력받아 해당 사원이 존재하는지 
	// 확인하는 메소드 
	public int searchEmployee() {
		int idx = -1;
		
		System.out.print("찾을 사원 번호 입력 : ");
		int searchNo = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
			if(searchNo == empArr[i].getEmpNo()) {
				idx = i;
				break;
			}
		
		}
		
		if(idx == -1) System.out.println("해당하는 사원 정보가 없습니다.");
		
		
		return idx;
		
	}
	public void empUpdate() {
		// 사원 정보 수정
//		System.out.println("수정할 사원 번호 : ");
//		int empNo = sc.nextInt();
//		int idx = -1; // 수정할 사원의 순번 
//		
//		for(int i = 0; i < count; i++) {
//			if(empNo == empArr[i].getEmpNo()) {
//				idx = i;
//				break;
//			}
//		}
		
		int idx = searchEmployee();
		
		if( idx != -1) {
			
		
		// 연락처, 급여 
		System.out.println("현재 연락처 : " + empArr[count].getPhone());
		System.out.println("바꿀 연락처 : " );
		empArr[count].setPhone(sc.next());
		
		System.out.println("현재 급여 : " + empArr[count].getSalary());
		System.out.println("바꿀 급여 : ");
		empArr[count].setSalary(sc.nextInt());
		
		System.out.println("사원 정보 수정 성공!");
		
		}
		
		
	}
	
	public void empDelete() {
//		System.out.println("삭제할 사원 번호 입력 :");
//		int empNo = sc.nextInt();
//		int idx = -1; // 삭제할 사원의 배열 방 번호 
//		
//		for(int i = 0; i < count; i++) {
//			if(empNo == empArr[i].getEmpNo()) {
//				idx = i;
//				break;
//			}
//		}
		
		int idx = searchEmployee();
		
		if(idx != -1) {
			System.out.println("정말로 삭제하실건가요? (Y/N) :");
			char ch = sc.next().toUpperCase().charAt(0);
			if(ch == 'Y') {
				//삭제할 내용 
				for(int i = idx; i < count; i++ ) {
					//만약 삭제할 사원이 마지막 사원이라면 
					if( i == count - 1 ) {
						empArr[i] = null;
					}
					else {
						empArr[i] = empArr[i + 1];
					}
				}	
				count--;
			}
			else {
				System.out.println("메뉴 화면으로 돌아갑니다.");
			}
		
			
			System.out.println("사원 정보 삭제 완료!");
		}
		
		
	}
	

	public void printOneEmp() {
		
		int idx = searchEmployee();
		
		if(idx != -1)
		System.out.println(empArr[idx].empInfo());
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
