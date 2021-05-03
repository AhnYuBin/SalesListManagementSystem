package mainmenu;
import java.util.Scanner;

import saleslist.AdeMenu;
import saleslist.CoffeeMenu;
import saleslist.Menu;

import java.util.ArrayList;

public class SalesListManager {
	ArrayList<Menu> menus = new ArrayList<Menu>();
	Menu menu;
	Scanner input;
	
	SalesListManager(Scanner input) {
		this.input = input;
	}
	
	public void add_SalesList() {
		int kind = 0;
		Menu menu;
		while (kind != 1 && kind !=2 && kind != 3) {
			System.out.println("1. for Coffee ");
			System.out.println("2. for Ade ");
			System.out.println("3. for Dessert ");
			System.out.print("*** Select num for Menu Kind : ***");
			kind = input.nextInt();
			if (kind == 1) {
				menu = new CoffeeMenu();
				menu.getUserInput(input);
				menus.add(menu);
				break;
			}
			else if (kind == 2) {
				menu = new AdeMenu();
				menu.getUserInput(input);
				menus.add(menu);
				break;
			}
			else if (kind == 3) {
				menu = new DessertMenu();
				menu.getUserInput(input);
				menus.add(menu);
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
			Menu menu = menus.get(i);
			if(menus.get(i).getName().equals(search_name)) {
				int num;	
				System.out.println("1. Edit Name");
				System.out.println("2. Edit Price");
						
				num = input.nextInt();
						
				switch(num) {
				case 1 : 
					System.out.print("Menu Name : " );
					String name = input.next();
					menu.setName(name);
					break;
				case 2 :
					System.out.print("Menu Price : ");
					int price = input.nextInt();
					menu.setPrice(price);
					break;
				}
				System.out.println("*** 수정완료! 초기메뉴로 돌아갑니다. ***");
			}
			else {	
				System.out.println("*** 등록된 메뉴가 없거나 잘못 입력하였습니다. ***");
			}
		} //for문
	}
	
	public void view_SalesList() {
		System.out.println("등록된 메뉴의 수 : " + menus.size());
		
		for (int i = 0; i<menus.size(); i++) {
			menus.get(i).printmenu();
		}
	}
	
}
