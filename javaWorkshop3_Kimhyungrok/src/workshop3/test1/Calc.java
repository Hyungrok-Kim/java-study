package workshop3.test1;

public class Calc {

	
	public int calculate(int data) {
		int sum = 0;
		
		System.out.println("입력값 : " + data);
		
		if(data >= 5 && data <= 10) {
			for(int i = 1; i <= data; i++) {
				if(i % 2 == 0) {
					System.out.print("짝수  : \t" + i);
					sum += i; 
				}
			}
			
			System.out.println("결과 :" + sum);
		}
		
		
		return sum;
	}
	
	
}
