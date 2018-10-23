package com.tom;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		System.out.println("Are you 18? (Y/N)");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		System.out.println("*" + line +"*");
		boolean adult = line.toUpperCase().equals("Y");
		if (adult) {
			System.out.println("your age?");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.println("your name?");
	        String name = scanner.nextLine();
	        System.out.println("your nick name?");
	        String nickname = scanner.nextLine();
	        System.out.println(age + "/" + name + "/" + nickname);
	        
		} else {
		  System.out.println("bye");
		}
		
		
		
	}

}
