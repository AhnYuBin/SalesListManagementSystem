package saleslist;

import java.util.Scanner;

public interface MenuInput {
	
	public String getName();
	
	public void setName(String name);
	
	public int getPrice();
	
	public void setPrice(int price);
	
	public char getType();
	
	public void setType(char type);
	
	public String getSeason();
	
	public void setSeason(String season);
	
	public void printmenu();
	
	public void setMenuPrice(Scanner input);
	
	public void setMenuName(Scanner input);

	public MenuKind getKind();
	
	public void getUserInput(Scanner input);
	
	public void setKind(MenuKind kind);
	
	public void setMenuTypeYN(Scanner input);
	
	public void setMenuSeaonYN(Scanner input);
	
	
}
