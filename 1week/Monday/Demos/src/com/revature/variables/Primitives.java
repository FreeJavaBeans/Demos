package com.revature.variables;

public class Primitives {

	public static void main(String[] commandLinePassedIn) {
		
		//first grouping are integer numbers
		//whole numbers
		//the have no decimal
		byte b; //1 byte in size
		
		short s;//two bytes in size
		
		char c;//two bytes in size
		
		int i;//four bytes in size  2^31 -1
		int max = Integer.MAX_VALUE;
		
		long l;//long 8 bytes in size
		
		
		//floating point numbers
		//they can have decimals
		float f;//4 bytes
		
		double d;//8 bytes
		
		
		
		
		//boolean option
		//this is the only way to denote true or false
		//cannot use 1 for true or 0 for false, no using null only boolean
		boolean bool;//java says don't worry about it
		
		
		
		b = -128;//is signed
		b = 127;
		c = (char) b;//casting, treat one variable as if it was another
		System.out.println("c is:" + c + " b is:" + b);
		//casting can sometime be dangerous
		//moving from larger primitive to a smaller primitive
		//we risk overflow
		c = 1152;
		b = (byte) c;//sets b the overflowed value that gets passed in
		System.out.println("c is:" + c + " b is:" + b);
		
		i = 200;
		l = 3000000000L;//when dealing with number literals ( a number you write out ) 
		//java basically always assumes its an int 
		
		//reassign to make it smaller
		l = 150;
		
		System.out.println("i is:" + i + " l is:" + l + " i/l = " + (i/l));
		//on integers we can do the modulus operation to return the remainder
		System.out.println("i is:" + i + " l is:" + l + " i%l = " + (i%l));
		
		f = 10F;
		d = 30D;
		
		System.out.println("i is:" + i + " d is:" + l + " i/d = " + (i/d));
		
		bool = true;
		bool = false;
		
	}
	
	
}
