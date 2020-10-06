package com.kh.array;

import java.util.*;

public class ArrayPractice {
	//배열 실습
	// 자동 임포트 : Ctrl + Shift + O(영문자)
	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		// int 형 배열 1개 선언 후 
		// 값을 1~5까지 하나씩 추가하기
		
		int arr[] = {1,2,3,4,5};
		
		for(int i = 0; i < arr.length; i++)
			System.out.println("arr["+ i +"] : " + arr[i]);
	}
	
	public void test2() {
	
		//문자열을 반복해서 입력받고 
		//크기가 5인 배열에 저장한 후 
		//모두 저장되었을 때 하나식 
		//출력해서 결과 확인하기 
		
		String[] arr = new String[5];
		
		// 입력문
		for(int i = 0; i < arr.length; i++)
		{System.out.println("문자열 입력 :");
		
		arr[i] = sc.next();
			
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println(""+i+" 번째 문자열 : " + arr[i]);
		}
		
		
	
	
	}
	
	
	public void test3() {
		// 길이가 5인 숫자 배열을 선언하고,
		// 값을 100, 200, 300, 400, 500으로
		// 초기화 한 후, 그 수들의 합을 for문으로 
		// 구하는 프로그램을 작성하시오 .
		
		int arr[] = {100,200,300,400,500};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			sum += arr[i];
			
		}
		
		System.out.println("sum : " + sum);
		
	}
	
	public void test4() {
		// 길이가 10인 배열을 선언하고 
		// 각각의 공간에 값을 1부터 10까지 저장한 후 
		// 그 수들의 합을 for문으로 구하는 프로그램을 작성하시오 
		
		int arr[] = new int[10];
		int sum = 0;
		//입력부
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
		}
		
		System.out.println("sum : " + sum);
		
	}
	
	public void test5() {
		// 길이가 5인 숫자 배열을 선언하고 
		// 값을 100, 200, 300, 400 , 500의 값으로 
		// 초기화 한 뒤, 숫자 하나를 입력 받아 
		// 숫자 번호에 맞는 값을 출력하기 
		// 만약 없는 숫자라면 "입력한 공간은 없습니다." 출력하기 
		//
		
		int arr[] = {100,200,300,400,500};
		
		System.out.println("숫자 하나 입력 :");
		int num = sc.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(num == i) {
				System.out.println("arr["+ i +"] :" + arr[i]);
			} 
			else if(num > arr.length && num < 0) {
				System.out.println("입력한 공간은 없습니다.");
			}
			else {}
			
		
		
	}
		
		
		
	}
	
	public void test6() {
		// olleh -- > hello
		// 문자열을 입력받아 
		// 해당 문자열을 문자 배열의 한 문자씩 차곡차곡 저장한 후 
		// 반대로 뒤집어 뽑기 
		Scanner sc = new Scanner(System.in);
		String arr;
		
		System.out.println("문자열 입력 :");
		arr = sc.next();
		
		char[] ch = new char[arr.length()];
		
		for(int i = 0; i < ch.length; i++) {
			ch[i] = arr.charAt(i);
		}
		
		System.out.println("출력 : ");
		for(int i = ch.length-1; i > -1; i--) {
			System.out.print(ch[i]);
		}
	}
	
		
	
	
}
