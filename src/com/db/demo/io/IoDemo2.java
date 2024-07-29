package com.db.demo.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class IoDemo2 {

	public static void main(String[] args) throws IOException {

		String file = "sample.txt";
		String textToWrite = "another sample text to write in the file";
		
		FileOutputStream fos = new FileOutputStream(file);
		
		byte[] arr = textToWrite.getBytes();
		fos.write(arr);
		System.out.println("Done");
		
		fos.close();
	}
}
