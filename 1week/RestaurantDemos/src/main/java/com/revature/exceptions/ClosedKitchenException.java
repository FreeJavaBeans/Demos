package com.revature.exceptions;

public class ClosedKitchenException extends Exception{
	
	public ClosedKitchenException() {
		//we always have a message and we can choose what it reads
		super("The Restaurante Does Not Allow Ordering Off Menu!!!");
	}
}
