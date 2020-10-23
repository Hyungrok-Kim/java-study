package test.run;

import test.method.NonStaticSample;

public class Main {

	public static void main(String[] args) {
		
		NonStaticSample ns = new NonStaticSample();
		
		//ns.printLottoNumbers();
		
		NonStaticSample output = new NonStaticSample();
		output.outputChar(6,"김형록");
		
		NonStaticSample al = new NonStaticSample();
		System.out.println(al.alphabette());
		
		NonStaticSample ms = new NonStaticSample();
		System.out.println(ms.mySubstring("abcdefg", 2, 5));
	}
	
}
