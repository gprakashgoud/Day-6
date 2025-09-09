package com.codegnan.javafundamentals;

import java.util.Scanner;

public class Divisibleby35 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String result = (num % 3 == 0 && num % 5 == 0) ? num + " is divisible by both" : num + " not divisible by both";
		System.out.println(result);
		scanner.close();

	}

}
