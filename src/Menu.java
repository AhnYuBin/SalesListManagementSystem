
public class Menu {
	String name;
	int price;
	static int numMenu = 0;
	
	public Menu() {
		numMenu++;
		
	}
	
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
		numMenu++;
	}
	
	public void printmenu() {
		System.out.println("name : " + name + "\nprice : " + price);
	}
}
