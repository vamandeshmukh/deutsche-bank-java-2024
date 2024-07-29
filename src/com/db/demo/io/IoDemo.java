package com.db.demo.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IoDemo {

	public static void main(String[] args) {

		System.out.println("Start");
		String file = "sample2.txt";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			while (fis.available() > 0) {
				System.out.print((char) fis.read());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("End");
	}
}

//package com.db.demo.io;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//
//public class IoDemo {
//
//	public static void main(String[] args) throws IOException {
//
//		String file = "sample.txt";
//
//		FileInputStream fis = new FileInputStream(file);
//
//		while (fis.available() > 0) {
//			System.out.print((char) fis.read());
//		}
//		// sample text in the text file
//		// another sample text to write in the file
//
//		fis.close();
//	}
//}
