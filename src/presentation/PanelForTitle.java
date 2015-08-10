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
		this.setOpaque(true);
		this.setBackground(Color.blue);
		p.add(this);
		
		titleLabel = new JLabel("��  ��  ��  ʳ",JLabel.CENTER);
		titleLabel.setLocation(270,100);
		titleLabel.setSize(100,61);
		titleLabel.setVisible(true);
		titleLabel.setForeground(Color.ORANGE);
		titleLabel.setFont(new Font("����", Font.PLAIN, 80));
		this.add(titleLabel);
	}
	
	public void paintComponent(Graphics g) {
		Image icon = new ImageIcon("c.jpg").getImage();
		g.drawImage(icon,0,0,this);
	}
	
	
}
