package presentation;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;

public class MainFrame extends JFrame{
//	public static void main(String[] args){
//		new MainFrame();
//	}
	public MainFrame(){
		this.setSize(800,640);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.getContentPane().setLayout(null);
		this.setResizable(false);
	}
}
