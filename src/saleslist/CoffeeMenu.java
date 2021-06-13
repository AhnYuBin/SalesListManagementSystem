package saleslist;

import java.util.Scanner;

public class CoffeeMenu extends Menu {

	public CoffeeMenu(MenuKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setMenuName(input);
		setMenuTypeYN(input);
	}
	
	public void printmenu() {
		String mkind = getKindString();
		System.out.println("kind: " + mkind + "\nname : " + this.getName() + "\nprice : " + this.getPrice() + "\ntype : " + this.getType());
		System.out.println("---------------------------------------------------------------");
	}

}
