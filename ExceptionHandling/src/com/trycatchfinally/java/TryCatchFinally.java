package com.trycatchfinally.java;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		try { // Nested try catch
			try {
				int inches = 10;
				int cm = 0;
				int conversion = inches /cm;
				}catch(NullPointerException exception) {System.out.println("System is not related");} 
			// As exception is not related with NullPointerExcetion so, catch block will not be executed.
		}catch(ArithmeticException a) {System.out.println(a);}		
		finally {
			System.out.println("Finally Block has been executed after try catch block");
			}
}
}