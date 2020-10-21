package com.revature.scopes;

import java.util.ArrayList;
import java.util.List;

public class ScopesLauncher {
	
	//this is one scope
	//static scoped varaible
	//class scoped variable
	//as close to global as we can get in java
	//there is no global scope in java
	//for field access modifiers do matter
	static int classBound = 100;
	
	//next scope is instance scoped
	//maybe object scoped
	//this variable belongs to a particular object
	//with access to object you get object scoped vars
	int objectBound = 0;
	
	//first kind of local variable
	//method scoped
	//parameters to a method are their own special scope
	//they get an identifier that cannot be reused in the method block
	public static void main (String[] localMethod) {
		
		List<Integer> l = new ArrayList<>();
		Integer [] array = (Integer[]) l.toArray();
		
		//next scope
		//this is a block scoped variable
		//it belongs to a set of curly braces 
		//block scoped to a particular block of code and disappears when the block finishes
		int localBlock = 0;
		
		//this is an example of variable shadowing
		//when we declare a local var with the same ID as a field var
		//then in the block of code we assume to use the local instead of the field
		int classBound = 0;
		System.out.println(classBound);
		//we can still access a shadowed variable
		//we just need to explicitly name them
		System.out.println(ScopesLauncher.classBound);
		for(int i = 0;;) {//have to be different
			for(int j = 0;;) {//only on id in a local block
				for(int k = 0;;) {//and we can only shadow fields
					break;
				}//k is gone
				break;
			}// j is gone
			break;
		}//i is gone
		int i = 0;//we reused it because I has left scope
		//i left scope when its for loop finished executing
	}//our local classBound is gone
	

}
