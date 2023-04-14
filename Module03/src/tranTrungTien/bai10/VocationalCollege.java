package tranTrungTien.bai10;

import java.time.LocalDate;

public class VocationalCollege extends Student {
	private int thoiGianDaoTao;

	public VocationalCollege() {
		super();
		this.thoiGianDaoTao = 0;
	}

	public VocationalCollege(String id, String name, LocalDate dob, String address, int thoiGianDaoTao) {
		super(id, name, dob, address);
		this.thoiGianDaoTao = thoiGianDaoTao;
	}

	public int getThoiGianDaoTao() {
		return thoiGianDaoTao;
	}

	public void setThoiGianDaoTao(int thoiGianDaoTao) {
		if (thoiGianDaoTao > 0)
			this.thoiGianDaoTao = thoiGianDaoTao;
		else
			this.thoiGianDaoTao = 0;
	}

	public String getBangCap() {
		return "Bang trung cap";
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-10s|%15s|", thoiGianDaoTao, getBangCap());
	}

}
