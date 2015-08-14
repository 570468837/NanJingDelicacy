package presentation;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class mouse extends MouseAdapter{
	JLabel j1,j2;
	public mouse(JLabel jb1,JLabel jb2){
		this.j1=jb1;
		this.j2=jb2;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		j1.setIcon(new ImageIcon("image//Í¼Æ¬3.png"));
		j2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 22));
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		j1.setIcon(new ImageIcon("image//Í¼Æ¬1.png"));
		j2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 18));
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		j1.setIcon(new ImageIcon("image//Í¼Æ¬1.png"));
		j2.setForeground(new Color(247,68,97));
		j2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 20));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		j1.setIcon(new ImageIcon("image//Í¼Æ¬4.png"));
		j2.setForeground(Color.blue);
		j2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 18));
	}

	

}
