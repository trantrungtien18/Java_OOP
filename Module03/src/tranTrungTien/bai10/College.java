package tranTrungTien.bai10;

import java.time.LocalDate;

public class College extends VocationalCollege {

	public College() {
		super();
	}

	public College(String id, String name, LocalDate dob, String address, int thoiGianDaoTao) {
		super(id, name, dob, address, thoiGianDaoTao);
	}

	public String getBangCap() {
		return "Bang cao dang";
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
