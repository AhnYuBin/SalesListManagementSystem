package saleslist;

import java.util.Scanner;

public class DessertMenu extends Menu {
	
	public DessertMenu(MenuKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setMenuName(input);
		setMenuPrice(input);
		setMenuSeaonYN(input);
	}
	
	public void printmenu() {
		String mkind = "Dessert";
		System.out.println("kind: " + mkind + "\nname : " + this.getName() + "\nprice : " + this.getPrice()  + "\nseason : " + this.getSeason());
		System.out.println("---------------------------------------------------------------");
	}

}
