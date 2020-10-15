package com.kh.exception.myExcep;

// 사용자 정의 Exception(예외상황)
public class FireException extends Exception {

	public FireException() {}
	
	public FireException(String msg) {
		super("문제 발생 : " + msg);
	}
}
