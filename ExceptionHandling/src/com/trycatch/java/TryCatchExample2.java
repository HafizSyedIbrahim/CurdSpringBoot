package com.trycatch.java;

public class TryCatchExample2 {
	public static void main(String args[]){
		try {
			String s = null;
			System.out.println(s.length());	
		}catch(NullPointerException e) {System.out.println("Cannot print because of Null Pointer Exception");} // NullPointer Example
}
}
