package com.kh.io.charStream;

import com.kh.io.charStream.model.dao.TestCharStream;

public class Main {

	public static void main(String[] args) {
		
		TestCharStream tcs = new TestCharStream();
		
		tcs.fileSave();
		tcs.fileOpen();
	}

	
}
