package presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

import main.Main;
import BLService.BLController;
import BLService.BLService;
import BLService.Restaurant;
import Config.Config;
import presentationHelper.*;

public class PanelForInfo extends JPanel implements ItemListener{
	JLabel backLabel;
	JLabel tasteLabel;
	JLabel remindLabel;
	JComboBox tastes;
	JScrollPane jsp;
	JTable table;
	String district;
	BLService bl = new BLController();
	
	public PanelForInfo(Panel p, String district){
		this.district = district;
		
		this.setSize(800,520);
		this.setLocation(0,120);
		this.setVisible(false);
		this.setOpaque(false);
		this.setLayout(null);
		this.setBackground(Color.LIGHT_GRAY);
		
		backLabel = new JLabel("返回",JLabel.CENTER);
		backLabel.setLocation(30,20);
		backLabel.setSize(100,55);
		backLabel.setVisible(true);
		backLabel.setForeground(Color.WHITE);
		backLabel.setFont(new Font("楷体", Font.PLAIN, 20));
		this.add(backLabel);
		
		tasteLabel = new JLabel("口味：",JLabel.CENTER);
		tasteLabel.setLocation(270,18);
		tasteLabel.setSize(100,61);
		tasteLabel.setVisible(true);
		tasteLabel.setForeground(Color.WHITE);
		tasteLabel.setFont(new Font("楷体", Font.PLAIN, 20));
		this.add(tasteLabel);
		
		remindLabel = new JLabel("您已选择："+district,JLabel.CENTER);
		remindLabel.setLocation(550,20);
		remindLabel.setSize(200,58);
		remindLabel.setVisible(true);
		remindLabel.setForeground(Color.WHITE);
		remindLabel.setFont(new Font("楷体", Font.PLAIN, 20));
		this.add(remindLabel);
		
		tastes = new JComboBox<String>(Config.tastes);
		tastes.setFont(new Font("楷体", Font.PLAIN, 15));
		tastes.setLocation(350,34);
		tastes.setSize(100,30);
		tastes.setVisible(true);
		tastes.addItemListener(this);
		this.add(tastes);
		
		//下面两段是refreshTable的方法
		table = new JTable(new MyTableModel(bl.getRestaurant(district, getTaste())));
		beautifyTable(table);

		jsp = new JScrollPane(table);
		jsp.setLocation(25,80);
		jsp.setSize(750,400);
		jsp.setVisible(true);
		jsp.setAutoscrolls(true);
		jsp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jsp.repaint();
		this.add(jsp);
		
		this.repaint();
		p.add(this);
		p.repaint();
		
		backLabel.addMouseListener(new LMouseAdapter(p) {
			public void mouseClicked(MouseEvent e) {
				//跳转
				Main.changeToMap();
			}

		});
	}
	/**
	 * 美化表格
	 * @param 表格
	 */
	public void beautifyTable(JTable table){
		DefaultTableCellRenderer r = new DefaultTableCellRenderer();   
		r.setHorizontalAlignment(JLabel.CENTER); 
		
//		table.setDefaultRenderer(Object.class,r); //居中
//		table.setDefaultRenderer(Object.class, new TableCellTextAreaRenderer());
		
		table.setFont(new Font("宋体", Font.PLAIN, 12));
		
		table.setRowHeight(Config.rowHeight);
		for(int i=0;i<table.getColumnCount();i++){  //固定列宽
			TableColumn firsetColumn = table.getColumnModel().getColumn(i); 
			firsetColumn.setPreferredWidth(Config.colummWidth[i]); 
			firsetColumn.setMaxWidth(Config.colummWidth[i]); 
			firsetColumn.setMinWidth(Config.colummWidth[i]);
		}
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //列宽不随容器变化
		
		table.setSelectionBackground(new Color(255,245,240));  //被选择行的颜色
	}
	/**
	 * 刷新表格
	 */
	public void refreshTable(){
		jsp.removeAll();
		jsp.setVisible(false);
		
		table = new JTable(new MyTableModel(bl.getRestaurant(district, getTaste())));
		beautifyTable(table);
		
		jsp = new JScrollPane(table);
		jsp.setLocation(25,80);
		jsp.setSize(750,400);
		jsp.setVisible(true);
		jsp.setAutoscrolls(true);
		jsp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jsp.repaint();
		this.add(jsp);
		
	}
	
	public String getTaste(){
		if(tastes.getSelectedItem().toString().equals("所有口味"))
			return "All";
		return tastes.getSelectedItem().toString();
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.tastes && e.getStateChange() == ItemEvent.SELECTED)
			refreshTable();
	}
	
	
	
	class MyTableModel implements TableModel{
		ArrayList<Restaurant> restaurants ;
		public MyTableModel(ArrayList<Restaurant> r){
			restaurants = r;
		}
		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return restaurants.size();
		}
			
		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return 5;
		}

		@Override
		public String getColumnName(int columnIndex) {
			// TODO Auto-generated method stub
			return Config.columName[columnIndex];
		}

		@Override
		public Class<?> getColumnClass(int columnIndex) {
			// TODO Auto-generated method stub
			if(columnIndex == 0)
				return ImageIcon.class;
			else
				return Object.class;
		}

		@Override
		public boolean isCellEditable(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub
				Restaurant tmpR = restaurants.get(rowIndex);
			switch(columnIndex){
			case 0:
				String path = tmpR.getImgURL();
				path=path.replace("(", "（");
				path=path.replace(")", "）");
				ImageIcon img = new ImageIcon(path);
//				System.out.println(tmpR.getImgURL());
				img.setImage(img.getImage().getScaledInstance(Config.restaurantPicture, 
						Config.restaurantPicture, Image.SCALE_DEFAULT));
				return img;
			case 1:
				return tmpR.getName();
			case 2:
				return tmpR.getAddress();
			case 3:
				return tmpR.getRate();
			case 4:
				return tmpR.getComment();
				}
			return null;
		}
			

		@Override
		public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void addTableModelListener(TableModelListener l) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void removeTableModelListener(TableModelListener l) {
			// TODO Auto-generated method stub
			
		}
		
	}

	
}