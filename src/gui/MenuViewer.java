package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MenuViewer extends JFrame {
	
	public MenuViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("NAME");
		model.addColumn("PRICE");
		model.addColumn("TYPE");
		model.addColumn("SEASON");
		
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	

}
