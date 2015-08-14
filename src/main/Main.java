package main;

import presentation.MainFrame;
import presentation.Panel;
import presentation.PanelForMap;
import presentation.PanelForTitle;
import presentation.PanelForInfo;
import presentation.Audio;

public class Main {
	static MainFrame mf;
	static PanelForTitle pft;
	static PanelForMap pfm;
	static PanelForInfo pfi;
	static Panel p;
	public static void main(String[] args){
		mf=new MainFrame();
		p=new Panel(mf);
		pfm=new PanelForMap(p);
		pft=new PanelForTitle(p);
		Audio au=new Audio("sound//a.mp3");
		au.start();
	}
	
	public static void changeToInfo(String s){
		pfm.setVisible(false);
		pfi=new PanelForInfo(p,s);
		pfi.setVisible(true);
	}
	
	public static void changeToMap(){
		pfi.setVisible(false);
		pfm.setVisible(true);
	}
}
