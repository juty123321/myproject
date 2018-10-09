package com.tom;

public class Person {
	String Person = "Chiu";
	float height;
	float weight;

	public Person(float weight, float height) {
		this.weight = weight;
		this.height = height;
	}

	public void hello() {
		System.out.println("hello");
	}

	public float bmi() {
		float bmi = weight / (height * height);
		return bmi;
	}

}
