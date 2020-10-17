package com.test.operator;

import java.util.Scanner;

public class Example {

		public void sample1() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("국어 : ");
			int a = sc.nextInt();
			
			System.out.println("영어 : ");
			int b = sc.nextInt();
			
			System.out.println("수학 : ");
			int c = sc.nextInt();
			
			int point = (a+b+c);
			System.out.println("총점 : " + point);
			
			int avg = (a+b+c)/3;
			System.out.println("평균: " + avg);
			
			String result = (avg >= 60 && a >= 40 && b >= 40 && c >= 40) ? "합격" : "불합격";
			
			System.out.println(result);
		}
		
		public void sample2() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("학생이름:");
			String name = sc.next();
			
			System.out.println("학년:");
			int year = sc.nextInt();
			
			System.out.println("반:");
			int myclass = sc.nextInt();
			
			System.out.println("번호:");
			int num = sc.nextInt();
			
			System.out.println("성별 (M/F) :");
			char gender = sc.next().charAt(0);
			
			String result = (gender == 'M' || gender == 'm') ? "남" : "여";
			
			System.out.println("성적 : ");
			float point = sc.nextFloat();
			
			System.out.println(year +"학년" + myclass + "반 " + num + "번"  + gender + "학생 " + name + "은 성적이 "  + point + "이다." );
			
			
		}
		
		public void sample3() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 하나 입력  : ");
			int num = sc.nextInt();
			
			String result2 = (num > 0) ? "양수" : "양수가 아니다";
			
			System.out.print("result2");
			
		}
		
		public void sample4() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 하나 입력하세요 : ");
			int num2 = sc.nextInt();
			
			String result3 = ((num2%2==0) ? "짝수다" : "홀수다");
			
			System.out.print(result3);
			
		}
		
}
