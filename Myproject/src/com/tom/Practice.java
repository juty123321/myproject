package com.tom;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args){
		System.out.println("Celsius temperature?");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		double c = 24;
		//System.out.println(c * (9.0/5) + 32);
		System.out.println("Fahrenheit temperature is" + (c * (9.0/5) + 32));
	}
}
