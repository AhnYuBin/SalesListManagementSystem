package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import mainmenu.SalesListManager;
import saleslist.MenuInput;

public class SalesListViewer extends JPanel {
	
	WindowFrame frame;
	
	SalesListManager slManager;
	
	public SalesListViewer(WindowFrame frame, SalesListManager slManager) {
		this.frame = frame;
		this.slManager = slManager;
		
		System.out.println("***" + slManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("NAME");
		model.addColumn("PRICE");
		model.addColumn("TYPE");
		model.addColumn("SEASON");
		
		for (int i=0; i<slManager.size(); i++) {
			Vector row = new Vector();
			MenuInput mi = slManager.get(i);
			row.add(mi.getName());
			row.add(mi.getPrice());
			row.add(mi.getType());
			row.add(mi.getSeason());
			model.addRow(row);
		}
		
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
	
}
