package com.tom;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Your name");
		String name = scanner.nextLine();
		System.out.println(name);
		
		
		Student stu = new Student();
		stu.name = "Rita";
		stu.english = 70;
		stu.math = 90;
		stu.print();
		System.out.println(3 <= 5);
		
		String s = new String("abc");
		String s2 = "abc";
		System.out.println(s.equals(s2));
		
				
		
		// int age = 20;
		// float height = 172.6f;
		// int weight = 53;
		// int schoolyear = 107;
		// String name = "Rita";
		// System.out.println(name);
		// System.out.println(age);
		// System.out.println(height);
		// System.out.println(weight);
		// System.out.println(schoolyear);
		Person p = new Person(53, 1.7f);
		// p.weight = 53;
		// p.height = 1.7f;
		System.out.println(p.bmi());
		p.hello();
		// Person rita = new Person();
		// Person jack = null;
		// jack.hello();	


	}
}
