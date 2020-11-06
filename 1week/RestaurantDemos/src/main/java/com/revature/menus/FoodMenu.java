package com.revature.menus;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.revature.models.Food;

public class FoodMenu extends AbstractMenu {

	@Override
	public void handleInput() {
		String input = this.getInputReader().nextLine();
		try {
			int choice = Integer.parseInt(input) - 1;
			//in bounds
			if(choice >=0 && choice < this.getLines().size()) {
				this.getLines().get(choice).doAction();
			}else {
				System.out.println("Please Make a Valid Choice");
			}
		}catch (NumberFormatException e) {
			System.out.println("Please Make a Valid Choice");
		}
		
	}

	@Override
	public List<MenuLine> buildMenu() {
		//food service.getAllFood
		Food f1 = new Food("Witches Brew", 250, "Wiccan", "Drink",3);
		Food f2 = new Food("Pumpkin Pie", 2500, "Puritans", "Dessert", 1);
		Food f3 = new Food("Candy Corn", 150, "Demons", "Dessert", 0);
		Food f4 = new Food("Vampire Blood Wine", 450, "Transylvanian", "Drink", 0 );
		Food f5 = new Food("Mutton", 450, "Cows", "Meat", 5);
		
		List<Food> fList = new ArrayList<Food>();
		fList.add(f1);
		fList.add(f2);
		fList.add(f3);
		fList.add(f4);
		fList.add(f5);
		
		List<MenuLine> lines = fList.stream()
				.map(ele -> { 
					return new MenuLine(fList.indexOf(ele),
										()->fList.indexOf(ele)+1 + ": " + ele.display(), 
										()->{ 
												System.out.println("Here is where we would add a food to the order");
											});
				})
				.collect(Collectors.toList());
		
		MenuLine goBack = new MenuLine(lines.size(), ()->lines.size() +  ": Go Back", ()->{
			MenuSelector.getMenuSelector().traverse(-1); 
		});
		lines.add(goBack);
		return lines;
	}

}
