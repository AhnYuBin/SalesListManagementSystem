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
				System.out.println("*** ��� �Ϸ�! �ʱ�޴��� �ǵ��ư��ϴ�. ***");
				break;
			case 2 :
				System.out.print("Menu name :");
				String Delete_Menu_name = input.next();
				//���Ŀ� �Էµ� �޴����� �迭�̳� ����Ʈ � �ְ� �Ǹ� if���� ���� �Է��� Menu_name�� ���� �޴��� �����Ϸ��� �մϴ�.//
				System.out.println("*** ���� �Ϸ�! �ʱ�޴��� �ǵ��ư��ϴ�. ***");
				break;
			case 3 :
				System.out.print("Menu name :");
				String Edit_Menu_name = input.next();
				System.out.print("Menu price :");
				int Edit_Menu_price = input.nextInt();
				System.out.println("*** ���� �Ϸ�! �ʱ�޴��� �ǵ��ư��ϴ�. ***");
				break;
			case 4 :
				//���Ŀ� �迭,����Ʈ � ����� �޴��� �̸��� ������ ��� ���� �ַ��� �մϴ�.
				System.out.println("*** �޴� ���. ***");
				break;
			}
			
		}
		System.out.print("���α׷��� �����մϴ�.");
		input.close();
	}

}
