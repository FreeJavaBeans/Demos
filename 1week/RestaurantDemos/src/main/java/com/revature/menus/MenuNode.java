package com.revature.menus;

import java.util.List;

//to build a tree of menus
public class MenuNode {

	private Menu value;
	
	private MenuNode parent;
	
	private List<MenuNode> children;
	
	
	public MenuNode backwards() {
		return parent;
	}
	
	public MenuNode forwards(int i) {
		return children.get(i);
	}

	public MenuNode(Menu value, MenuNode parent, List<MenuNode> children) {
		super();
		this.value = value;
		this.parent = parent;
		this.children = children;
	}

	public Menu getValue() {
		return value;
	}

	public void setValue(Menu value) {
		this.value = value;
	}

	public MenuNode getParent() {
		return parent;
	}

	public void setParent(MenuNode parent) {
		this.parent = parent;
	}

	public List<MenuNode> getChildren() {
		return children;
	}

	public void setChildren(List<MenuNode> children) {
		this.children = children;
	}
	
	
	
	
}
