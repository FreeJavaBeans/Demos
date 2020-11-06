package com.revature.menus;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.User;

public class MenuSelector implements Displayable{
	
	private MenuNode currentMenu;
	
	private User currentUser;
	
	private static MenuSelector ms = new MenuSelector();
	
	private MenuSelector() {
		super();
		this.currentMenu = buildMenus();
	}
	
	@Override
	public String display() {
		// TODO Auto-generated method stub
		return new FancyBorder(currentMenu.getValue()).enhancedDisplay().display();
	}
	
	public void traverse(int i) {
		if(i == -1) {
			this.currentMenu = currentMenu.backwards();
		}else {
			this.currentMenu = currentMenu.forwards(i);
		}
	}
	

	private MenuNode buildMenus() {
		MenuNode login = new MenuNode(new LoginMenu(), null, null);
		MenuNode main = new MenuNode(new MainMenu(), login, null);
		MenuNode food = new MenuNode(new FoodMenu(), main, null);
		
		List<MenuNode> loginChildren = new ArrayList<MenuNode>();
		loginChildren.add(main);
		login.setChildren(loginChildren);
		
		List<MenuNode> mainChildren = new ArrayList<>();
		mainChildren.add(food);
		main.setChildren(mainChildren);
		
		
		return login;
	}
	
	
	public void reset() {
		this.currentMenu = buildMenus();
		this.currentUser = null;
	}
	
	public void handleInput() {
		this.currentMenu.getValue().handleInput();
	}


	public static MenuSelector getMenuSelector() {
		return ms;
	}

	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}
	
	
	
	
}
