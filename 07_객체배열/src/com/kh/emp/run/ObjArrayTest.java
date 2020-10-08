package com.kh.emp.run;

import com.kh.emp.model.vo.Employee;

public class ObjArrayTest {

	public static void main(String[] args) {
		//Employee[] empArr = new Employee[5]; // 배열을 선언할 때는 크기를 지정해줘야함.
		
		// 1. 길이 선언 방법
		// Employee[] empArr = new Employee[5];
		
		 //2. 직접 값을 넣어 선언하는 방법 
		 Employee[] empArr = { new Employee(),
								new Employee(),
								new Employee(),
								new Employee(),
								new Employee()
							};
		 
		 for(int i = 0; i < empArr.length; i++) {
			 System.out.println(empArr[i].empInfo());
		 }
	}

}
