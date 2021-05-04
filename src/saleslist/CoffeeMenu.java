package saleslist;

import java.util.Scanner;

public class CoffeeMenu extends Menu{
	
	public CoffeeMenu(MenuKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		System.out.print("Menu name :");
		String name = input.next();
		this.setName(name);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y') {
			System.out.print("Is it ice coffee ? (Y/N) : "); //아이스커피는 500원 추가
			answer = input.next().charAt(0);
			if (answer =='y' || answer == 'Y') {
				System.out.print("Menu price :");
				int price = input.nextInt();
				this.setPrice(price + 500);
				this.setName("아이스" + name); //Hot, Ice 구별을 위해 자동으로 아이스 명시
				break;
			}
			else {
				System.out.print("Menu price :");
				int price = input.nextInt();
				this.setPrice(price);
				break;
			}
		}
	}
}
