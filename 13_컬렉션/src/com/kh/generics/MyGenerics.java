package com.kh.generics;

//						T : 타입(Type) 
public class MyGenerics<T> {
	// 제네릭 타입의 T(Type)는 
	// 처음 생성자를 통해 부여한 클래스 타입을 
	// 기억하고 그에 맞는 자료형으로 체인지하는 속성 
	
	private T[] array;
	
	public MyGenerics(T[] array) {
		this.array = array;
	}
	
	public void output() {
		for(T t : array) {
			System.out.println(t);
		}
		
	}
}
