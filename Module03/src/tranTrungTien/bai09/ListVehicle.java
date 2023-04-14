package tranTrungTien.bai09;

import java.util.ArrayList;
import java.util.List;

public class ListVehicle {
	List<Vehicle> list;

	public ListVehicle() {
		this.list = new ArrayList<>();
	}

	public boolean addVehicle(Vehicle v) {
		return list.add(v);
	}

	public boolean delVehicle(String name) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equalsIgnoreCase(name)) {
				list.remove(i);
				return true;
			}
		}
		return false;
	}

	public boolean updatePrice(String name, double price) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equalsIgnoreCase(name)) {
				list.get(i).setPrice(price);
				return true;
			}
		}
		return false;
	}

	public String getTitle() {
		return String.format("|%-15s|%-12s|%-13s|%-12s|%-20s|%-15s|%-10s|", "Name", "NumOfWheel", "Displacement",
				"Weight(kg)", "Price", "Category", "NumOfSeat");
	}

	@Override
	public String toString() {
		String s = "";
		for (Vehicle vehicle : list) {
			s += vehicle + "\n";
		}
		return s;
	}

}
