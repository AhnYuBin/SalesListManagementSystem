package mainmenu;
import java.util.Scanner;

import saleslist.AdeMenu;
import saleslist.CoffeeMenu;
import saleslist.DessertMenu;
import saleslist.Menu;
import saleslist.MenuInput;
import saleslist.MenuKind;

import java.util.ArrayList;

public class SalesListManager {
	ArrayList<MenuInput> menus = new ArrayList<MenuInput>();
	Menu menu;
	Scanner input;
	
	SalesListManager(Scanner input) {
		this.input = input;
	}
	
	public void add_SalesList() {
		int kind = 0;
		MenuInput menuInput ;
		while (kind != 1 && kind !=2 && kind != 3) {
			System.out.println("1. for Coffee ");
			System.out.println("2. for Ade ");
			System.out.println("3. for Dessert ");
			System.out.print("*** Select num for Menu Kind : ***");
			kind = input.nextInt();
			if (kind == 1) {
				menuInput = new CoffeeMenu(MenuKind.coffee);
				menuInput.getUserInput(input);
				menus.add(menuInput);
				break;
			}
			else if (kind == 2) {
				menuInput = new AdeMenu(MenuKind.ade);
				menuInput.getUserInput(input);
				menus.add(menuInput);
				break;
			}
			else if (kind == 3) {
				menuInput = new DessertMenu(MenuKind.dessert);
				menuInput.getUserInput(input);
				menus.add(menuInput);
				break;
			}
			else {
				System.out.print("Select num for Menu kind : ");
			}
		}
		
	}
	
	public void delete_SalesList() {
		System.out.print("Menu name :");
		String name = input.next();
		
		int index = -1;
		for (int i = 0; i<menus.size(); i++) {
			if (menus.get(i).getName().equals(name)) {
				index = i;
				break;
			}
		}
		
		if (index >= 0) {
			menus.remove(index);
			System.out.println("*** 삭제 완료! 초기메뉴로 되돌아갑니다. ***");
		}
		else { 
			System.out.println("*** 등록된 메뉴가 없습니다. ***");
			return;
		}
	}
	
	public void edit_SalesList() {
		System.out.print("Menu name :");
		String search_name = input.next();
		
		for (int i= 0; i<menus.size(); i++) {
			MenuInput menuInput = menus.get(i);
			if(menus.get(i).getName().equals(search_name)) {
				int num;	 
				System.out.println("1. Edit Name");
				System.out.println("2. Edit Price");
						
				num = input.nextInt();
						
				switch(num) {
				case 1 : 
					System.out.print("Menu Name : " );
					String name = input.next();
					menuInput.setName(name);
					break;
				case 2 :
					System.out.print("Menu Price : ");
					int price = input.nextInt();
					menuInput.setPrice(price);
					break;
				}
				System.out.println("*** 수정완료! 초기메뉴로 돌아갑니다. ***");
			}
		} 
	}
	
	public void view_SalesList() {
		System.out.println("등록된 메뉴의 수 : " + menus.size());
		
		for (int i = 0; i<menus.size(); i++) {
			menus.get(i).printmenu();
		}
	}
	
}
