package com.trycatch.java;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int feet = 100;
			int inch = 0;
			int convert;
		try {
		 convert = feet/inch;
		}catch (ArithmeticException e)
		{System.out.println("Digit cannot be divided by zero");}			
	}

}
