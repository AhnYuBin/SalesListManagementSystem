import java.util.Scanner;

public class SalesManager {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		SalesListManager mlManager = new SalesListManager(input);
		
		int num = 0;
		while (num != 5) {
			System.out.println("*** SalesList Management System Menu ***");
			System.out.println("1. Add SalesList");
			System.out.println("2. Delete SalesList");
			System.out.println("3. Edit SalesList");
			System.out.println("4. View SalesList");
			System.out.println("5. Exit");
			System.out.println("*** Select one number between 1-5 ***");
			
			num = input.nextInt();
			
			switch(num) {
			case 1 : mlManager.add_SalesList(); break;
			case 2 : mlManager.delete_SalesList(); break;
			case 3 : mlManager.edit_SalesList(); break;
			case 4 : mlManager.view_SalesList(); break;
			}
		}
		System.out.print("프로그램을 종료합니다.");
		input.close();
	}
	
}
