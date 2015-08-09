package Test;

import Config.Config;
import presentation.MainFrame;
import presentation.Panel;
import presentation.PanelForInfo;
import presentation.PanelForTitle;

public class InfoTest {
	static MainFrame mf;
	static PanelForTitle pft;
	static Panel p;
	static PanelForInfo pfi;
	public static void main(String[] args){
		mf=new MainFrame();
		p=new Panel(mf);
		pft=new PanelForTitle(p);
		pft.setVisible(true);
		pfi = new PanelForInfo(p,Config.districts[9]);
		pfi.setVisible(true);
	}
}
