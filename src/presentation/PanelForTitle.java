package presentation;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;

public class PanelForTitle extends JPanel{
	JLabel titleLabel;
	JLabel fly1;
	JLabel fly2;
	JLabel fly3;
	JLabel fly4;
	
	public PanelForTitle(Panel p){
		this.setSize(800,120);
		this.setLocation(0,0);
		this.setVisible(true);
		this.setOpaque(false);
		this.setLayout(null);

		titleLabel = new JLabel("南  京  美  食",JLabel.CENTER);
		titleLabel.setLocation(40,0);
		titleLabel.setSize(600,120);
		titleLabel.setVisible(true);
		titleLabel.setForeground(Color.magenta);
		titleLabel.setFont(new Font("楷体", Font.PLAIN, 80));
		this.add(titleLabel);
		
		MyThread mt=new MyThread(titleLabel);
		mt.start();
		
		fly3 = new JLabel("南京大学2015暑期实践",JLabel.CENTER);
		fly3.setLocation(620,30);
		fly3.setOpaque(false);
		fly3.setSize(180,45);
		fly3.setVisible(false);
		fly3.setForeground(Color.blue);
		fly3.setFont(new Font("楷体", Font.BOLD, 15));
		this.add(fly3);
		
		fly4 = new JLabel("制作团队：食话秦淮",JLabel.CENTER);
		fly4.setLocation(620,70);
		fly4.setOpaque(false);
		fly4.setSize(180,45);
		fly4.setVisible(false);
		fly4.setForeground(Color.blue);
		fly4.setFont(new Font("楷体", Font.BOLD, 15));
		this.add(fly4);
		
		fly1=new JLabel();
		fly1.setIcon(new ImageIcon("悬浮3.png"));
		fly1.setOpaque(false);
		fly1.setVisible(false);
		fly1.setLocation(620, 30);
		fly1.setSize(180,90);
		this.add(fly1);
		
		fly2=new JLabel();
		fly2.setIcon(new ImageIcon("悬浮1.png"));
		fly2.setOpaque(false);
		fly2.addMouseListener(new Mouse2(fly2,fly1,fly3,fly4));
		fly2.setLocation(720, 0);
		fly2.setSize(23,30);
		this.add(fly2);
		
		this.repaint();
		p.add(this);
		p.repaint();
	}

//	public void paintComponent(Graphics g) {
//		Image icon = new ImageIcon("c.jpg").getImage();
//		g.drawImage(icon,0,0,this);
//	}
	
	
}
