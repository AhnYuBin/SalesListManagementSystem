package mainmenu;
import java.util.Scanner;

import saleslist.AdeMenu;
import saleslist.CoffeeMenu;
import saleslist.DessertMenu;
import saleslist.Menu;
import saleslist.MenuInput;
import saleslist.MenuKind;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class SalesListManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8425492691090944626L;
	
	ArrayList<MenuInput> menus = new ArrayList<MenuInput>();
	Menu menu;
	transient Scanner input;
	
	SalesListManager(Scanner input) {
		this.input = input;
	}
	
	public void add_SalesList() {
		showAddMenu();
		int kind = 0;
		MenuInput menuInput ;
		while (kind != 1 && kind !=2 && kind != 3) {
			try {
				kind = input.nextInt();
				
				switch(kind) {
				case 1 : 
					menuInput = new CoffeeMenu(MenuKind.coffee);
					addMenuInput(menuInput);
					break;
				case 2 :
					menuInput = new AdeMenu(MenuKind.ade);
					addMenuInput(menuInput);
					break;
				case 3 :
					menuInput = new DessertMenu(MenuKind.dessert);
					addMenuInput(menuInput);
					break;
				default : 
					System.out.println("1~3의 정수를 입력해주세요. "); continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("1~3의 정수를 입력해주세요. ");
				if (input.hasNext()) {
					input.next();
				}
				kind = 0;
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
		removefromMenus(index, name);
	}
	
	public void edit_SalesList() {
		System.out.print("Menu name :");
		String search_name = input.next();
		
		for (int i= 0; i<menus.size(); i++) {
			MenuInput menu = menus.get(i);
			if(menus.get(i).getName().equals(search_name)) {
				showEditMenu();
				int num = input.nextInt();
	
				try {
					switch(num) {
						case 1 : 
							menu.setMenuName(input);
							break;
						case 2 :
							menu.setMenuPrice(input);
							break;
					}
				}
				catch(InputMismatchException e) {
					System.out.println("1 또는 2 를 입력해주세요.(1.이름수정, 2.가격수정");
					if (input.hasNext()) {
						input.next();
					}
				} //try catch문
				System.out.println("*** 수정완료! 초기메뉴로 돌아갑니다. ***");
			} //if문
			else {
				System.out.println("*** 일치하는 메뉴가 없습니다. ***");
				break;
			}
		} //for문
	}
	
	public void view_SalesList() {
		System.out.println("등록된 메뉴의 수 : " + menus.size());
		
		for (int i = 0; i<menus.size(); i++) {
			menus.get(i).printmenu();
		}
	}
	
	public int size() {
		return menus.size();
	}
	
	public MenuInput get(int index) {
		return (Menu) menus.get(index);
	}
	
	public void showAddMenu() { 
		System.out.println("1. for Coffee ");
		System.out.println("2. for Ade ");
		System.out.println("3. for Dessert ");
		System.out.print("*** Select num for Menu Kind : ***");
	}
	
	public void showEditMenu() {
		System.out.println("1. Edit Name");
		System.out.println("2. Edit Price");
	}
	
	public void addMenuInput(MenuInput menuInput) {
		menuInput.getUserInput(input);
		menus.add(menuInput);
	}
	
	public int removefromMenus(int index, String name) {
		
		if (index >= 0) {
			menus.remove(index);
			System.out.println("*** 삭제 완료! 초기메뉴로 되돌아갑니다. ***");
			return 1;
		}
		else { 
			System.out.println("*** 등록된 메뉴가 없습니다. ***");
			return -1;
		}
	}
}
