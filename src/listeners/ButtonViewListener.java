package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.SalesListViewer;
import gui.WindowFrame;
import mainmenu.SalesListManager;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
		
	}

	public void actionPerformed(ActionEvent e) {
		SalesListViewer saleslistViewer = frame.getSaleslistViewer();
		SalesListManager slManager = getObject("slManager.ser");
		saleslistViewer.setSlManager(slManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(saleslistViewer);
		frame.revalidate();
		frame.repaint();
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

}
