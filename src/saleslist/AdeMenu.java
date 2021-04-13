package saleslist;

import java.util.Scanner;

public class AdeMenu extends Menu{
	
	public void getUserInput(Scanner input) {
		System.out.print("Menu name :");
		String name = input.next();
		this.setName(name);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y') {
			System.out.print("���� �޴� �ΰ��� ? (Y/N) : "); //���� �޴��� 1000�� ����
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
