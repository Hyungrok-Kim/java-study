package workshop1;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 1 :");
		int num1 = sc.nextInt();
		
		System.out.println("정수 입력 2 :");
		int num2 = sc.nextInt();
		
		System.out.println("정수 입력 3 :");
		int num3 = sc.nextInt();
		
		int max = 0;
		int min = 0;
		
		max = Math.max(num1, num2);
		max = Math.max(max, num3);
		
		System.out.println("최대값 :" + max);
		
		min = Math.min(num1, num2);
		min = Math.min(min, num3);
		
		System.out.println("최소 값 :" + min);
	}

}
