package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.SalesListAdder;
import gui.SalesListViewer;
import gui.WindowFrame;

public class SalesListAdderCancelListener implements ActionListener {
	
	WindowFrame frame;

	public SalesListAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
		
	}

	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuSelection());
		frame.revalidate();
		frame.repaint();
	}

}
