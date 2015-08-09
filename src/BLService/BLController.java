package BLService;

import java.io.*;
import java.util.ArrayList;

public class BLController implements BLService{

	@Override
	public ArrayList<Restaurant> getRestaurant(String district, String tastes) {
		// TODO Auto-generated method stub
		//全部口味为"All"

		BLController bl=new BLController();
		if(tastes.equals("All")){
			ArrayList<Restaurant> result1=bl.getROfOne(district, "川菜口味");
			ArrayList<Restaurant> result2=bl.getROfOne(district, "粤菜口味");
			ArrayList<Restaurant> result3=bl.getROfOne(district, "江浙口味");
			ArrayList<Restaurant> result=new ArrayList<Restaurant>();
			for(int i=0;i<result1.size();i++){
				result.add(result1.get(i));
			}
			for(int i=0;i<result2.size();i++){
				result.add(result2.get(i));
			}
			for(int i=0;i<result3.size();i++){
				result.add(result3.get(i));
			}
			
			return result;
		}else
			return bl.getROfOne(district, tastes);
	}
	
	public ArrayList<Restaurant> getROfOne(String district, String tastes){
		ArrayList<Restaurant> result=new ArrayList<Restaurant>();
		ArrayList<String> name=new ArrayList<String>();
		String fun="南京//"+district+"//"+tastes;
		File file=new File(fun+"//汇总.txt");
		try{
			BufferedReader br = new BufferedReader(new FileReader(file));
			String s = null;
			while((s = br.readLine())!=null){
				name.add(s);
			}
			br.close();  
		}catch(Exception e){
			e.printStackTrace();
		}
		
		for(int i=0;i<name.size();i++){
			Restaurant temp=new Restaurant();
			temp.setName(name.get(i));
			temp.setImgURL(fun+"//"+name.get(i)+".png");
			
			String path=fun+"//"+name.get(i)+".txt";
			path=path.replace("(", "（");
			path=path.replace(")", "）");
			File f=new File(path);
			ArrayList<String> content=new ArrayList<String>();
			try{
				BufferedReader br = new BufferedReader(new FileReader(f));
				String s = null;
				while((s = br.readLine())!=null){
					content.add(s);
				}
				br.close();  
			}catch(Exception e){
				e.printStackTrace();
			}
			
			temp.setAddress(content.get(0));
			temp.setRate(content.get(1));
			temp.setComment(content.get(2));
			result.add(temp);
		}
		return result;
	}
//	public static void main(String []args){
//		BLController bl=new BLController();
//		ArrayList<Restaurant> a=bl.getRestaurant("六合区", "川菜口味");
//		for(int i=0;i<a.size();i++)
//			System.out.println(a.get(i).getAddress()+"\t"+a.get(i).getComment()+"\t"+a.get(i).getImgURL()+"\t"+a.get(i).getName()+"\t"+a.get(i).getRate());
//	}
}
