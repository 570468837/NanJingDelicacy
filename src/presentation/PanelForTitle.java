package presentation;

import java.awt.Color;

import javax.swing.*;

public class PanelForTitle extends JPanel{
	public PanelForTitle(Panel p){
		this.setSize(800,120);
		this.setLocation(0,0);
		this.setVisible(true);
		this.setOpaque(true);
		this.setBackground(Color.BLACK);
		p.add(this);
	}
}
