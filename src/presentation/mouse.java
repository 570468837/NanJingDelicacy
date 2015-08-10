package presentation;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class mouse implements MouseListener{
	JLabel jj;
	public mouse(JLabel jb){
		this.jj=jb;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		jj.setIcon(new ImageIcon("ͼƬ3.png"));
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		jj.setIcon(new ImageIcon("ͼƬ1.png"));
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		jj.setIcon(new ImageIcon("ͼƬ1.png"));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		jj.setIcon(new ImageIcon("ͼƬ4.png"));
	}

	

}
