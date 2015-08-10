package presentation;

import java.awt.*;

import javax.swing.*;

public class PanelForMap extends JPanel{
	JLabel NanJingMap;
	JButton left1;
	JButton left2;
	JButton left3;
	JButton left4;
	JButton left5;
	JButton right1;
	JButton right2;
	JButton right3;
	JButton right4;
	JButton right5;
	public PanelForMap(Panel p){
		this.setSize(800,520);
		this.setLocation(0,120);
		this.setVisible(true);
		this.setOpaque(true);
		this.setLayout(null);
		p.add(this);
		
		NanJingMap = new JLabel();
		NanJingMap.setIcon(new ImageIcon("南京地图.png"));
		NanJingMap.setVisible(true);
		NanJingMap.setLocation(190,20);
		NanJingMap.setSize(460,600);
		this.add(NanJingMap);
		
		left1=new JButton("下 关 区");
		left1.setBounds(60, 70, 100, 40);
		left1.setVisible(true);
		left1.setForeground(Color.BLUE);
		left1.setFont(new Font("楷体", Font.PLAIN, 15));
		this.add(left1);
		
		left2=new JButton("鼓 楼 区");
		left2.setBounds(60, 150, 100, 40);
		left2.setVisible(true);
		left2.setForeground(Color.BLUE);
		left2.setFont(new Font("楷体", Font.PLAIN, 15));
		this.add(left2);
		
		left3=new JButton("浦 口 区");
		left3.setBounds(60, 230, 100, 40);
		left3.setVisible(true);
		left3.setForeground(Color.BLUE);
		left3.setFont(new Font("楷体", Font.PLAIN, 15));
		this.add(left3);
		
		left4=new JButton("雨花台区");
		left4.setBounds(60, 305, 100, 40);
		left4.setVisible(true);
		left4.setForeground(Color.BLUE);
		left4.setFont(new Font("楷体", Font.PLAIN, 15));
		this.add(left4);
		
		left5=new JButton("建 邺 区");
		left5.setBounds(60, 380, 100, 40);
		left5.setVisible(true);
		left5.setForeground(Color.BLUE);
		left5.setFont(new Font("楷体", Font.PLAIN, 15));
		this.add(left5);
		
		right1=new JButton("六 合 区");
		right1.setBounds(620, 70, 100, 40);
		right1.setVisible(true);
		right1.setForeground(Color.BLUE);
		right1.setFont(new Font("楷体", Font.PLAIN, 15));
		this.add(right1);
		
		right2=new JButton("玄 武 区");
		right2.setBounds(620, 150, 100, 40);
		right2.setVisible(true);
		right2.setForeground(Color.BLUE);
		right2.setFont(new Font("楷体", Font.PLAIN, 15));
		this.add(right2);
		
		right3=new JButton("栖 霞 区");
		right3.setBounds(620, 230, 100, 40);
		right3.setVisible(true);
		right3.setForeground(Color.BLUE);
		right3.setFont(new Font("楷体", Font.PLAIN, 15));
		this.add(right3);
		
		right4=new JButton("秦 淮 区");
		right4.setBounds(620, 305, 100, 40);
		right4.setVisible(true);
		right4.setForeground(Color.BLUE);
		right4.setFont(new Font("楷体", Font.PLAIN, 15));
		this.add(right4);
		
		right5=new JButton("江 宁区");
		right5.setBounds(620, 380, 100, 40);
		right5.setVisible(true);
		right5.setForeground(Color.BLUE);
		right5.setFont(new Font("楷体", Font.PLAIN, 15));
		this.add(right5);
	}
}
