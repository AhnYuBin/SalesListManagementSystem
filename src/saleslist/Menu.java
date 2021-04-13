package saleslist;

import java.util.Scanner;

public class Menu {

	protected MenuKind kine = MenuKind.coffee;
	protected String name;
	protected int price;
	
	public Menu() {
		
	}
	
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public MenuKind getKine() {
		return kine;
	}

	public void setKine(MenuKind kine) {
		this.kine = kine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void printmenu() {
		System.out.println("name : " + name + "\nprice : " + price);
	}
	
	public void getUserInput(Scanner input) { 
		System.out.print("Menu name :");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Menu price :");
		int price = input.nextInt();
		this.setPrice(price);
	}
}
