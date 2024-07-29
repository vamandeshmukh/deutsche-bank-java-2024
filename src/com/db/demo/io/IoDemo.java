package com.db.demo.io;

import java.io.FileInputStream;
import java.io.IOException;

public class IoDemo {

	public static void main(String[] args) throws IOException {

		String file = "sample.txt";

		FileInputStream fis = new FileInputStream(file);

		while (fis.available() > 0) {
			System.out.print((char) fis.read());
		}

		fis.close();
	}
}
