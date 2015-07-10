package presentation;

import java.awt.Color;

import javax.swing.JPanel;

public class PanelForMap extends JPanel{
	public PanelForMap(MainFrame mf){
		this.setSize(800,520);
		this.setLocation(0,120);
		this.setVisible(false);
		this.setOpaque(false);
		this.setBackground(Color.BLUE);
		mf.getContentPane().add(this);
	}
}
