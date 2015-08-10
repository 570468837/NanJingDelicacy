package presentation;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Mouse2 extends MouseAdapter{
	JLabel j1,j2,j3,j4;
	boolean judge;
	public Mouse2(JLabel jb1,JLabel jb2,JLabel jb3,JLabel jb4){
		this.judge=true;
		this.j1=jb1;
		this.j2=jb2;
		this.j3=jb3;
		this.j4=jb4;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		j1.setIcon(new ImageIcon("Ðü¸¡2.png"));
		j2.setVisible(true);
		j3.setVisible(true);
		j4.setVisible(true);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		j1.setIcon(new ImageIcon("Ðü¸¡1.png"));
		j2.setVisible(false);
		j3.setVisible(false);
		j4.setVisible(false);
	}

	

}
