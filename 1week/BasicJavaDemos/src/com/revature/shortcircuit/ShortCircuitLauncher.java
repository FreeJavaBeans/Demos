package com.revature.shortcircuit;

//all an import does is allow us to not have to use the fully qualified class name in subsequent code
import com.revature.objects.Food;

public class ShortCircuitLauncher {

	
	public static void main(String[] args) {
		
		Food f = null;
		boolean b = false;
		if(b && f.describe() == " ") {
			System.out.println("If f was evaled, we would get a null pointer exception");
		} else {
			System.out.println("If this prints we didn't eval f and skipped a nullpointer exception");
		}
		b = true;
		if(b || f.describe() == " ") {
			System.out.println("We saw b was true and didn't run the method");
		}else {
			System.out.println("This should never run");
		}
		
		String s = "";
		
	}
	
}
