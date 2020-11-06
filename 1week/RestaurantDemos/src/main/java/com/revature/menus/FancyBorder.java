package com.revature.menus;

public class FancyBorder implements DisplayableBuilder {

	private Displayable d;
	
	
	
	public Displayable enhancedDisplay() {
		String base = d.display();
		String[] lines = base.split("\n");
		String border= "";
		int maxSize = 25;
		for(String s : lines) {
			if(s.length() > maxSize) {
				maxSize = s.length();
			}
		}
		for(int i = 0; i < maxSize; i++) {
			border += "#";
		}
		String ret = border + "\n" + base + border + "\n";
		return ()->ret;
	}



	public FancyBorder(Displayable d) {
		super();
		this.d = d;
	}

}
