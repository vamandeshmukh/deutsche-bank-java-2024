package com.db.demo.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExeResources {

	public static void main(String[] args) {

		System.out.println("Start");
		String file = "sample2.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Something is wrong!");

		} finally {
			System.out.println("Done");
		}
	}
}
