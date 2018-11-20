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
		System.out.println(name + "\t" + math + "\t" + english + "\t" +
				getAverage() + "\t");
		if (getAverage()<60){
			System.out.println("FALIED");
		}else{
			System.out.println("PASS");
		}
		}
	public int highest(){
		if(english > math){
			return english;
		}else{
			return math;
		}
	}
	
	public int getAverage(){
		return (english + math)/2;
	}
	

}
