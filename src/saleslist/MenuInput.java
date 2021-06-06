package saleslist;

import java.util.Scanner;

public interface MenuInput {
	
	public String getName();
	
	public void setName(String name);
	
	public int getPrice();
	
	public void setPrice(int price);
	
	public String getType();
	
	public void setType(String type);
	
	public String getSeason();
	
	public void setSeason(String season);
	
	public void printmenu();
	
	public void getUserInput(Scanner input);
	
	public void setMenuPrice(Scanner input);
	
	public void setMenuName(Scanner input);
	
}
