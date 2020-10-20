package com.revature.controlflow;

public class ControlFlow {
	//how can we the programmer control the execution of the program
	public static void main(String[] args) {
		
		int i = 10;
		
		//the single most important keyword for making interesting programs
		if(i == 10) {
			//take () and inside has some expression that evaulates to true or false
			//we can call any functions we can have literals or variables
			//we can compare anything ( comparing operators generate booleans )
			//if the expression is true, enter the if block and do it
			//if false skip the block
			System.out.println("We entered the 1st if statement, this means i == 10");
		}
		//with an if statement we can add on any number of if else statements for additional conditions
		//we can terminate with a sinhle else statement if there are no matching conditions
		
		
		
		if(false) {
			
		}else {
			System.out.println("This is the second else, it always fires because the if is (false)");
		}
		
		//each new if statement starts a chain of logic
		//only a single block will ever execute in an if chain
		if(i==1) {
			
		}else if( i ==2) {
			
		}else if (i == 3) {
			
		}else {
			System.out.println("I was not 1, 2 or 3");
		}
		
		//aside for operators in conditions
		// == for equality != for not equality
		// > < >= <= we can combine with math operators
		// && logical and -  to make two different conditions be true
		// || logical or - to make two conditions not both be false
			
		
		//loops are a way to execute the same block of code many times depending on a condition
		//you have ten users and need each one to get a random favorite number
		i = 0;
		//a while loop will continue to run until its condition is false
		//if the condition starts false, the loop never executes
		while(i != 10) {
			//assign a random number
			System.out.println(i);
			i++;
			//the ++ operator just means add one to the variable, -- means suibtract one
		}
			
		//a do while is very similar to a while loop, 
		//it always executes once then it check the while condition
		do {
			System.out.println("I run at least once");
		} while(i != 10);
		
		//generally the most useful loop
		//the most ability to customize
		//takes in three parts
		//part one is for declaring a variable for the loop to use ( optional )
		//part two is the condition to terminate the loop ( optional )
		//part three is what to do after each iteration completes ( optional ) 
		for(;;) {//while(true)
			System.out.println("this is the infinte loop");
			break;
		}
		//is used for looping through data structures 
		for(int j = 0; j < 10; j++) {
			System.out.println("j = " + j);
		}
		//a fancy if else statement
		//it can only take in ints or strings
		//it matches them against cases
		//it will match a case and then keep falling down until it leaves switch or finds break
		i = 1;
		switch (i) {
		case 0 :{
			System.out.println("case 0");
			break;
		}
		case 1 :{
			System.out.println("case 1");
			break;
		}
		case 3 :{
			System.out.println("case 1");
			break;
		}
		case 10 :{
			System.out.println("case 1");
			break;
		}
		case 15 :{
			System.out.println("case 1");
			break;
		}
		default:{
			System.out.println("case default");
			break;
		}
			
		}

	}

}
