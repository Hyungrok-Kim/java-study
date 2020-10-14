package com.kh.stringTest;

import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {
	
		StringTest st = new StringTest();
		st.stringMethod1();
		st.stringMethod2();
		st.stringBuffer();
		st.stringBuilder();
		st.stringSplit();
	}
	
	
	
	
	
	
	
	
	
	
	
	public void stringMethod1() {
		/*
		 * 문자열 특성 확인하기
		 * 1. 불변성의 값이다.
		 * 2. 값이 변경될 때 마다 Heap 영역의 
		 * 	   문자열 공간(String pool)에 값을 일일히 저장한다. 
		 * 3. 또한 이미 동일한 값이 저장되어 있으면
		 *    새로운 문자열 공간을 할당하지 않는다. 
		 *    
		 */
		
		String str1 = "Hello World!";
		String str2 = "Hello World!";
		String str3 = new String("Hello World!");
		
		
	      // 본래 두 객체의 주소는 달라야 하지만
	      // 실행 시 "Hello World"라는 문자열이
	      // 저장된 공간을 동시에 바라보고 있기 때문에
	      // 두 주소를 동일하다고 판단한다.
		
		System.out.println("str 1과 str 2 비교 : " + (str1 == str2));
		System.out.println("str1.equals(str2) : " + str1.contentEquals(str2));
		System.out.println("str1과 str3 비교 : " + (str1 == str3));
		System.out.println("str1.equals(str3) : " + str1.equals(str3));
		
	      // 위의 결과를 기준으로 한다면 str1과 str3 비교 역시
	      // true가 나와야 하나, new String()으로 문자열을 새로
	      // Heap 메모리에 할당하므로써 두 주소를 다르다고 판단한다.
	}
	
	public void stringMethod2() {
		String str1 = "안";
		String str2 = "안" + "녕";
		
		System.out.println("str1 == str2 :" + (str1 == str2));
	}
	
	public void stringBuffer() {
		  // 문자열은 안의 내용이 변경될 때마다 새로운 공간을
	      // 할당하고 값을 새로 집어 넣는다.
	      // 이를 막기 위해 임시공간(buffer)을 하나 준비하여
	      // 값을 임시공간 차곡차곡 담아 두었다 한번에 처리해주는
	      // 클래스가 StringBuffer / StringBuilder이다.
		
		//StringBuffer
		StringBuffer sb = new StringBuffer();
		
		sb.append("Hello");
		
		System.out.println(sb.hashCode());
		
		sb.append("World !");
		
		System.out.println(sb.hashCode());
		
		String result = sb.toString();
		
		System.out.println(result);
		
		System.out.println("----------------");
		
		
	}
	public void stringBuilder() {
		//StringBuilder
		
		//StringBuffer는 동시 제어 기능을 가지고 있다.
		// 동시 제어 기능(Thread Safe) : 
		//    하나의 공간을 서로 다른 두 프로그램이나,
		//    두 개 이상의 수정이 동시에 발생 했을 때 
		//    이를 방지하는 기능
		
		// 하지만, 간단한 프로그램이나, 동시 제어를 다른 곳에서 
		// 미리 처리하는 경우엔 굳이 이 기능은 필요치 않는다. 
		// 따라서 이 기능만 따로 뺀 클래스도 사용되는데 ,
		// 그 중 대표적인 클래스가 StringBuilder이다!
		
		
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		
		System.out.println(sb.hashCode());
		
		sb.append("World !");
		
		System.out.println(sb.hashCode());
		
		String result = sb.toString();
		
		System.out.println(result);
	}
	
	public void stringSplit() {
		// 어떠한 문자열을 받을 때 
		// "000, xxx, AAA" 등의 
		// 여러 문자열을 특정 구분자로 합하여 
		// 받는 경우, 해당 문자열을 다시 여러 개의
		// 문자열로 쪼개고자 할 때 사용하는 메소드 
		
		String hope = "세계정복, 유도선수, 대통령, 해적왕, 호텔리어, 선생님";
		
		String[] strArray = hope.split(", ");
		
		// forEach(향상된 for문)
		for(String s : strArray) {
			System.out.println(s);
		}
		
		System.out.println("---------------------");
		
		// split() 처럼 문자열을 특정 구분자 로 
		// 쪼개어 마치 하나의 객체처럼 관리하는 클래스 
		StringTokenizer tokens = new StringTokenizer(hope);
		// StringTokenizer tokens = new StringTokenizer(hope, ", ");
		
		while(tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken(", "));
			
		}
		
		// join()
		// 여러 개로 쪼개진 문자열들을 
		// 하나의 문자열로  합치는 메소드 
		
		String result = String.join(" - ", strArray);
		System.out.println(result);
		
	}

	
}
