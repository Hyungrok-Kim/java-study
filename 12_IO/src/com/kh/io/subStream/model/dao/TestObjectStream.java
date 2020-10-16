package com.kh.io.subStream.model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.io.subStream.model.vo.Member;

public class TestObjectStream {
	// 객체를 저장하는 입출력 스트림 
	// 입력 : ObjectInputStream 
	// 출력 : ObjectOutputStream 
	
	public void fileSave() {
		Member[] mArr = {
			new Member("피카츄" , 10, "포켓볼" , "010-1111-2222"),
			new Member("라이츄" , 30, "슈퍼볼" , "010-1234-1234"),
			new Member("피츄", 5, "집" , "010-1234-4321")
		};
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("member.txt"))){
			
			for(int i = 0; i < mArr.length; i++) {
				oos.writeObject(mArr[i]);
			}
			
			//oos.flush();
			
			System.out.println("객체 저장 완료 ! ");
			
		}catch(IOException e) {
			
			System.out.println("객체 저장 중 에러 발생 : " + e.getMessage());
		}
		
		
		
	}
	
	public void fileOpen() {
		Member[] mArr = new Member[3];
		
		try(ObjectInputStream oin = new ObjectInputStream(new FileInputStream("member.txt"))) {
			
			for(int i = 0; i < mArr.length; i++) {
				mArr[i] = (Member)oin.readObject();
			}
			
			// 출력부 (forEach)
			for(Member m : mArr) {
				System.out.println(m);
			}
		} catch(ClassNotFoundException e) {
			
			System.out.println(e.getMessage());
		
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
 	}
	
	
}
