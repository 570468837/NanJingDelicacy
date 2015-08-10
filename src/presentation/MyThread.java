package presentation;

import java.awt.Color;

import javax.swing.*;

public class MyThread extends Thread {  
	JLabel jj;
	public MyThread(JLabel jj){
		this.jj=jj;
	}
    public void run() {  
        while (true) {  
            try {  
                new Thread().sleep(500);  
                jj.setForeground(Color.green);
                new Thread().sleep(500);  
                jj.setForeground(Color.magenta);
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
}  