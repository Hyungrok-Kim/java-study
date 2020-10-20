package home.menu;

import java.util.*;

public class CashBurgerKing {

	Scanner sc = new Scanner(System.in);
	
	public void selectMenu() {
		String burger[] = new String[8];
		int i = 0;
		int price = 0;
		char coi = 'y';
		int pricearr[] = new int[8];
		int num[] = new int[8];
		
		do {
		System.out.println("***메뉴를 선택하세요***");
		System.out.println("햄버거 *************");
		System.out.println("1. 불고기 버거       3500원");
		System.out.println("2. 치킨 버거          3200원");
		System.out.println("추가 *************");
		System.out.println("3. 감자튀김           1000원");
		System.out.println("4. 치즈스틱             400원");
		System.out.println("5. 샐러드              2000원");
		System.out.println("음료수 *************");
		System.out.println("6. 콜라                   700원");
		System.out.println("7. 에이드              1200원");
		System.out.println("8. 커피                 1000원");
		System.out.println("************");
		
		System.out.println("메뉴 선택 : ");
		int menu = sc.nextInt();
		
		if(menu == 1) {
			burger[i] = "불고기 버거";
			pricearr[i] = 3500;
		}
		else if(menu == 2){
			burger[i] = "치킨 버거를";
			pricearr[i] = 3200;
		}
		else if(menu == 3) {
			burger[i] = "감자 튀김";
			pricearr[i] = 1000;
		}
		else if(menu == 4) {
			burger[i] = "치즈스틱";
			pricearr[i] = 400;
		}
		else if(menu == 5) {
			burger[i] = "샐러드";
			pricearr[i] = 2000;
		}
		else if(menu == 6) {
			burger[i] = "콜라";
			pricearr[i] = 700;
		}
		else if(menu == 7) {
			burger[i] = "에이드";
			pricearr[i] = 1200;
		}
		else if(menu == 8) {
			burger[i] = "커피";
			pricearr[i] = 1000;
		}
		else {
			System.out.println("잘못 선택하셨습니다.");
		}
		
		System.out.printf("%s을 선택하셨습니다. \n" , burger[i]);
		
		System.out.println("수량은 ?");
		num[i] = sc.nextInt();
		
		System.out.println("추가 주문하시겠습니까?(y/n)");
		coi = sc.next().charAt(0);
		i++;
		
		
		}while(coi != 'n');
		
		int total = 0;
		
		for(int j = 0; j < i; j++) {
			System.out.println(burger[j] + " : " + num[j] + " - " + pricearr[j]*num[j] + "원" );
			total += (pricearr[j]*num[j]);
		}
		
		System.out.println("----------------------");
		System.out.println("총 가격 : " + total);
		
	
	}
	
	
}	