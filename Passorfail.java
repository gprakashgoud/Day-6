package com.codegnan.javafundamentals;

import java.util.Scanner;

public class Passorfail {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks = scanner.nextInt();
		String result = (marks >= 60) ? "pass" : "fail";
		System.out.println(result);
		scanner.close();

	}

}
