package workshop2.test2;

public class StudentTest {

	public static void main(String[] args) {
		Student studentArray[] = new Student[3];

		studentArray[0] = new Student("홍길동", 15 ,170, 80);
		studentArray[1] = new Student("추사람", 13 ,150, 40);
		studentArray[2] = new Student("유관순", 20 ,175, 45);
		
		int max = 0;
		String name = "";
		int maxwei = 0;
		String name2= "";
		int sum = 0;
		double ageavg = 0.0;
		
		for(int i =0; i < studentArray.length; i++) {
			System.out.println(studentArray[i]);
		}
		
		for(int i = 0; i < studentArray.length; i++) {
			if(maxwei < studentArray[i].getHeight()) {
				max = studentArray[i].getHeight();
				name = studentArray[i].getName();
			}
		}
		
		System.out.println("신장이 가장 큰 학생 :" + name + "   신장 :" + max);
		
		
		for(int i = 0; i < studentArray.length; i++) {
			if(maxwei < studentArray[i].getWeight()) {
				maxwei = studentArray[i].getWeight();
				name2 = studentArray[i].getName();
			}
		}
		
		System.out.println("몸무게가 가장 많이 나가는 학생 : " + name2 +  ", 몸무게 : " + maxwei);
		
		for(int i = 0; i < studentArray.length; i++) {
			sum += studentArray[i].getAge();
		}
		
		ageavg = sum / studentArray.length;
		ageavg *= 1000;
		
		System.out.printf("나이 평균 : %.3f" , Math.round(ageavg) / 1000.0);
		
	}

	
	
}
