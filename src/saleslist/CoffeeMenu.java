package saleslist;

import java.util.Scanner;

public class CoffeeMenu extends Menu {
	
	public CoffeeMenu(MenuKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setMenuName(input);
		
		setMenuTypeYN(input);
		
//		char answer = 'x';
//		
//		while (answer != 'y' && answer != 'Y') {
//			System.out.print("Is it ice coffee ? (Y/N) : ");
//			answer = input.next().charAt(0);
//			
//			if (answer =='y' || answer == 'Y') {
//				setMenuPrice(input);
//				this.setPrice(getPrice()+500); //Ice�� 500�� �߰��� �������� ����
//				this.setName("���̽�" + getName()); //Hot, Ice ������ ���� �ڵ����� ���̽� ���
//				this.setType("ice"); //�߰�
//				break;
//			}
//			else if (answer =='N' || answer == 'n') {
//				setMenuPrice(input);
//				this.setType("hot"); //�߰�
//				break;
//			}
//			else {
//				System.out.println("�ٽ� �Է��ϼ���. (Y/y/N/n)");
//			}
//		}
	}
	
	public void printmenu() {
		String mkind = getKindString();
		System.out.println("kind: " + mkind + "\nname : " + this.getName() + "\nprice : " + this.getPrice() + "\ntype : " + this.getType());
		System.out.println("---------------------------------------------------------------");
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
}
