package com.revature.finaldemo;

import com.revature.oop.Food;

public final class FinalLauncher {
	
	public static void main(String[] args) {
		
		final int i = 0;
		
		final Food f = new Food();
		
		System.out.println(f);
		
		f.setName("iceCream");
		
		System.out.println(f);
		
		Food curry = new Food();
		//f = curry;
		
	}

}
