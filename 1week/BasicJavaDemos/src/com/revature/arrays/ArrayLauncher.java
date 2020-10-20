package com.revature.arrays;

import java.util.Random;

public class ArrayLauncher {

	public static void main(String[] valuesPassedInWhenExecutingThisClassWithJava) {
		int [] ints = new int[10];//new keyword + type[size]
		int [] explicit = {0,0,0,1,2,3,4,5,6};
		
		String [][] gameboard = new String[3][3];
		
		//this will randomly make a "tic tac toe" board
		Random r = new Random();
		for(int i = 0; i < gameboard.length; i++) {
			for(int j = 0; j < gameboard[i].length; j++) {
				int choice = r.nextInt(2);//random between 0 and 1
				if(choice == 0) {
					gameboard[i][j] = "X";
				}else {
					gameboard[i][j] = "O";
				}
			}
		}
		
		//to print out a 2 d array
		for(int i = 0; i < gameboard.length; i++) {
			for(int j = 0; j < gameboard[i].length; j++) {
				System.out.print(gameboard[i][j]);//print one line
			}
			System.out.println();//get a new line char
		}
		
		
	
	
	//the for loop for an array is very consistant
	//you start at zero and you go to less than the length
	for(int i = 0; i < explicit.length; i++) {
		explicit[i] = explicit[i]*2;
		System.out.println(explicit[i]);
	}
	
	
	//going backwards through an array is similar but different
	for(int i = ints.length-1; i >= 0; i--) {
		
	}
	
	}
	
}
