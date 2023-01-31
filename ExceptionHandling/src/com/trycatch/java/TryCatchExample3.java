package com.trycatch.java;

public class TryCatchExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
            int a = Integer.parseInt("1a"); // NumberFormat Exception
            System.out.println(a);
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormat Exception: invalid input string");
        }
		
		try {
		String S = "My String";
		int a = Integer.parseInt(S);
		}catch (NumberFormatException e)
		{
			System.out.println(e);
		}
}
}
