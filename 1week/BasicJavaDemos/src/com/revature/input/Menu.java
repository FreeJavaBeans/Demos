package com.revature.input;

import java.util.List;

//this will be expanded in the future
//tie the choice to a particular method call
public class Menu {

	private String menuDisplay;
	
	private List<Integer> choices;

	public String getMenuDisplay() {
		return menuDisplay;
	}

	public void setMenuDisplay(String menuDisplay) {
		this.menuDisplay = menuDisplay;
	}

	public List<Integer> getChoices() {
		return choices;
	}

	public void setChoices(List<Integer> choices) {
		this.choices = choices;
	}

	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Menu(String menuDisplay, List<Integer> choices) {
		super();
		this.menuDisplay = menuDisplay;
		this.choices = choices;
	}

	@Override
	public String toString() {
		return "Menu [menuDisplay=" + menuDisplay + ", choices=" + choices + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((choices == null) ? 0 : choices.hashCode());
		result = prime * result + ((menuDisplay == null) ? 0 : menuDisplay.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menu other = (Menu) obj;
		if (choices == null) {
			if (other.choices != null)
				return false;
		} else if (!choices.equals(other.choices))
			return false;
		if (menuDisplay == null) {
			if (other.menuDisplay != null)
				return false;
		} else if (!menuDisplay.equals(other.menuDisplay))
			return false;
		return true;
	}
	
	
	
	
}
