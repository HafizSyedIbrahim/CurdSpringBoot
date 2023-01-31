package com.throwexception.java;

public class Throw {
	
	public void validated(int bankBalance) {
	if (bankBalance >=18000) {
		throw new ArithmeticException("Balance more than 18000 cannot be withdrawn in a single transaction"); 
	}
	else 
		{
		System.out.println("Transaction Successful"); 
		}
	}

}
