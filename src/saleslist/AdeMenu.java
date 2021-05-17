package saleslist;

import java.util.Scanner;

public class AdeMenu extends Menu {

	
	public AdeMenu(MenuKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setMenuName(input);
		setMenuSeaonYN(input);
	}
	
	public void printmenu() {
		String mkind = "Ade";
		System.out.println("kind: " + mkind + "\nname : " + this.getName() + "\nprice : " + this.getPrice()  + "\nseason : " + this.getSeason());
		System.out.println("---------------------------------------------------------------");
	}

}
