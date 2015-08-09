package BLService;

import java.util.ArrayList;

public interface BLService {
	/**
	 * 
	 * @param district 地区(例：鼓楼区)
	 * @param tastes 口味(例：川菜口味)
	 * @return
	 */
	public ArrayList<Restaurant> getRestaurant(String district, String tastes);
}
