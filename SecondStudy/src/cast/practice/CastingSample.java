package cast.practice;

import java.util.Scanner;

public class CastingSample {

	
	public void printUniCode() {
		Scanner sc = new Scanner(System.in);
		
		char a = sc.next().charAt(0);
		
		int num = a;
		
		System.out.println("num unicode:" + num);
	}
	
	
}
