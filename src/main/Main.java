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
		pft=new PanelForTitle(p);
		pfm=new PanelForMap(p);
	}
	
	public void change(){
		
	}
}
