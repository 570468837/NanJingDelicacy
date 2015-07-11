package presentation;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

import javax.swing.*;

import presentationHelper.*;

public class PanelForInfo extends JPanel{
	public PanelForInfo(Panel p, String district){
		this.setSize(800,520);
		this.setLocation(0,120);
		this.setVisible(false);
		this.setOpaque(false);
		this.setLayout(null);
		this.setBackground(Color.LIGHT_GRAY);
		
		JLabel backLabel = new JLabel("返回",JLabel.CENTER);
		backLabel.setLocation(30,20);
		backLabel.setSize(100,61);
		backLabel.setVisible(true);
		backLabel.setForeground(Color.WHITE);
		backLabel.setFont(new Font("宋体", Font.PLAIN, 20));
		this.add(backLabel);
		
		JLabel remindLabel = new JLabel("您已选择："+district,JLabel.CENTER);
		remindLabel.setLocation(550,20);
		remindLabel.setSize(200,61);
		remindLabel.setVisible(true);
		remindLabel.setForeground(Color.WHITE);
		remindLabel.setFont(new Font("宋体", Font.PLAIN, 20));
		this.add(remindLabel);
		
		
		
		this.repaint();
		p.add(this);
		p.repaint();
		
		backLabel.addMouseListener(new LMouseAdapter(p) {
			
			public void mouseClicked(MouseEvent e) {
				//跳转
			}

		});
	}
	
	
}
