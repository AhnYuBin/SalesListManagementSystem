import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
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
			case 1 : 
				System.out.print("Menu name :");
				String Add_Menu_name = input.next();
				System.out.print("Menu price :");
				int Add_Menu_price = input.nextInt();
				System.out.println("*** 등록 완료! 초기메뉴로 되돌아갑니다. ***");
				break;
			case 2 :
				System.out.print("Menu name :");
				String Delete_Menu_name = input.next();
				//추후에 입력된 메뉴들을 배열이나 리스트 등에 넣게 되면 if문을 통해 입력한 Menu_name을 가진 메뉴를 삭제하려고 합니다.//
				System.out.println("*** 삭제 완료! 초기메뉴로 되돌아갑니다. ***");
				break;
			case 3 :
				System.out.print("Menu name :");
				String Edit_Menu_name = input.next();
				System.out.print("Menu price :");
				int Edit_Menu_price = input.nextInt();
				System.out.println("*** 수정 완료! 초기메뉴로 되돌아갑니다. ***");
				break;
			case 4 :
				//추후에 배열,리스트 등에 저장된 메뉴의 이름과 가격을 출력 시켜 주려고 합니다.
				System.out.println("*** 메뉴 출력. ***");
				break;
			}
			
		}
		System.out.print("프로그램을 종료합니다.");
		input.close();
	}

}
