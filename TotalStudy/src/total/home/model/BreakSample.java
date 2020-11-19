package total.home.model;

import java.util.Scanner;

public class BreakSample {
	Scanner sc = new Scanner(System.in);
	
	public void sumBreak() {
		
		int i = 0;
		int sum = 0;
		while(true) {
			i++;
			sum += i;
			
			if(i == 100) {
				break;
			}
		}
		
		System.out.println("sum : " + sum);
		System.out.println("---------------");
		
	}
	
	public void guguDanBreak() {
		//label:
		for(int i = 1; i < 10; i++) {
			for(int j= 1; j < 10; j++) {
				if(j == 6) {
					break;
				}
				System.out.printf("%d * %d = %d \n", i , j , i*j);
			}
			System.out.println("----------------");
		}

		
		
		
		
		
	}
	
	
}
