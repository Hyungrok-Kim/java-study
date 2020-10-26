package workshop1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("정수 입력 2 : ");
		int num2 = sc.nextInt();
		
		if(num1 % num2 > 1) {
			System.out.println("나머지가 1보다 크다!");
		}
		else {
			System.out.println("나머지가 1보다 작거나 같다!");
		}
				;

	}

}
