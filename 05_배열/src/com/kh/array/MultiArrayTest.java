package com.kh.array;

public class MultiArrayTest {
	
	// 다차원 배열
	// 다차원 배열이란
	// 여러 배열을 하나의 더 큰 배열의
	// 개념으로 묶어 사용하는 배열
	// ex)
	// 1반 (고길동, 최길동, 홍길동 )
	// 2반 (김유신, 박유신, 차유신 )
	// 3단 (둘리 , 또치, 도우너 )
	
	public void test1() {
		
		int[] ban1 = { 1, 2, 3, 4, 5};
		int[] ban2 = { 6, 7, 8, 9, 10};
		int[] ban3 = { 11,12,13,14,15};
		
		// ban이 50개라면...?
		
		// 만약 배열이 여러 개가 된다면,
		// 변수가 많았던 것처럼 배열도 관리하기 힘들어진다.
		// 따라서 위의 배열들도 하나의 더 큰 배열로 묶어주는
		// 개념을 도입하였는데, 이것이 바로 2차원 배열이다!
		
		int[][] ban = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15}
				};
		// 만약 묶은 반마다 학생 수가 다르다면..?
		// 각 배열 별로 크기가 달라도 이를 하나로 묶을 수 있는데,
		// 이를 가변 배열이라 칭한다. 
		
		int[][] bans = {
				{ 1, 2, 3, 4, 5},
				{ 1, 2, 3},
				{ 4, 5}
				
				};
		
		// 다차원 배열 선언시 
		// 길이를 선언할 때 반드시 앞에서부터 선언해야 한다.
		
		int [][] arr = new int[5][];
		
	}
	
	public void test2() {
		// 2차원 배열 사용하기 
		// 3x3
		// {
		// {1, 2, 3},
		// {4, 5, 6},
		// {7, 8, 9}
		// }
		
		int arr[][] = new int[3][3];
		
		// 2차원 배열에 값 추가하기 
		int num = 1;
		
		for(int i = 0 ; i < arr.length ; i++) { //배열 갯수
			for(int j = 0; j < arr[i].length; j++) { //2차원 배열 for문 안에 for문
				arr[i][j] = num++;
			}
		}
		
		// 2차원 배열의 값 출력하기 
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] +  " ");
			}
			System.out.println();
		}
		
		
	}
	
	public void test3() {
		// 5 * 5 배열을 만들어서 
		// 1부터 25까지 값을 추가한 후 
		// 1에서 25까지 5개씩 끊어서 출력하기 
		
		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15
		// 16 17 18 19 20
		// 21 22 23 24 25
		
		int[][] narr = new int[5][5];
		int num = 1;
		
		for(int i = 0; i < narr.length; i++) {
			for(int j = 0; j < narr[i].length; j++) {
				narr[i][j] = num++;
				System.out.printf("%3d", narr[i][j]);
			}
			System.out.println();
			
		}
		
	}

	
	public void test4() {
		
		// test3() 메소드를 응용하여 
		// 화면에 값을 
		// -------------------
		// 1 6 
		// 2 7
		// 3 8
		// 4 9
		// 5 10
		// -------------------
		
		
		int[][] narr = new int[5][5];
		int num = 1;
		
		for(int i = 0; i < narr.length; i++) {
			for(int j = 0; j < narr[i].length; j++) {
				narr[i][j] = num++;
				System.out.printf("%3d", narr[j][i]); // 입력이랑 출력부분이 나눠져있지않기때문에 입력보다 출력이 먼저 나와서 제대로 출력되지 않음.
			}
			System.out.println();
			
		}
	}
	public void test5() {
		// test 3()메소드를 참조하여 
		// 화면에 아래와 같이 결과가 나오도록
		// 출력해보기
		// 
		//
		//
		
		int arr[][] = new int[5][5];
		
		// 2차원 배열에 값 추가하기 
		int num = 1;
		
		for(int i = 0 ; i < arr.length ; i++) { //배열 갯수
			for(int j = 0; j < arr[i].length; j++) { //2차원 배열 for문 안에 for문
				arr[i][j] = num++;
			}
		}
		
		// 2차원 배열의 값 출력하기 
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length-i; j++) {
				System.out.printf("%3d " ,arr[i][j] );
			}
			System.out.println();
		}
		
		
		
	}
	
}
