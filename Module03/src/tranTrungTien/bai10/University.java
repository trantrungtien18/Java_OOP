package tranTrungTien.bai10;

import java.time.LocalDate;

public class University extends VocationalCollege {

	public University() {
		super();
	}

	public University(String id, String name, LocalDate dob, String address, int thoiGianDaoTao) {
		super(id, name, dob, address, thoiGianDaoTao);
	}

	public String getBangCap() {
		return "Bang dai hoc";
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
