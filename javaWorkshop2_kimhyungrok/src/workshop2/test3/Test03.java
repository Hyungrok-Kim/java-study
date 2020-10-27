package workshop2.test3;

import java.util.Arrays;
import java.util.Collections;

public class Test03 {

	public static void main(String[] args) {
		int[] arr = {70,50,100,20,40,60,10,80,90,30};
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;				
				}
				
			}
			
		}
		
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}

	}
}
