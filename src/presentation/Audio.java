package presentation;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Audio extends Thread{
    private String filename;
    private Player player;
	public Audio(String filename) {
        this.filename = filename;
    }
 
    public void run() {
        try {
            BufferedInputStream buffer = new BufferedInputStream(
                    new FileInputStream(filename));
            player = new Player(buffer);
            while(true)
            	player.play();
        } catch (Exception e) {
            System.out.println(e);
        }
 
    }
}
