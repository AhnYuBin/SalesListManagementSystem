import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		while (num != 5) {
			printmenu();
			
			num = input.nextInt();
			
			switch(num) {
			case 1 : add_SalesList(); break;
			case 2 : delete_SalesList(); break;
			case 3 : edit_SalesList(); break;
			case 4 : view_SalesList(); break;
			}

		}
		System.out.print("프로그램을 종료합니다.");
		input.close();
	}
	static public void printmenu() {
		System.out.println("*** SalesList Management System Menu ***");
		System.out.println("1. Add SalesList");
		System.out.println("2. Delete SalesList");
		System.out.println("3. Edit SalesList");
		System.out.println("4. View SalesList");
		System.out.println("5. Exit");
		System.out.println("*** Select one number between 1-5 ***");
	}
	
	static public void add_SalesList() {
		Scanner input = new Scanner(System.in);
		System.out.print("Menu name :");
		String Add_Menu_name = input.next();
		System.out.print("Menu price :");
		int Add_Menu_price = input.nextInt();
		System.out.println("*** 등록 완료! 초기메뉴로 되돌아갑니다. ***");
	}
	
	static public void delete_SalesList() {
		Scanner input = new Scanner(System.in);
		System.out.print("Menu name :");
		String Delete_Menu_name = input.next();
		System.out.println("*** 삭제 완료! 초기메뉴로 되돌아갑니다. ***");
	}
	
	static public void edit_SalesList() {
		Scanner input = new Scanner(System.in);
		System.out.print("Menu name :");
		String Edit_Menu_name = input.next();
		System.out.print("Menu price :");
		int Edit_Menu_price = input.nextInt();
		System.out.println("*** 수정 완료! 초기메뉴로 되돌아갑니다. ***");
	}
	
	static public void view_SalesList() {
		System.out.println("*** 메뉴 출력. ***");
	}


}
