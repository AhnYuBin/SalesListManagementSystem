package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MenuAdder extends JFrame{
	
	public MenuAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelName = new JLabel("NAME : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelPrice = new JLabel("PRICE : ", JLabel.TRAILING);
		JTextField fieldPrice = new JTextField(10);
		labelName.setLabelFor(fieldPrice);
		panel.add(labelPrice);
		panel.add(fieldPrice);

		JLabel labelType = new JLabel("TYPE : ", JLabel.TRAILING);
		JTextField fieldType = new JTextField(10);
		labelName.setLabelFor(fieldType);
		panel.add(labelType);
		panel.add(fieldType);
		
		JLabel labelSeason = new JLabel("SEASON : ", JLabel.TRAILING);
		JTextField fieldSeason = new JTextField(10);
		labelName.setLabelFor(fieldSeason);
		panel.add(labelSeason);
		panel.add(fieldSeason);
		
		panel.add(new JButton("SAVE"));
		panel.add(new JButton("CANCEL"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(panel);
		this.setVisible(true);
	}

}
