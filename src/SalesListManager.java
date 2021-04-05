import java.util.Scanner;
import java.util.ArrayList;

public class SalesListManager {
	ArrayList<Menu> menus = new ArrayList<Menu>();
	Menu menu;
	Scanner input;
	
	SalesListManager(Scanner input) {
		this.input = input;
	}
	
	public void printmenu() {
		System.out.println("Menu name : " + menu.name);
		System.out.println("Menu price : " + menu.price);
	}
	
	public void add_SalesList() {
		menu = new Menu();
		System.out.print("Menu name :");
		menu.name = input.next();
		System.out.print("Menu price :");
		menu.price = input.nextInt();
		menus.add(menu);
		
		System.out.println("등록된 메뉴\nMenu name : " + menu.name + "\nMenu price : " + menu.price
				+ "\n*** 등록 완료! 초기메뉴로 되돌아갑니다. ***");
	}
	
	public void delete_SalesList() {
		System.out.print("Menu name :");
		String Menu_name = input.next();
		int index = -1;
		for (int i = 0; i<menus.size(); i++) {
			if (menus.get(i).name.equals(Menu_name)) {
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
		String Menu_name = input.next();
		
		if (menu.name.equals(Menu_name)) {
			System.out.print("Edit  price :");
			int Menu_price = input.nextInt();
			menu.price = Menu_price;
			
			System.out.println("Edit price : " + Menu_price + "\n*** 수정 완료! 초기메뉴로 되돌아갑니다. ***");
		} else { 
			System.out.println("해당 메뉴는 없습니다.");
		}
	}
	
	public void view_SalesList() {
		System.out.println("등록된 메뉴의 수 : " + Menu.numMenu);
		for (int i = 0; i<menus.size(); i++) {
			menus.get(i).printmenu();
		}
	}
}
