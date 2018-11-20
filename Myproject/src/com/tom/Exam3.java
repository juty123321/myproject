package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		Random random = new Random();
		int secret = random.nextInt(10)+1;
		System.out.println(secret);
		Scanner scanner = new Scanner(System.in);
		int guess = 0;
		while(guess != secret && count <=4){
			System.out.println("Your guess("+count+"/4):");
			guess = scanner.nextInt();
			if(guess<secret){
				System.out.println("heigher!");
			}else{
				if(guess>secret){
					System.out.println("lower!");					
				}else{
					break;
				}
			}
			count++;
		}
		if(count>2){
			System.out.println("Great!the secret number is" + secret);
			
		}

	}

}
