package com.kh.interfaceTest;

// 추상 메소드의 집합체! 미완성된 메소드의 집합체 

/*
 * 인터페이스
 * 추상(미완성) 메소드와 모든 클래스에서 공용으로 사용할 
 * 상수들을 한데 묶어 놓은 추상 전용 클래스를 인터페이스라고 한다.
 * 
 * 인터페이스의 필드 변수는 반드시 상수만을 작성할 수 있고,
 * 메소드는 반드시 미완성 메소드만 가능하다.
 * 
 * 클래스로부터 상속받을 수 없고
 * 같은 인터페이스끼리만 상속이 가능하다.
 * 
 * 이 때, 상속 받고자하는 인터페이스를 선언할 경우
 * 클래스와 같이 extends 인터페이스명 으로 기술한다.
 * 
 */
public interface IProduct {
   // 인터페이스의 필드 상수
   // 인터페이스의 상수는 public static final을
   // 선언하는 것을 기본으로 하기 때문에
   // 만약 앞의 예약어를 붙이지 않을 경우
   // 자동으로 붙여준다.
   public static final int NUM1 = 100;
   double PI = 3.14;
   
   // 인터페이스의 메소드 선언하기
   // 메소드 역시 public abstract를 붙이지 않으면
   // 자동으로 해당 예약어를 붙여준다.
   public abstract void testMethod2();
   void testMethod3();
   
   
   
   
   
   
   
}
