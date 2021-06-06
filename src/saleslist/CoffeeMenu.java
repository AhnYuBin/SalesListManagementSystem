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
//				this.setPrice(getPrice()+500); //Ice는 500원 추가된 가격으로 저장
//				this.setName("아이스" + getName()); //Hot, Ice 구별을 위해 자동으로 아이스 명시
//				this.setType("ice"); //추가
//				break;
//			}
//			else if (answer =='N' || answer == 'n') {
//				setMenuPrice(input);
//				this.setType("hot"); //추가
//				break;
//			}
//			else {
//				System.out.println("다시 입력하세요. (Y/y/N/n)");
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
