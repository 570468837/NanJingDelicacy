package presentationHelper;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LMouseAdapter extends MouseAdapter {
	private JPanel p;
	public LMouseAdapter(JPanel p) {
		this.p = p;
	}
	
	
	@Override
	public void mouseEntered(MouseEvent e) {
		enter(e);
		p.repaint();
	}
	@Override
	public void mouseExited(MouseEvent e) {
		exit(e);
		p.repaint();
	}
	
	public static void enter(MouseEvent event) {
		((JComponent)event.getSource()).setOpaque(true);
		((JComponent)event.getSource()).setBackground(L);

	}
	public static void exit(MouseEvent event) {
		((JComponent)event.getSource()).setOpaque(false);
		((JComponent)event.getSource()).setBackground(O);
	}
	
	public static final Color 
	    L = new Color(255, 255, 255, 100),
	    O = new Color(0, 0, 0, 0);
}
