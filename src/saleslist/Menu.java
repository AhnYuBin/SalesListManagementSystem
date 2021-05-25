package saleslist;

import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Menu implements MenuInput, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3161887260905725707L;
	
	protected MenuKind kind = MenuKind.coffee;
	protected String name;
	protected int price;
	protected String season;
	
	public Menu() {
		
	}
	
	public Menu(MenuKind kind) { 
		this.kind = kind;
	}
	
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Menu(String name, int price, String season) {
		this.name = name;
		this.price = price;
		this.season = season;
	}
	
	public MenuKind getKine() {
		return kind;
	}

	public void setKine(MenuKind kind) {
		this.kind = kind;
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
	
	public String getSeason() {
		return season;
	}
	
	public void setSeason(String season) {
		this.season = season;
	}
	
	public abstract void printmenu();
	
	public void setMenuSeaonYN(Scanner input) {
		String answer = "N";
		while (true) {
			System.out.print("시즌 메뉴 인가요 ? (Y/N) : "); //시즌 메뉴는 1000원 할인된 금액으로 저장
			answer = input.next();
			if (answer.equals("y") || answer.equals("Y")) {
				setMenuPrice(input);
				this.setPrice(price - 1000);
				this.setSeason(answer);
				break;
			}
			else if (answer.equals("N") || answer.equals("n")){
				setMenuPrice(input);
				this.setSeason(answer);
				break;
			}
			else {
				System.out.println("다시 입력하세요. (Y/y/N/n) ");
			}
		}
	}
	
	public void setMenuName(Scanner input) {
		System.out.print("Menu Name : " );
		String name = input.next();
		this.setName(name);
	}
	
	public void setMenuPrice(Scanner input) {
		int price = 0;
		while (price == 0) {
			try {
				System.out.print("Menu Price : ");
				price = input.nextInt();
				this.setPrice(price);
			}
			catch(InputMismatchException e) {
				System.out.println("정수를 입력해주세요. ");
				if (input.hasNext()) {
					input.next();
				}
			}
		}
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
