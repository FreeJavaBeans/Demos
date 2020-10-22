package com.revature.args;

public class ArgsLauncher {
	
	
	public static void main(String[] args) {
		
		for(int i = 0; i < args.length; i++) {
			if(args[i].equals("-n")) {
				System.out.println("Hello " + args[i+1]);
			}
		}
		
		
		
	}
	
	

}
