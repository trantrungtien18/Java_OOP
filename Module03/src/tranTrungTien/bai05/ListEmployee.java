package tranTrungTien.bai05;

import java.util.ArrayList;
import java.util.List;

public class ListEmployee {
	private List<Employee> list;

	public ListEmployee() {
		this.list = new ArrayList<>();
	}

	public boolean addEmployee(Employee e) {
		return list.add(e);
	}

	@Override
	public String toString() {
		String s = "";
		for (Employee employee : list) {
			s += employee + "\n";
		}
		return s;
	}

	public boolean delEmployee(String ssn) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getSSN().equalsIgnoreCase(ssn)) {
				list.remove(i);
				return true;
			}
		}
		return false;
	}
}
