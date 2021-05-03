package saleslist;

import java.util.Scanner;

public class DessertMenu extends Menu {
	
	public void getUserInput(Scanner input) {
		System.out.print("Menu name :");
		String name = input.next();
		this.setName(name);
		
		String answer = "N";
		
		while (true) {
		System.out.print("���� �޴� �ΰ��� ? (Y/N) : "); //���� �޴��� 1000�� ���ε� �ݾ����� ����
		answer = input.next();
		if (answer.equals("y") || answer.equals("Y")) {
			System.out.print("Menu price :");
			int price = input.nextInt();
			this.setPrice(price - 1000);
			this.setSeason(answer);
		}
		else {
			System.out.print("Menu price :");
			int price = input.nextInt();
			this.setPrice(price);
			this.setSeason(answer);
		}
		break;
		}
	}

}
