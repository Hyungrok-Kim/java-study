package com.kh.io.subStream;

import com.kh.io.subStream.model.dao.TestObjectStream;

public class Main {

	public static void main(String[] args) {
//		Byte2CharStream b2c = new Byte2CharStream();
//		
//		b2c.fileSave();
//		b2c.fileOpen();

//		BufferedStream buf = new BufferedStream();
//		buf.fileSave();
//		buf.fileRead();
		
//		TestDataStream tds = new TestDataStream();
//		tds.testDataStream();
		
		TestObjectStream tos = new TestObjectStream();
		
		//tos.fileSave();
		tos.fileOpen();
	}

}
