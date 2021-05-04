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
			System.out.print("Is it ice coffee ? (Y/N) : "); //���̽�Ŀ�Ǵ� 500�� �߰�
			answer = input.next().charAt(0);
			if (answer =='y' || answer == 'Y') {
				System.out.print("Menu price :");
				int price = input.nextInt();
				this.setPrice(price + 500);
				this.setName("���̽�" + name); //Hot, Ice ������ ���� �ڵ����� ���̽� ���
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
