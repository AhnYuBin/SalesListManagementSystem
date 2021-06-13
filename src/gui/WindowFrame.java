package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import mainmenu.SalesListManager;

public class WindowFrame extends JFrame {
	
	SalesListManager slManager;
	
	MenuSelection menuSelection;
	SalesListAdder menuAdder;
	SalesListViewer menuViewer;

	public WindowFrame(SalesListManager slManager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("SalesManagementSystem");
		
		this.slManager = slManager;
		this.menuSelection = new MenuSelection(this);
		this.menuAdder = new SalesListAdder(this, this.slManager);
		this.menuViewer = new SalesListViewer(this, this.slManager);
		
		
		this.setupPanel(menuSelection);
		
		this.setVisible(true);
		
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuSelection() {
		return menuSelection;
	}

	public void setMenuSelection(MenuSelection menuSelection) {
		this.menuSelection = menuSelection;
	}

	public SalesListAdder getMenuAdder() {
		return menuAdder;
	}

	public void setMenuAdder(SalesListAdder menuAdder) {
		this.menuAdder = menuAdder;
	}

	public SalesListViewer getMenuViewer() {
		return menuViewer;
	}

	public void setMenuViewer(SalesListViewer menuViewer) {
		this.menuViewer = menuViewer;
	}

}
