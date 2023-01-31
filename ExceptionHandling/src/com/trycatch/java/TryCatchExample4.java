package com.trycatch.java;

public class TryCatchExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]= new int[5]; // When size of array exceeds its original size.
			a[10]=10;
		}catch(ArrayIndexOutOfBoundsException a) {System.out.println(a);}
		finally {  
			System.out.println("finally block is always executed");  
			}   
};
}