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
	public char getGrading(){
		char grading = 'F';
		int average = getAverage();
		switch(average/10){
		case 10:
		case 9:
			grading = 'A';
			break;
		case 8:
			grading = 'B';
			break;
		case 7:
			grading = 'C';
			break;
		case 6:
			grading = 'D';
			break;	
		}
		return grading;
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
