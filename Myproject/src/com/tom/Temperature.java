package com.tom;

public class Temperature {
	double calsius;
	
	public Temperature(double calsius){
		this.calsius = calsius;
	}
	public double fahrenheit(){
		double f = calsius * (9.0/5) + 32;
		return f;
	}

	

}
