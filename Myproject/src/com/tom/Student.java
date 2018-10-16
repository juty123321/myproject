package com.tom;

public class Student {
	
	String name;
	int math;
	int english;
	
	public Student(){
	
	}
	
	public Student(String name , int english , int math){
		this.name = name;
		this.english = english;
		this.math = math;
	}
	
	public void print(){
	System.out.println(name + "\t" + math + "\t" + english + "\t" + (english + math) / 2);
	}
	

}
