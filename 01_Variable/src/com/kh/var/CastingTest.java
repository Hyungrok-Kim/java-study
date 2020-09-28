package com.kh.var;

public class CastingTest {

	
	public void castMethod1() {
		/*
		 * 본래 컴퓨터는 어떠한 값을 처리할 때 
		 * 같은 자료형끼리만 계산이 가능하다.
		 * 
		 * 하지만, 다른 자료형과도 계산이 필요한 순간이 
		 * 종종 있을 수 있기 때문에 각각의 자료형으로 
		 * 변환해주는 캐스팅(형변환) 기술을 제공한다. 
		 * 
		 * 기본적으로 정수형은 실수형으로 자동 형변환이 가능하며,
		 * 실수형은 정수형으로 자동 형변환이 불가능하다.
		 * 
		 * 또한 각각의 자료형이 다르더라도 
		 * 해당 자료형 크기보다 바꾸고자 하는 자료형의 크기가 
		 * 더 큰 경우 자동으로 형변환 해준다.
		 * 
		 * ex) 1byte --> 2byte
		 */
		
		// 자동형변환이 일어나는 경우 
		// char --> int
		
		int num1 = 'A';
		System.out.println("num 1 : " + num1);
		
		int num2 = '깡';
		System.out.println("num 2 : " + num2);
		
		// char 자료형에 정수값이 들어갈 수 있는지 확인 
		char ch = 97;
		System.out.println("ch : " + ch);
		
		// 유니코드가 지원하는 숫자 범위 내에서는
		// 문자 자료형 변환이 가능하다.
		
		// char ch2 = -97; // 0 ~ 65535
		// 문자는 음수로 선언 할 수 없다.
		
		// 리터럴(명시값)을 int에 담았다가 
		// int를 char로 변환해보기 
		
		int num3 = 100;
		//char ch3 = num3;
		
		// 이미 int로 4byte 공간을 할당 받은 num3은
		// 2byte의 공간을 가진 ch3으로 옮길 수 없다.
		
		// 만약, 자동형변환이 안되는 상황에서 
		// 우리가 강제 형변환을 시킬 경우,
		// 변수 앞에 '(바꿀 자료형)'을 명시하여
		// 강제 형변환을 진행할 수 있다. 
		
		char ch3 = (char)num3;
		
		System.out.println("ch3 : " + ch3);
		
		// 만약 음수 값을 강제로 넣는다면..?
		int num4 = -90;
		char ch4 = (char)num4;
		
		System.out.println("ch4 : " + ch4);
		
		// 실수형 사이의 데이터 손실
		double d1 = 123.45678912345;
		
		System.out.println("d1 : " + d1);
		
		float f1 = (float)d1;
		
		System.out.println("f1 : " + f1);
		
		
	}
	
	public void castMethod2() {
		// 다른 자료형끼리 사칙연산을 수행할 경우
		// 두 자료형을 비교하여 더 큰 단위로 자동 형변환 해준다.
		
		int num1 = 7777;
		long num2 = 10000;
		
		System.out.println(num1 + num2);
		
		// 1. 둘 중 더 범위가 큰 자료형으로 결과를 받는 경우 
		long result1 = num1 + num2;
		
		System.out.println("result1 : " + result1 );
			
		// 2. 자료형에 관계없이 강제 형변환을 시킨 경우 
		int result2 = (int)(num1 + num2);
		
		System.out.println("result2 : " + result2 );
		
		// 3. 해당 데이터를 처리할 수 있는 가장 큰 자료형을 사용하는 경우 
		double result3 = num1 + num2;
		System.out.println("result3 : " + result3);
		
		// 4. byte와 short는 사칙연산의 수행 결과가 
		//    무조건 int 자료형(type)으로 자동 형변환이 된다.
		
		byte b1 = 10;
		short s1 = 30;
		
		//short s2 = b1 + s1; -- ERROR!
		int result4 = b1 + s1; // byte와 short의 사칙연산이기 때문에 int로 받아야 한다.
		
		// 2020/8/17 월요일 필기
		//Heap는 대량의 데이터를 묶음단위로 저장할 때 자주 사용 

		//주소값을 따로 저장해서 그 안에 데이터를 관리해서 데이터 주소를 찾으러 감.

		//C언어는 직접 메모리를 생성하고 지우는 것이 가능하지만 자바는 new하면서 생성되고  가비지 콜렉터가 가장 사용하지 않은 데이터를 지워버린다. 
		
		
		
	} 
	
}
