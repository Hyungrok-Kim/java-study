package com.kh.generics;

import java.util.ArrayList;

public class BeforeGenerics {

	public static void main(String[] args) {
		// 컬렉션 객체들은 여러 종류의 타입(자료형, 클래스)을 담을 수 있다. 
		// list, set, map
		ArrayList list = new ArrayList();
		
		list.add(new Book("자바의 정석"));
		list.add(new Student("다니엘 "));
		list.add(new Car("녹차"));
		
		/// 각 형태 별로 객체를 따로 꺼내고 싶다면...?
		
		// 난 책만 꺼내고 싶어요~ 
		for(int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			
			if(obj instanceof Book) {
				System.out.println("책 : " + obj);
			}
			if(obj instanceof Student) {
				System.out.println(" 학생 : " + obj);
			}
			if(obj instanceof Car) {
				System.out.println("차 : " + obj);
			}
		}

	}

}

class Book{
	   private String bNo;
	   
	   public Book(){}
	   
	   public Book(String bNo){
	      this.bNo = bNo;
	   }
	   
	   @Override
	   public String toString(){
	      return "나는 책입니다.";
	   }
	}

	class Student{
	   private String stuNo;
	   
	   public Student(){}
	   
	   public Student(String stuNo){
	      this.stuNo = stuNo;
	   }
	   
	   @Override
	   public String toString(){
	      return "나는 학생입니다.";
	   }
	}

	class Car {
	   private String model;
	   
	   public Car(){}
	   
	   public Car(String model){
	      this.model = model;
	   }
	   
	   @Override
	   public String toString(){
	      return "나는 " + model + "입니다.";
	   }
	}
