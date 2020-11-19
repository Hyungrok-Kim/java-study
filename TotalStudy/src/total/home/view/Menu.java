package total.home.view;

import java.util.Scanner;
import total.home.model.*;

public class Menu {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void mainMenu() {
		char stop = 'n';
		
		
		do {
			System.out.println("1. 변수 테스트");
			System.out.println("2. 기본 자료형 테스트");
			System.out.println("3. if문 테스트");
			System.out.println("4. switch문 테스트");
			System.out.println("5. for문 테스트");
			System.out.println("6. while문 테스트");
			System.out.println("7. do~while문 테스트");
			System.out.println("8. break문 테스트");
			System.out.println("9. continue문 테스트");
			System.out.println("10. static 메소드 사용 테스트");
			System.out.println("11. non-static 메소드 사용 테스트");
			System.out.println("12. 프로그램 종료");
			System.out.print("메뉴 번호 입력 :");
			int menucoi = sc.nextInt();
			
			switch(menucoi) {
			case 1 : 
				
				break;
			case 2 :
				
				break;
			case 3 : 
				
				break;
			case 4 :
				
				break;
			case 5 : 
				
				break;
			case 6 :
				
				break;
			case 7 : 
				
				break;
			case 8 : 
				subBreakMenu();
				break;
			case 9 : 
				subContinueMenu();
				break;
			case 10 :
				
				break;
			case 11 : 
				
				break;
			case 12 :
				System.out.println("정말로 종료하시겠습니까? (예:y/아니오:n) :");
				stop = sc.next().toUpperCase().charAt(0);
				break;
			default :
				System.out.println("메뉴 입력을 잘못하셨습니다.");
				continue;
				
			}
			
			
		}while(stop != 'Y');
		
		System.out.printf("프로그램 종료 \n");
		
		
	}
	
	public static void subBreakMenu() {
		BreakSample bs = new BreakSample();
		
		int submenuchoi = 0;
		
		do {
			System.out.println("1. 1~100까지 정수들의  합계 출력하기(break문 사용)");
			System.out.println("2. 구구단 1단~9단까지 출력하되, * 5 계산에서 반복문 빠지기(break 이름 사용");
			System.out.println("3. 이전 메뉴로 가기");
			System.out.println("메뉴 선택 : ");
			submenuchoi = sc.nextInt();
			
			switch(submenuchoi) {
			case 1 : 
				bs.sumBreak();
				break;
			case 2 :
				bs.guguDanBreak();
				break;
			case 3 :
				System.out.println("메인 메뉴로 돌아갑니다 :");
				return;
			default : 
				System.out.println("메뉴 입력을 잘못하셨습니다.");
				break;
			}
		}while(true);
	
	}
	
	
	public static void subContinueMenu() {
		ContinueSample cs = new ContinueSample();
		int submenuchoi = 0;
		
		do {
			System.out.println("1. 1~100까지의 정수 중 3의 배수를 뺀 정수들의 합계 출력하기");
			System.out.println("2. 3행 5열의 행열값 출력하되, 1행 3열부터 1행 5열까지 생략하고 출력하기");
			System.out.println("3. 이전 메뉴로 가기");
			System.out.println("메뉴 선택 : ");
			submenuchoi = sc.nextInt();
			
			switch(submenuchoi) {
			case 1 : 
				cs.sumJumpThree();
				break;
			case 2 :
				cs.rowColJump();
				break;
			case 3 :
				System.out.println("메인 메뉴로 돌아갑니다 :");
				return;
			default : 
				System.out.println("메뉴 입력을 잘못하셨습니다.");
				break;
			}
		}while(true);
	
		
	}

	
	
}


