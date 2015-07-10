package presentation;

import java.awt.Color;

import javax.swing.*;

public class PanelForInfo extends JPanel{
	public PanelForInfo(Panel p){
		this.setSize(800,520);
		this.setLocation(0,120);
		this.setVisible(false);
		this.setOpaque(true);
		this.setBackground(Color.LIGHT_GRAY);
		p.add(this);
	}
}
