package tranTrungTien.bai07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Management {
	private ArrayList<Person> list;
	private int count;

	public Management() {
		this.list = new ArrayList<>();
		this.count = 0;
	}

	public boolean addPerson(Person p) {
		if (count <= list.size()) {
			list.add(p);
			count++;
			return true;
		}
		return false;
	}

	public int findPerson(String tmp) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equalsIgnoreCase(tmp)) {
				return i;
			}
		}
		return -1;
	}

	public boolean delPerson(String tmp) {
		int pos = findPerson(tmp);
		if (pos != -1) {
			for (int i = pos; i < count - 1; i++) {
				list.remove(i);
				count--;
				return true;
			}
		}
		return false;
	}

	public void sortTheoTen() {
		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		});
	}
	
	public boolean update(String ten, String newAddress) {
		for (int i=0; i<list.size(); i++) {
			if (findPerson(ten) != -1) {
				list.get(i).setAddress(newAddress);
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String s = "";
		for (Person person : list) {
			s += person.toString() + "\n";
		}
		return s;
	}

}
