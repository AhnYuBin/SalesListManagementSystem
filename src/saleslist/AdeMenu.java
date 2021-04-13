package saleslist;

import java.util.Scanner;

public class AdeMenu extends Menu{
	
	public void getUserInput(Scanner input) {
		System.out.print("Menu name :");
		String name = input.next();
		this.setName(name);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y') {
			System.out.print("시즌 메뉴 인가요 ? (Y/N) : "); //시즌 메뉴는 1000원 할인
			answer = input.next().charAt(0);
			if (answer =='y' || answer == 'Y') {
				System.out.print("Menu price :");
				int price = input.nextInt();
				this.setPrice(price - 1000);
			}
			else {
				System.out.print("Menu price :");
				int price = input.nextInt();
				this.setPrice(price);
			}
		}
	}

}
