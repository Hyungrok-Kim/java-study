package total.home.model;

public class ContinueSample {
	public void sumJumpThree() {
		int sum = 0;
//		int sum2 = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				continue;
			}
			sum += i;
		}
		
		System.out.println("1~100까지의 정수 중 3의 배수를 뺀 정수 합 : " + sum);
//		
//		for(int i = 0; i <= 100; i++) {
//			if(i % 3 == 0) {
//				sum2 += i;
//			}
//		}
//		
//		System.out.println("1~100까지의 정수중 3의 배수만 더한 값 : " + sum2);
	}
	
	public void rowColJump() {
		int[][] rowcul = new int[3][5];
		int count = 1;
		
		for(int i =0; i < rowcul.length; i++) {
			for(int j = 0; j < rowcul[i].length; j++) {
				rowcul[i][j] = count;
				count++;
				if(i == 0 && j >=2) {
					continue;	
					}
				else{
				//System.out.print(rowcul[i][j] + ",");
				//	System.out.printf("%5d", rowcul[i][j]);
					System.out.printf("%5d,%d", i+1 , j+1 );
					}
			}
				
				System.out.printf("\n");
		}
	}
		
		
}

