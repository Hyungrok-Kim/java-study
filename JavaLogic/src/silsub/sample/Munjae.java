package silsub.sample;

import java.util.Scanner;

public class Munjae {
	
	Scanner sc = new Scanner(System.in);
		public void test1() {
			
			System.out.println("국어 점수 :");
			int kor = sc.nextInt();
			
			System.out.println("영어 점수 :");
			int eng = sc.nextInt();
			
			System.out.println("수학 점수 :");
			int mat = sc.nextInt();
			
			int all = (kor + eng + mat);
			
			int avg = (kor + eng + mat)/3;
			
			if (avg >= 60 && kor >= 40 && eng >= 40 && mat >= 40) 
				{
				System.out.println("합격");
				System.out.printf("국어 : %d , 영어 : %d, 수학 : %d, 합계 : %d, 평균 : %d", kor, eng, mat, all, avg);
				}
			else {
				System.out.print("불합격");
					
				}
			
		}
		
		public void test2() {
			System.out.println("*** 초기 메뉴 ***");
			System.out.println("1. 입력");
			System.out.println("2. 수정");
			System.out.println("3. 조회");
			System.out.println("4. 삭제");
			System.out.println("7. 종료");
			
			int cho = sc.nextInt();
			
			switch(cho) {
			case 1 : 
				System.out.println("입력 메뉴가 선택되었습니다.");
				break;
			case 2 : 
				System.out.println("수정 메뉴가 선택되었습니다.");
				break;
			case 3 : 
				System.out.println("조회 메뉴가 선택되었습니다.");
				break;
			case 4 : 
				System.out.println("삭제 메뉴가 선택되었습니다.");
				break;
			case 7 : 
				System.out.println("프로그램이 종료됩니다.");
				break;
			default : 
				System.out.println("번호가 잘못 입력되었습니다.");
				break;
			}
			
			
		}
		public void test3() {
			System.out.println("정수 하나 입력 : ");
			int num = sc.nextInt();
			
			if (num > 0) {
				System.out.println("양수다.");
			}
			else {
				System.out.println("양수가 아니다.");
			}
			
		}
		
		
		public void test4() {
			System.out.println("정수 하나 입력 :");
			int num2 = sc.nextInt();
			
			String str = "";
			
			if (num2%2==0) {
				str = "짝수다.";
			}
			else if (num2 < 0){
				
			}
			else {
				str = "홀수다.";
			}
			
			System.out.println(str);
			
			
		}
		
		public void inputTest() {
			System.out.print("이름 입력");
			String name = sc.nextLine();
			
			System.out.print("나이 입력");
			int age = sc.nextInt();
			
			System.out.print("키 입력");
			double hei = sc.nextDouble();
			
			if (name.contains(" ") && name.length() > 0 && age > 0 && hei > 0) {
				System.out.printf("%s의 나이는 %d세이고, 키는 %.1fcm이다.", name, age, hei);
			}
			else {
				System.out.print("error");
			}
		}
		
		public void test6() {
			System.out.println("정수1 입력 :");
			int num1 = sc.nextInt();
			System.out.println("정수2 입력 :");
			int num2 = sc.nextInt();
			
			int num3 = num1%num2;
			
			if (num1 > 0 && num2 > 0 ) {
				System.out.println("첫번째 정수 :" + num1);
				System.out.println("두번째 정수 :" + num2);
				System.out.printf("%d + %d = %d \n"  ,num1, num2,  (num1+num2 ));
				System.out.printf("%d - %d = %d \n", num1 , num2, (num1-num2 ));
				System.out.printf("%d * %d = %d \n", num1 , num2, (num1*num2 ));
				System.out.printf("%d / %d = %d \n", num1 , num2, (num1/num2 ));
				System.out.println(num1 + " % " + num2 + " = " + (num1%num2) );
				System.out.printf("%d %% %d = %d " , num1 , num2 , (num1%num2));
				
			}
			else {
				System.out.println("");
				
			}
			
			
		}
		
	
		public void test7() {
			System.out.println("점수 입력");
			int score = sc.nextInt();
			String grade = "";
			
			
			if (score > 0) {
				if(score>=90) {
					grade = "A";
				}
				else if(score >= 80) {
					grade = "B";
					
				}
				else if(score >= 70) {
					grade = "C";
				}
				else if(score >=60) {
					grade = "D";
				}
				else {
					grade = "F";
				}
			}
			else {
				
			}
			
			System.out.printf("점수는 %d, 학점은 %s", score, grade);
			
		}
		
	public void test8() {
		System.out.println("이름 :");
		String name = sc.nextLine();
		
		System.out.println("키 : ");
		double hei = sc.nextDouble();
		
		System.out.println("몸무게 :");
		double wei = sc.nextDouble();
		
		double hei2 = hei/100;
		
		double bmi = wei / (hei2*hei2);
		
		String str = "";
		
		if (bmi >= 40) {
			str = "고도 비만";
		}
		else if(bmi >= 35 ) {
			str = "중등도 비만(2단계 비만)";
		}
		else if(bmi >= 30) {
			str = "경도 비만(1단계 비만)";
		}
		else if(bmi >= 25) {
			str = "과체중";
		}
		else if(bmi >= 18.5) {
			str = "정상";
		}
		else {
			str = "저체중";
		}
		
		System.out.printf("이름 : %s \n 키 : %.1f \n 몸무게 : %.1f \n %s 님은 %.1f로 %s입니다. ", name, hei2, wei, name, bmi, str);
		
	}
	
}


