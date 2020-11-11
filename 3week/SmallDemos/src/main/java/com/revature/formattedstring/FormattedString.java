package com.revature.formattedstring;

public class FormattedString {

	
	public static void main(String[] args) {
		
		String s1 = "Team Free Java Beans";
		
		
		System.out.printf("Don't you know, ::%40s:: is the coolest around %n", s1);
		System.out.printf("Does Arguement one%nexist? %n    %1$-4b%nhashcode?%n    %1$h%n"
				+ "Does Arguement two%nexist? %n    %2$b%nhashcode?%n    %2$h%n", s1, null);
		//know your basic conversions
		
		
	}
	
	
}
