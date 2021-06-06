package mainmenu;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class SalesManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SalesListManager slManager = getObject("slManager.ser");

		if (slManager == null) {
			slManager = new SalesListManager(input);
		}
		
		
		WindowFrame frame = new WindowFrame(slManager);
		selectMenu(input, slManager);
		
		putObject(slManager, "slManager.ser");
		
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
				case 1 : 
					slManager.add_SalesList();
					logger.log("add a menu");
					break;
				case 2 : 
					slManager.delete_SalesList(); 
					logger.log("delete a menu");
					break;
				case 3 : 
					slManager.edit_SalesList();
					logger.log("edit a menu");
					break;
				case 4 : 
					slManager.view_SalesList(); 
					logger.log("view a list of menu");
					break;
				case 5 : 
					logger.log("Exit");
					break;
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
	
	public static SalesListManager getObject(String filename) {
		SalesListManager slManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			slManager = (SalesListManager) in.readObject();
			
			in.close();
			file.close();	
		} catch (FileNotFoundException e) {
			return slManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return slManager;
	}
	
	public static void putObject(SalesListManager slManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(slManager);
			
			out.close();
			file.close();	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
