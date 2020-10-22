package com.kh;

public class TestWork3 {

	public static void main(String[] args) {
		Employee em = new Employee();
		
		Employee empArr[] = new Employee[5];
		
		empArr[0] = new Employee("김형록", 25, 300 ,10);
		empArr[1] = new Employee("A", 26, 300 ,10);
		empArr[2] = new Employee("B", 27, 400 ,10);
		empArr[3] = new Employee("C", 28, 500 ,10);
		empArr[4] = new Employee("D", 29, 600 ,10);
		
		for(int i=0; i< empArr.length; i++) {
			System.out.println(empArr[i].EmpInfo());
		}
		
	}

}
