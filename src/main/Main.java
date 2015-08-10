package main;

import presentation.MainFrame;
import presentation.Panel;
import presentation.PanelForMap;
import presentation.PanelForTitle;
import presentation.PanelForInfo;

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
	}
	
	public static void changeToInfo(String s){
		pfm.setVisible(false);
		pfi=new PanelForInfo(p,s);
		pfi.setVisible(true);
	}
}
