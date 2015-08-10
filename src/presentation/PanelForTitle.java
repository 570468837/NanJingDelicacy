package presentation;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;

public class PanelForTitle extends JPanel{
	JLabel titleLabel;
	
	public PanelForTitle(Panel p){
		this.setSize(800,120);
		this.setLocation(0,0);
		this.setVisible(true);
		this.setOpaque(false);
		this.setLayout(null);

		titleLabel = new JLabel("南  京  美  食",JLabel.CENTER);
		titleLabel.setLocation(0,0);
		titleLabel.setSize(800,120);
		titleLabel.setVisible(true);
		titleLabel.setForeground(Color.magenta);
		titleLabel.setFont(new Font("楷体", Font.PLAIN, 80));
		this.add(titleLabel);
		
		this.repaint();
		p.add(this);
		p.repaint();
	}

//	public void paintComponent(Graphics g) {
//		Image icon = new ImageIcon("c.jpg").getImage();
//		g.drawImage(icon,0,0,this);
//	}
	
	
}
