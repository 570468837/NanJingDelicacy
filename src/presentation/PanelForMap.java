package presentation;

import java.awt.*;

import javax.swing.*;

public class PanelForMap extends JPanel{
	JLabel NanJingMap;
	JLabel buttonleft1;
	JLabel buttonleft2;
	JLabel buttonleft3;
	JLabel buttonleft4;
	JLabel buttonleft5;
	JLabel buttonright1;
	JLabel buttonright2;
	JLabel buttonright3;
	JLabel buttonright4;
	JLabel buttonright5;
	JLabel left1;
	JLabel left2;
	JLabel left3;
	JLabel left4;
	JLabel left5;
	JLabel right1;
	JLabel right2;
	JLabel right3;
	JLabel right4;
	JLabel right5;
	public PanelForMap(Panel p){
		this.setSize(800,520);
		this.setLocation(0,120);
		this.setVisible(true);
		this.setOpaque(false);
		this.setLayout(null);
		
		NanJingMap = new JLabel();
		NanJingMap.setIcon(new ImageIcon("南京1.png"));
		NanJingMap.setVisible(true);
		NanJingMap.setLocation(190,20);
		NanJingMap.setSize(460,600);
		this.add(NanJingMap);
		
		left1=new JLabel("下 关 区  ",JLabel.CENTER);
		left1.setBorder(null);
		left1.setLocation(60,70);
		left1.setSize(130,40);
		left1.setOpaque(false);
		left1.setForeground(Color.blue);
		left1.setFont(new Font("楷体", Font.BOLD, 18));
		this.add(left1);
		
		buttonleft1=new JLabel();
		buttonleft1.setIcon(new ImageIcon("图片4.png"));
		buttonleft1.setOpaque(false);
		buttonleft1.addMouseListener(new Mouse(buttonleft1,left1));
		buttonleft1.setLocation(60,70);
		buttonleft1.setSize(130,40);
		this.add(buttonleft1);
		
		left2=new JLabel("鼓 楼 区  ",JLabel.CENTER);
		left2.setBorder(null);
		left2.setLocation(60,150);
		left2.setSize(130,40);
		left2.setOpaque(false);
		left2.setForeground(Color.blue);
		left2.setFont(new Font("楷体", Font.BOLD, 18));
		this.add(left2);
		
		buttonleft2=new JLabel();
		buttonleft2.setIcon(new ImageIcon("图片4.png"));
		buttonleft2.setOpaque(false);
		buttonleft2.addMouseListener(new Mouse(buttonleft2,left2));
		buttonleft2.setLocation(60,150);
		buttonleft2.setSize(130,40);
		this.add(buttonleft2);
		
		left3=new JLabel("浦 口 区  ",JLabel.CENTER);
		left3.setBorder(null);
		left3.setLocation(60,230);
		left3.setSize(130,40);
		left3.setOpaque(false);
		left3.setForeground(Color.blue);
		left3.setFont(new Font("楷体", Font.BOLD, 18));
		this.add(left3);
		
		buttonleft3=new JLabel();
		buttonleft3.setIcon(new ImageIcon("图片4.png"));
		buttonleft3.setOpaque(false);
		buttonleft3.addMouseListener(new Mouse(buttonleft3,left3));
		buttonleft3.setLocation(60,230);
		buttonleft3.setSize(130,40);
		this.add(buttonleft3);
		
		left4=new JLabel("雨花台区  ",JLabel.CENTER);
		left4.setBorder(null);
		left4.setLocation(60,305);
		left4.setSize(130,40);
		left4.setOpaque(false);
		left4.setForeground(Color.BLUE);
		left4.setFont(new Font("楷体", Font.BOLD, 18));
		this.add(left4);
		
		buttonleft4=new JLabel();
		buttonleft4.setIcon(new ImageIcon("图片4.png"));
		buttonleft4.setOpaque(false);
		buttonleft4.addMouseListener(new Mouse(buttonleft4,left4));
		buttonleft4.setLocation(60,305);
		buttonleft4.setSize(130,40);
		this.add(buttonleft4);
		
		left5=new JLabel("建 邺 区  ",JLabel.CENTER);
		left5.setBorder(null);
		left5.setLocation(60,380);
		left5.setSize(130,40);
		left5.setOpaque(false);
		left5.setForeground(Color.blue);
		left5.setFont(new Font("楷体", Font.BOLD, 18));
		this.add(left5);
		
		buttonleft5=new JLabel();
		buttonleft5.setIcon(new ImageIcon("图片4.png"));
		buttonleft5.setOpaque(false);
		buttonleft5.addMouseListener(new Mouse(buttonleft5,left5));
		buttonleft5.setLocation(60,380);
		buttonleft5.setSize(130,40);
		this.add(buttonleft5);
		
		right1=new JLabel("六 合 区  ",JLabel.CENTER);
		right1.setBorder(null);
		right1.setLocation(600, 70);
		right1.setSize(130,40);
		right1.setOpaque(false);
		right1.setForeground(Color.blue);
		right1.setFont(new Font("楷体", Font.BOLD, 18));
		this.add(right1);
		
		buttonright1=new JLabel();
		buttonright1.setIcon(new ImageIcon("图片4.png"));
		buttonright1.setOpaque(false);
		buttonright1.addMouseListener(new Mouse(buttonright1,right1));
		buttonright1.setLocation(600, 70);
		buttonright1.setSize(130,40);
		this.add(buttonright1);
		
		right2=new JLabel("玄 武 区  ",JLabel.CENTER);
		right2.setBorder(null);
		right2.setLocation(600, 150);
		right2.setSize(130,40);
		right2.setOpaque(false);
		right2.setForeground(Color.blue);
		right2.setFont(new Font("楷体", Font.BOLD, 18));
		this.add(right2);
		
		buttonright2=new JLabel();
		buttonright2.setIcon(new ImageIcon("图片4.png"));
		buttonright2.setOpaque(false);
		buttonright2.addMouseListener(new Mouse(buttonright2,right2));
		buttonright2.setLocation(600, 150);
		buttonright2.setSize(130,40);
		this.add(buttonright2);
		
		right3=new JLabel("栖 霞 区  ",JLabel.CENTER);
		right3.setBorder(null);
		right3.setLocation(600, 230);
		right3.setSize(130,40);
		right3.setOpaque(false);
		right3.setForeground(Color.blue);
		right3.setFont(new Font("楷体", Font.BOLD, 18));
		this.add(right3);
		
		buttonright3=new JLabel();
		buttonright3.setIcon(new ImageIcon("图片4.png"));
		buttonright3.setOpaque(false);
		buttonright3.addMouseListener(new Mouse(buttonright3,right3));
		buttonright3.setLocation(600, 230);
		buttonright3.setSize(130,40);
		this.add(buttonright3);
		
		right4=new JLabel("秦 淮 区  ",JLabel.CENTER);
		right4.setBorder(null);
		right4.setLocation(600, 305);
		right4.setSize(130,40);
		right4.setOpaque(false);
		right4.setForeground(Color.blue);
		right4.setFont(new Font("楷体", Font.BOLD, 18));
		this.add(right4);
		
		buttonright4=new JLabel();
		buttonright4.setIcon(new ImageIcon("图片4.png"));
		buttonright4.setOpaque(false);
		buttonright4.addMouseListener(new Mouse(buttonright4,right4));
		buttonright4.setLocation(600, 305);
		buttonright4.setSize(130,40);
		this.add(buttonright4);
		
		right5=new JLabel("江 宁 区  ",JLabel.CENTER);
		right5.setBorder(null);
		right5.setLocation(600, 380);
		right5.setSize(130,40);
		right5.setOpaque(false);
		right5.setForeground(Color.blue);
		right5.setFont(new Font("楷体", Font.BOLD, 18));
		this.add(right5);
		
		buttonright5=new JLabel();
		buttonright5.setIcon(new ImageIcon("图片4.png"));
		buttonright5.setOpaque(false);
		buttonright5.addMouseListener(new Mouse(buttonright5,right5));
		buttonright5.setLocation(600, 380);
		buttonright5.setSize(130,40);
		this.add(buttonright5);

		this.repaint();
		p.add(this);
		p.repaint();
	}
}
