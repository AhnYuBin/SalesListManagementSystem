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
					System.out.println("1~3�� ������ �Է����ּ���. "); continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("1~3�� ������ �Է����ּ���. ");
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
					System.out.println("1 �Ǵ� 2 �� �Է����ּ���.(1.�̸�����, 2.���ݼ���");
					if (input.hasNext()) {
						input.next();
					}
				} //try catch��
				System.out.println("*** �����Ϸ�! �ʱ�޴��� ���ư��ϴ�. ***");
			} //if��
			else {
				System.out.println("*** ��ġ�ϴ� �޴��� �����ϴ�. ***");
				break;
			}
		} //for��
	}
	
	public void view_SalesList() {
		System.out.println("��ϵ� �޴��� �� : " + menus.size());
		
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
			System.out.println("*** ���� �Ϸ�! �ʱ�޴��� �ǵ��ư��ϴ�. ***");
			return 1;
		}
		else { 
			System.out.println("*** ��ϵ� �޴��� �����ϴ�. ***");
			return -1;
		}
	}
}
