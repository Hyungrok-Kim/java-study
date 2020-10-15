package com.kh.exception.tryCatch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchTest {
	// 예외(문제상황)가 발생했을 때 
	// 이를 직접 처리하는 try-catch문 테스트
	
	public void methodA() {
		System.out.println("메소드 A 호출 확인 ");
		
		methodB();
		
		System.out.println("메소드 A 실행 종료");
	}
	
	public void methodB() {
		System.out.println("메소드 B 호출 확인");
		
		try {
		methodC();
		}catch(Exception e){
			System.out.println("문제 발생 메시지  : " + e.getMessage()  );
		}finally {
			System.out.println("문제 발생과 관련없이 처리할 내용 ");
		}
		System.out.println("메소드 B 종료");
	}
	
	public void methodC() throws Exception{
	
		System.out.println("메소드 C 호출 확인");
		
		// 강제로 문제상황 발생! 
		throw new Exception("강제로 문제상황 발생!");
	}
	
	public void ioTest1() {
	      // 자바 프로그램은 시스템에 어떠한 글을 작성하는
	      // 입력 자원(System.in)과 화면에 출력하는 출력자원(System.out)
	      // 으로 이루어져 있으나, 이를 직접 사용할 수는 없다.
	      // 즉, 입출력 자원을 운영체제로부터 빌려오며
	      // 이렇게 빌려온 입출력자원(IO Resource)을 반납해야 한다.
	      // 입력 자원
	      BufferedReader br = null;
	      
	      try {
	         br = new BufferedReader(
	                        new FileReader("test.txt"));
	         // test.txt로부터
	         // 받아 올 문자열을 담는 변수 만들기
	         String str = "";
	         
	         do {
	            
	            // readLine() 메소드는 엔터 전까지
	            // 한 줄 전체를 읽는 메소드이다.
	            str = br.readLine();
	            
	            if(str != null) {
	               System.out.println("내용 : " + str);
	            }
	            
	         } while(str != null);
	         
	         br = null;
	         
	      } catch (FileNotFoundException e) {
	         // 여러 개의 catch 구문을 통해 서로 다른 각각의
	         // 예외 상황을 처리할 수도 있다.
	         // 단, 이 경우 각 예외에 따른 상속관계를 유의해야 한다.
	         // 즉, 자식부터 부모의 순서로 예외를 나열해야 한다.
	         // 만약 각 예외가 형제관계이거나 서로 관련이 없는 예외일 경우
	         // 둘 모두를 비교한다는 의미로
	         // AException | BException 
	         // 비트 비교 연산자로 둘 모두를 비교할 수도 있다.
	         
	         e.printStackTrace();
	         
	      } catch(IOException e) {
	         
	         
	      } finally {
	         // 빌려온 입출력 자원 반납하기
	         try {
	            // 다중 try-catch도 가능하다.
	            br.close();
	            
	         } catch (IOException | NullPointerException e) {
	            // e.printStackTrace();
	            System.out.println("입력자원 반납 중 문제가 발생했습니다.");
	         }
	      }
	   }
	
	public void ioTest2() {
	      // try with resource
	      // try 안에 작성한 입출력 자원을
	      // 모두 사용한 후 자동으로 close()하여
	      // 해당 자원을 알아서 반납해주는 예외처리 구문
	      // 자바 1.7(7) 때 생성되었음
	      
	      try(
	            BufferedReader br =
	                  new BufferedReader(new FileReader("test.txt"));
	            ){
	         
	         String str = "";
	         
	         do {
	            
	            str = br.readLine();
	            
	            if(str != null) {
	               System.out.println("읽은 내용 : " + str);
	            }
	            
	         } while(str != null);
	         
	      } catch(Exception e) {
	         // 이렇게 상속&다형성을 활용하여
	         // 문제가 발생하는 예외보다 상위의 예외로
	         // 한 번에 해당 내용을 처리할 수도 있다.
	         e.printStackTrace();
	      }
	   }
	
}
