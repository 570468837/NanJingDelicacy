package presentation;

import java.awt.Color;

import javax.swing.*;

public class PanelForInfo extends JPanel{
	public PanelForInfo(MainFrame mf){
		this.setSize(800,520);
		this.setLocation(0,120);
		this.setVisible(false);
		this.setOpaque(false);
		this.setBackground(Color.pink);
		mf.getContentPane().add(this);
	}
}
