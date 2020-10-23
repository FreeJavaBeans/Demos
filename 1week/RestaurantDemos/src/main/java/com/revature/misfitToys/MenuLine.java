package com.revature.misfitToys;

public abstract class MenuLine<T extends Displayable> implements Displayable{
	
	private int lineNumber;
	
	private T item;
	
	
	public String display() {
		return lineNumber + ". " + item.display();
	}
	
	

}
