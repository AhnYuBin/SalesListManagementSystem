package saleslist;

import java.util.Scanner;

public interface MenuInput {
	
	public String getName();
	
	public void setName(String name);
	
	public void setPrice(int price);
	
	public void printmenu();
	
	public void getUserInput(Scanner input);
	
}
