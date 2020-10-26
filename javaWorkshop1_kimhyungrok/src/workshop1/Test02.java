package workshop1;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력(범위 5~9) :");
		int num = sc.nextInt();
		
		int sum = 0;
		int gop = 1;
		int avg = 0;
		
		if(num >= 5 && num <= 9) {
			for(int i = 1; i <= num; i++ ) {
				sum+=i;
				gop*=i;
				avg=sum/num;
			}
		}else {
			System.out.println("다시 입력하세요 :");
		}
		
		System.out.println("합 : " + (double)sum);
		System.out.println("곱 : " + (double)gop);
		System.out.println("평균 : " + (double)avg);

	}

}
