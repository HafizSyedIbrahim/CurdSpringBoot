package com.trycatch.java;

public class TryCatchExample {
	public static void main(String args[]){  

	int feet = 12;
	int inch = 0;
	
	try {
	int	conversion = feet/inch;
	}catch (ArithmeticException e) {System.out.println("A Digit cannot be divided by Zero");}	
	
}
}
