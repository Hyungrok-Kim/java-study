package com.kh.array;

public class ArrayTest {
	// 기능 제공 메소드들만 담은 클래스 
	
	public void testArray1() {
		// 배열 사용하기
		
		// 변수만 사용해서 
		// 학생 국어 점수 관리하기 
		int kor1 = 80;
		int kor2 = 75;
		int kor3 = 70;
		int kor4 = 100;
		int kor5 = 35;
		// ... 50명이라면..?
		
		// int sum = kor1 + kor2 + kor3 + ...;
		// 변수가 너무 많으면 해당 변수를 
		// 사용하기도 어려울 뿐더러 관리, 연산처리 등의
		// 번잡함이 생긴다. 게다가 변수의 이름도 각각 달라서 
		// 반복문을 쓸 수도 없다. 
		
		// ....Ah! 같은 자료형이면 하나로 묶어버리자! 
		
		// 배열 
		int[] arr = new int[5];
		
		// int arr[] = new int[5]; 위와 같은 결과 
		
		// 각 배열의 방에 선언한 자료형(int)과 일치하는 값을 
		// 하나씩 순서대로 저장할 수 있다. 
		// 단, 시작 번호는 0부터
		
		arr[0] = 35;
		arr[1] = 100;
		arr[2] = 70;
		arr[3] = 75;
		arr[4] = 80;
		//배열 이름으로 변수명이 통일되기 때문에 
		//반복문으로 합계를 계산할 수도 있다. 
		
		int sum = 0;
		
		for(int i =0; i < arr.length; i++) {
			sum += arr[i];
			
		}
		
		System.out.println("sum : "  + sum);
	}
	
	public void testArray2() {
		
		// 배열 사용방법
		// 1. 선언 방식
		// 자료형[] 변수명; 
		// 자료형 변수명[];
		
		// 배열을 선언하면 Heap 메모리에
		// 배열의 크기만큼 공간을 할당하고 
		// 가장 앞에 있는 값의 주소 고유 번호를
		// 가져와 stack 메모리에 저장한다. 
		
		// 생성 및 초기화 방식
		// 1. 공간만 할당하는 경우 
		int[] arr = new int[5];
		
		// 2. 배열의 값으로 초기화하여 선언하는 경우 
		int arr2[] = new int[] {1, 2, 3, 4, 5};
		
		// ERROR - 배열의 길이와 안의 값을 같이 선언할 수는 없다!
		// int[] arr3 = new int[10]{1,2,3,4,5};
		
		// 3. 만약 배열의 값으로 선언할 경우 
		//	  new 키워드를 생략할 수 있다.
		int arr4[] = {1,2,3,4,5,6,7,8,9,10}; // <-- 위의 코드보다 짧다고 하여 Shorthand라고 함.
		
		// 2번보다 3번을 많이 사용함 , shorthand이기 때문에 
		
		System.out.println(arr4);
		
		char arr5[] = new char[10];
		System.out.println("arr5 : " + arr5);
		
		// 참조 자료형 
		// String, 배열 등과 같이 
		// Heap 메모리에 값을 저장하는 변수들은 
		// 별도의 주소 고유번호를 가지게 되는데, 
		// 이렇게 new로 생성하는 변수를 
		// '주소를 참조한다' 하여 참조 자료형이라고 부른다.
		// (Reference variable / Type) 
		
		// heap 메모리에 들은 값은 우리가 직접 메모리 주소를 확인할 수는 없다. 
		// hash 코드에 별도로 저장하는데 우리는 그걸 관리할 필요가 없고 그런 존재가 있다고만 생각하면 됨.
		// 대신 고유의 주소에 들어 있다 라는 걸 확인시키는 방법이 존재한다. 
		
		// 1. 주소 고유 번호 확인하기.
		System.out.println("arr4 : " + arr4);
		System.out.println("arr5 : " + arr5);
		
		// 2. hashCode 확인하기.
		
		System.out.println("arr 4의 해쉬코드 : " + arr4.hashCode());
		System.out.println("arr 5의 해쉬코드 : " + arr5.hashCode());
		
		
	}
	
	public void testArrayCopy() {
		// 얕은 복사와 깊은 복사 
		// 1. 얕은 복사 
		// 배열의 주소 고유번호만 복사하는 방법 
		
		int[] originArr = {1,2,3};
		
		int[] copyArr = originArr; //얕은 복사 (같은 주소를 가지고 있음)
		
		// 안에 있는 내용 출력하기 
		for(int i = 0; i < originArr.length; i++){
			System.out.println("originArr[i] : " + originArr[i] );
		}
		
		System.out.println("======================");
		
		for(int i = 0; i < copyArr.length; i++)
		{System.out.println("copyArr[i] : " + copyArr[i] );
			}
		
		
		System.out.println("----원본 변경하기-----");
		
		originArr[1] = 6;
		
		for(int i = 0; i < originArr.length; i++){
			System.out.println("originArr[i] : " + originArr[i] );
		}
		
		System.out.println("======================");
		
		for(int i = 0; i < copyArr.length; i++)
		{System.out.println("copyArr[i] : " + copyArr[i] );
		}
		//얕은 복사이기 때문에 originArr을 바꾸면 copyArr도 바뀜.
		
		
		
		}
	
	public void testArrayCopy2() {
		// 2. 깊은 복사 
		// - 1 - for문 사용하기  Array.copyOf메소드와 같은 결과 
		
		int[] originArr = {1,2,3,4,5};
		int[] copyArr1 = new int[originArr.length];
		
		for(int i = 0; i < originArr.length; i++) {
			copyArr1[i] = originArr[i];
		}
		
		// 내용 확인하기 
		
		for(int i = 0; i < copyArr1.length; i++) {
			System.out.println("CopyArr1[i] : "  + copyArr1[i]);
			
		}
		
		/*//repeat 코드
		originArr[2] = 1004;
		
		for(int i = 0; i< originArr.length; i++) {
			System.out.println("originArr[i] :" + originArr[i]);
		}
		
		for(int i = 0; i < copyArr1.length; i++) {
			System.out.println("CopyArr1[i] : "  + copyArr1[i]);
			
		}
		*/
		
		
		// - 2 - System.arraycopy();
		//System.arraycopy(복사할 원본 배열, 
		//					원본 배열의 시작 번호,
		//					사본 배열,
		//					사본 배열의 시작 번호,
		//					복사할 갯수);
		
		int[] copyArr2 = new int[10];
		
		System.arraycopy(originArr, 0, copyArr2, 3, originArr.length);
		
		
		System.out.println("--------------------");
		for(int i = 0; i < copyArr2.length; i++) {
			System.out.println("CopyArr2[i] : "  + copyArr2[i]);
			
		}
		
		originArr[2] = 1004;
		
		for(int i = 0; i< originArr.length; i++) {
			System.out.println("originArr[i] :" + originArr[i]);
		}
		
		for(int i = 0; i < copyArr2.length; i++) {
			System.out.println("CopyArr2[i] : "  + copyArr2[i]);
			
		}
		
		
		System.out.println("----------------------");
		// - 3 - clone() 메소드 사용하기 // 말 그대로 복사가 아닌 복제하는 느낌
		int[] copyArr3 = new int[10];
		
		System.out.println("사본 배열 주소 번호 :" + copyArr3);
		
		copyArr3 = originArr.clone();
		
		System.out.println("사본 배열 복제 후 :" + copyArr3);
		
		System.out.println("원본 배열 주소 번호 : " + originArr);
	}
	
	public void testArray3() {
		// 배열의 단점 : 
		// 1. 같은 자료형만 묶을 수 있다. int는 int만 String은 String만 double은 double만 
		// 2. 배열은 한 번 크기(길이)를 선언하면 
		//    다시는 바꿀 수가 없다. 
		
		int [] arr = new int[5];
		
		// 원래 존재하던 공간만큼은 사용하는데 문제가 없다. 
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = i * 10;
			
		}
		
		// 출력문 
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println("arr[i] : " + arr[i]);
		}
		
		//ArrayIndexOutOfBounds :
		//만약 우리가 선언한 배열의 크기보다 더 큰 범위로
		//값을 저장하고자 한다면 발생하는 에러 
		//arr[7] = 500; --ERROR
		
		//배열의 순번 중 음수는 없다. 무조건 0부터 시작!
		//arr[-1] = 300; --ERROR	
		
	}
	
	// 자료형 기본값 테스트 전역 변수 (Heap)
	boolean booleanChk;
	byte byteChk;
	short shortChk;
	char charChk;
	int Chk;
	long longChk;
	float floatChk;
	double doubleChk;
	String strChk;
	
	public void testValue() {
		
		System.out.println("boolean 기본값 : " + booleanChk);

		System.out.println("boolean 기본값 : " + byteChk);
		System.out.println("short 기본값 : " + shortChk);
		System.out.println("char 기본값 : " + charChk);
		System.out.println("int 기본값 : " + Chk);
		System.out.println("long 기본값 : " + longChk);
		System.out.println("float 기본값 : " + floatChk);
		System.out.println("double 기본값 : " + doubleChk);
		System.out.println("str 기본값 : " + strChk);
		
	}
	
}
