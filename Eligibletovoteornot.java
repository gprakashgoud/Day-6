package com.codegnan.javafundamentals;

import java.util.Scanner;

public class Eligibletovoteornot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scanner.nextInt();
		String result = age >= 18 ? "eligible" : "not eligible";
		System.out.println(result);
		scanner.close();

	}

}
