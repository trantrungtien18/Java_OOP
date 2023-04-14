package tranTrungTien.bai10;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
	private List<Student> list;

	public StudentList() {
		this.list = new ArrayList<>();
	}

	public boolean addStudent(Student s) {
		return list.add(s);
	}

	public boolean delStudent(String ma) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().trim().equalsIgnoreCase(ma)) {
				list.remove(i);
				return true;
			}
		}
		return false;
	}

	public boolean findStudent(String ma) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().trim().equalsIgnoreCase(ma)) {
				return true;
			}
		}
		return false;
	}

	public String getTitle() {
		return String.format("|%-10s|%-15s|%-12s|%-15s|%-10s|%-15s|", "ID", "Name", "DoB", "Address", "Other",
				"Loai bang cap");
	}

	@Override
	public String toString() {
		String s = "";
		for (Student student : list) {
			s += student + "\n";
		}
		return getTitle() + "\n" + s;
	}

}
