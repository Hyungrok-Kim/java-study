package com.kh.loop;

public class F_JumpLoopTest {

	// 만약 여러 개의 중첩 반복문을 모두 한꺼번에 
	// 벗어나고 싶다면...? 
	
	// ** 작성한 코드가 복잡해 질수록 
	// 	    코드의 흐름을 이해하기 어렵게 만드는 주범이 될 수 있다. 
	
	// 필요한 경우에 쓸 순 있지만 권장하지는 않는다.
	
	public void testJumpLoop() {
		
		// 1부터 10까지의 합을 무한 반복하는 도중 
		// 라벨로 뛰쳐 나가기
		
		label: // jump: / loop: / 마음대로 써도됨(나갈 이름) ex) 나갈이름명: 
		while(true) { // 무한 반복
			int sum = 0;
			for(int i = 1; i <= 10; i++) {
				sum += i;
				
				if(i == 3) {
					System.out.println(sum); // 1 + 2 + 3;;
					break label; // break라는 문은 "반복문"만 나간다. 제일 가까이에 있는 반복문 그렇기 때문에 for문을 나간다.
				}
				
			}
		}
	}
}
