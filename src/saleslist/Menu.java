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
	protected String type;
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
	
	public Menu(String name, int price, String type, String season) {
		this.name = name;
		this.price = price;
		this.type = type;
		this.season = season;
	}
	
	public MenuKind getKind() {
		return kind;
	}

	public void setKind(MenuKind kind) {
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
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	} // �߰�
	
	public abstract void printmenu();
	
	public void setMenuName(Scanner input) {
		System.out.print("Menu Name : " );
		String name = input.next();
		this.setName(name);
	}
	
	public String getKindString() {
		String mkind = "none";
		switch(this.kind) {
		case coffee:
			mkind = "Coffee";
			break;
		case ade:
			mkind = "Ade";
			break;
		case dessert:
			mkind = "Dessert";
			break;
		default :
		}
		return mkind;
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
				System.out.println("������ �Է����ּ���. ");
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
	
	public void setMenuSeaonYN(Scanner input) {
		String answer = "N";
		
		while (true) {
			System.out.print("���� �޴� �ΰ��� ? (Y/N) : "); //���� �޴��� 1000�� ���ε� �ݾ����� ����
			answer = input.next();
			if (answer.equals("y") || answer.equals("Y")) {
				//setMenuPrice(input);
				answer = "Y";
				this.setPrice(price - 1000);
				this.setSeason(answer);
				break;
			}
			else if (answer.equals("N") || answer.equals("n")){
				//setMenuPrice(input);
				answer = "N";
				this.setSeason(answer);
				break;
			}
			else {
				System.out.println("�ٽ� �Է��ϼ���. (Y/y/N/n) ");
			}
		}
	}
	
	public void setMenuTypeYN(Scanner input) {
		String answer = "H";
	
		while (true) {
			System.out.print("ice coffee ? / hot coffee? (I/H) : ");
			answer = input.next();
			
			if (answer.equals("I") || answer.equals("i") || answer.equals("ice") || answer.equals("ICE")) {
				//setMenuPrice(input);
				answer = "ICE";
				this.setPrice(getPrice()+500); //Ice�� 500�� �߰��� �������� ����
				this.setName("���̽�" + getName()); //Hot, Ice ������ ���� �ڵ����� ���̽� ���
				this.setType(answer); //�߰�
				break;
			}
			else if (answer.equals("H") || answer.equals("h")) {
				//setMenuPrice(input);
				answer = "HOT";
				this.setType(answer); //�߰�
				break;
			}
			else {
				System.out.println("�ٽ� �Է��ϼ���. (Y/y/N/n)");
			}
		}
	}
}
