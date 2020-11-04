package com.revature.memory;

public class MemoryLauncher {
	
	
	
	
	
	public static void main(String[] args) {
		int x = 1;
		NumberObject num = new NumberObject(1);
		System.out.println("Before Method Primitive X: " + x);// value 1
		modifyPrimitive(x);// only pass the value of one, not the x variable 
		System.out.println("After Method Primitive X: " + x);// value ?
		
		System.out.println("Before Method Reference X: " + num.x);//value 1
		modifyObject(num);//pass the value of num, pointer to the real object, changes are enabled
		System.out.println("After Method Reference X: " + num.x);//value ?

		
	}
	
	
	public static void modifyPrimitive(int x) {
		x++;
		System.out.println("Inside Method Primitive X: " + x );// value 2
	}
	
	public static void modifyObject(NumberObject num) {
		NumberObject newNum = new NumberObject(2);
		num = newNum;
		System.out.println("Inside Method Reference X: " + num.x); // value 2
	}
	

	//inner class, it belong to its outer class
	//only in scope for the outer class
	static class NumberObject {
		int x;
		
		public NumberObject(int x) {
			this.x = x;
		}
		
	}
	

	
}

