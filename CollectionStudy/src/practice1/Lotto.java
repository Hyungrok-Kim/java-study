package practice1;

import java.util.Set;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lottoDisplay();
		
	}
	
	public static void lottoDisplay() {
		Set lotto = new TreeSet();
		int[] lo = new int[6];
		int i = 0;
		
		while(lotto.size() < 6) {
		
			lotto.add(((int)(Math.random()* 45) + 1));
		
		}
			
		System.out.println(lotto);
		
		
		while(i <= 5) {
			i++;
			lo[i] =
		}
		
		
	}

}
