package com.revature.strings;

public class StringLauncher {
	
	static int classBound = 0;
	
	public static void main(String[] args) {
		
		String s1 = "Hello World";
		String s2 = "Hello World";
		System.out.println("Comapring s1 and s2");
		compareStrings(s1, s2);// T or F? then T
		
		String s3 = "Hello " + "World";
		System.out.println("comapring s1 and s3");
		compareStrings(s1, s3);
		
		String s4 = new String("Hello World");
		System.out.println("comapring s1 and s4");
		compareStrings(s1, s4);
		
		String s5 = "Hello World is an interesing phrase commonly associated with writing a program in a new language for the first time.";
		s5 = s5.substring(0, 11);
		System.out.println("comparing s1 and s5");
		compareStrings(s1, s5);
		s5 = s5.intern();//guarantees that the string returned will be the one in the pool
		System.out.println("comparing s1 and s5.intern()");
		compareStrings(s1, s5);
		
		String test = "The quick brown fox jumped over the lazy dog";
		System.out.println(test.charAt(10));
		System.out.println(test.indexOf('z'));
		for(int i = 0; i<test.length(); i++) {
			System.out.println(test.charAt(i));
		}
		String[] words = test.split(" ");//find every space and divide the string in two at those locations, removing the space
		for(int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		StringBuilder sb = new StringBuilder(s5);
		StringBuilder sb2 = sb.reverse()
							  .insert(5, 'z')
							  .append(test);//this method mutates the original objects
		System.out.println(sb);
		System.out.println(sb2);
		
		StringBuffer sSlow = new StringBuffer("Don't use me I'm slow and inefficient");
		
		
	}
	
	
	public static void compareStrings(String s1, String s2) {
		System.out.println("First String == Second String Result: " + ((Boolean)(s1==s2)).toString());
		System.out.println("First String.equals(Second String) Result: " + s1.equals(s2));
	}

}
