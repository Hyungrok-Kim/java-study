package com.kh.io.byteStream;

import com.kh.io.byteStream.model.dao.TestByteStream;

public class Main {

	public static void main(String[] args) {
		TestByteStream tbs = new TestByteStream();
		//tbs.fileOpen1();
		
		tbs.fileSave();
		tbs.fileOpen2();

	}

}
