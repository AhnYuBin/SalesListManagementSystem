package mainmenu;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SalesManager {

	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);
		SalesListManager slManager = new SalesListManager(input);
		
		selectMenu(input, slManager);
		
		System.out.print("프로그램을 종료합니다.");
		input.close();
	}
	
	public static void selectMenu(Scanner input, SalesListManager slManager) {
		int num = 0;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				
				switch(num) {
				case 1 : slManager.add_SalesList(); break;
				case 2 : slManager.delete_SalesList(); break;
				case 3 : slManager.edit_SalesList(); break;
				case 4 : slManager.view_SalesList(); break;
				case 5 : break;
				default : System.out.println("1~5의 정수를 입력해주세요. "); continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("1~5의 정수를 입력해주세요. ");
				if (input.hasNext()) {
					input.next();
				}
				num = 0;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("*** SalesList Management System Menu ***");
		System.out.println("1. Add SalesList");
		System.out.println("2. Delete SalesList");
		System.out.println("3. Edit SalesList");
		System.out.println("4. View SalesList");
		System.out.println("5. Exit");
		System.out.println("*** Select one number between 1-5 ***");
		
	}
	
}
