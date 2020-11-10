package com.revature.lang;

import java.util.Random;

public class JavaLangLauncher {

	
	
	public static void main(String[] args) {
		String h = "This is a string of user data, and maybe somewhere in here they mention a color like brown?";
		//loop through a set of colors
		System.out.println(h.indexOf("brown"));
		
		String [] hSplit = h.split(" ");
		for( String s : hSplit) {
			System.out.println(s);
		}
		String joined = String.join("::", hSplit);
		System.out.println(joined);
		//might want to study a little regex
		//toLowerCase
		//toUppserCase
		
		
		Random r = new Random();
		
		System.out.println(r.nextBoolean());
		
		if(r.nextBoolean()) {
			System.out.println(r.nextInt(10));
		}else {
			System.out.println(r.nextGaussian());
		}
		
		System.out.println(Math.pow(10,4));
		System.out.println(Math.cbrt(1457));
		System.out.println("This is Ceil");
		System.out.println("1.1 -> " + Math.ceil(1.1));
		System.out.println("1.5 -> " + Math.ceil(1.5));
		System.out.println("1.8 -> " + Math.ceil(1.8));
		System.out.println("1.99 -> " + Math.ceil(1.99));
		System.out.println("This is Floor");
		System.out.println("1.1 -> " + Math.floor(1.1));
		System.out.println("1.5 -> " + Math.floor(1.5));
		System.out.println("1.8 -> " + Math.floor(1.8));
		System.out.println("1.99 -> " + Math.floor(1.99));
		
		
	}
}
