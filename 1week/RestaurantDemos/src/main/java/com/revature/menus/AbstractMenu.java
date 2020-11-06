package com.revature.menus;

import java.util.List;
import java.util.Scanner;

import com.revature.util.ScannerSingleton;

public abstract class AbstractMenu implements Menu {

	private List<MenuLine> lines;
	
	private Scanner inputReader;//consider writing a scanner singleton
	
	
	public AbstractMenu() {
		super();
		inputReader = ScannerSingleton.getScanner();
		lines = buildMenu();
	}
	
	
	
	public String display() {
		String display = "";
		for(MenuLine ml : lines) {
			display += ml.display() + "\n";
		}
		return display;
	}

	public abstract void handleInput();
	
	//create all the menu lines
	public abstract List<MenuLine> buildMenu();



	protected List<MenuLine> getLines() {
		return lines;
	}



	protected void setLines(List<MenuLine> lines) {
		this.lines = lines;
	}



	protected Scanner getInputReader() {
		return inputReader;
	}



	protected void setInputReader(Scanner inputReader) {
		this.inputReader = inputReader;
	}
	
	
	
	

}
