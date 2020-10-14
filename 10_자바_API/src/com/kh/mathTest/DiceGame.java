package com.kh.mathTest;

import java.util.Arrays;
import java.util.Scanner;

public class DiceGame {

	
	public static void main(String[] args) {
		// 1 부터 6까지의 임의의 수를 구한 뒤 
		// 해당 숫자를 맞히는 게임 
		// 맞혔으면 "정답 입니다~!",
		// 틀렸으면 "틀렸습니다~!" 한 뒤 ,
		// "다시 할 지 묻고, "(y/n)" 다시 한다면,
		// 몇 번 만에 성공했는지 알려주는 게임 
		
		//// 출력 예시 
	      // 1 부터 6까지의 임의의 수를 구한 뒤
	      // 해당 숫자를 맞히는 게임
	      // 맞혔으면 "정답 입니다~!",
	      // 틀렸으면 "틀렸습니다~!" 한 뒤,
	      // 다시 할 지 묻고, "(y/n)" 다시 한다면,
	      // 몇 번 만에 성공했는지 알려주는 게임
	      
	      //// 출력 예시
	      // --- OOO's 주사위 게임 ver 1.0 ---
	      // 1 ~ 6 까지 수를 입력하세요 : 4
	      
	      //  -- 정답일 경우 --
	      // 정답입니다~! 1번 만에 맞추셨군요!
	      
	      //  -- 오답일 경우 --
	      // 오답입니다. 다시 하실래요? (Y/N)  : Y
	      //  1 ~ 6 까지 수를 입력하세요 : 3 (랜덤 수 재생성)
	      //  . . . 
	      // 오답입니다. 다시 하실래요? (Y/N)  : N
	      // 고생하셨습니다, 또 봐요~!
		

		Scanner sc = new Scanner(System.in);
		int count = 1;
		char re = 'S';
		
	    do {
		int dice = (int)(Math.random() * 6) + 1;
		
		System.out.println("---김혀록's 주사위 게임 ver 1.0 ---");
		System.out.println("1 ~ 6까지 수를 입력하세요 : ");
		int mynum = sc.nextInt();
		
		if(dice == mynum) {
			System.out.printf("정답입니다 ~! %d번 만에 맞추셨군요!", count);
			break;
		}
		else {
			System.out.println("오답입니다. 다시 하실래요?(Y/N) : ");
			re = sc.next().toUpperCase().charAt(0);
			}
		
		count++;
		
		}while(re != 'N');
		
	    System.out.println("고생하셨습니다, 또 봐요~!");
	   
	}
	
	public void codingtest() {
		int[] numArr = new int[7];
		int min = 24;
		
		
		for(int i = 0;  i < numArr.length; i++) {
			numArr[i] = (int)(Math.random() * 26) + 1; 
		}
		
		Arrays.sort(numArr);
		
		for(int i = 0; i < numArr.length; i++)
			System.out.println(numArr[i]);
		
		for(int i = 0; i< numArr.length; i++) {
			
		}
		
	}

}
