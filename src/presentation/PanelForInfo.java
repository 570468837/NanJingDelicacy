package presentation;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

import javax.swing.*;

import presentationHelper.*;

public class PanelForInfo extends JPanel{
	JLabel backLabel;
	JLabel tasteLabel;
	JLabel remindLabel;
	JComboBox tastes;
	
	public PanelForInfo(Panel p, String district){
		this.setSize(800,520);
		this.setLocation(0,120);
		this.setVisible(false);
		this.setOpaque(false);
		this.setLayout(null);
		this.setBackground(Color.LIGHT_GRAY);
		
		backLabel = new JLabel("返回",JLabel.CENTER);
		backLabel.setLocation(30,20);
		backLabel.setSize(100,61);
		backLabel.setVisible(true);
		backLabel.setForeground(Color.WHITE);
		backLabel.setFont(new Font("宋体", Font.PLAIN, 20));
		this.add(backLabel);
		
		tasteLabel = new JLabel("口味： ",JLabel.CENTER);
		tasteLabel.setLocation(270,20);
		tasteLabel.setSize(100,61);
		tasteLabel.setVisible(true);
		tasteLabel.setForeground(Color.WHITE);
		tasteLabel.setFont(new Font("宋体", Font.PLAIN, 20));
		this.add(tasteLabel);
		
		remindLabel = new JLabel("您已选择："+district,JLabel.CENTER);
		remindLabel.setLocation(550,20);
		remindLabel.setSize(200,61);
		remindLabel.setVisible(true);
		remindLabel.setForeground(Color.WHITE);
		remindLabel.setFont(new Font("宋体", Font.PLAIN, 20));
		this.add(remindLabel);
		
		tastes = new JComboBox<String>(Config.Config.tastes);
		tastes.setFont(new Font("宋体", Font.PLAIN, 16));
		tastes.setLocation(350,35);
		tastes.setSize(125,30);
		tastes.setVisible(true);
		this.add(tastes);
		
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
