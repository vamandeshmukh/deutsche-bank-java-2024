package com.db.demo.ex;

import java.util.Scanner;

public class ExDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num1");
		int num1 = sc.nextInt();

		System.out.println("Enter num2");
		int num2 = sc.nextInt();

		try {
			System.out.println(num1 / num2);
		} catch (ArithmeticException e) {
			System.out.println("Do not enter 0");
		}
		finally {
			sc.close();
		}
	}
}
