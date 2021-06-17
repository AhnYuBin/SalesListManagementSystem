package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import mainmenu.SalesListManager;
import saleslist.CoffeeMenu;
import saleslist.MenuInput;
import saleslist.MenuKind;

public class SalesListAdderListener implements ActionListener {
	JTextField fieldName;
	JTextField fieldPrice;
	JTextField fieldType;
	JTextField fieldSeason;
	
	SalesListManager slManager;
	
	public SalesListAdderListener(
			JTextField fieldName,
			JTextField fieldPrice,
			JTextField fieldType,
			JTextField fieldSeason,
			SalesListManager slManager) {
		this.fieldName = fieldName;
		this.fieldPrice = fieldPrice;
		this.fieldType = fieldType;
		this.fieldSeason = fieldSeason;
		this.slManager = slManager;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(fieldName.getText());
		System.out.println(fieldPrice.getText());
		System.out.println(fieldType.getText());
		System.out.println(fieldSeason.getText());
		
		MenuInput menu = new CoffeeMenu(MenuKind.coffee);
		menu.setName(fieldName.getText());
		menu.setPrice(Integer.parseInt(fieldPrice.getText()));
		menu.setType(fieldType.getText());
		menu.setSeason(fieldSeason.getText());
		
		slManager.add_SalesList(menu);
		putObject(slManager, "slManager.ser");
		menu.printmenu();
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
