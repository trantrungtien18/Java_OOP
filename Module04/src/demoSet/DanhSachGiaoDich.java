package demoSet;

import java.util.HashSet;
import java.util.Set;

public class DanhSachGiaoDich {
	private Set<Bills> list;

	public DanhSachGiaoDich() {
		this.list = new HashSet<>();
	}

	public boolean addGiaoDich(Bills bill) {
		return list.add(bill);
	}

	public String getTitle() {
		return String.format("|%-5s|%-13s|%-25s|%-10s|%-20s|%-10s|%-25s|", "Ma GD", "Ngay GD", "Don gia", "So luong",
				"Loai vang/Ti gia", "Loai tien", "Thanh tien");
	}

	@Override
	public String toString() {
		String s = "";
		for (Bills b : list)
			s += b + "\n";
		return getTitle() + "\n" + s;
	}

	public int tinhTongGDVang() {
		int count = 0;
		for (Bills b : list)
			if (b instanceof GiaoDichVang)
				count++;
		return count;
	}

	public int tinhTongGDTien() {
		int count = 0;
		for (Bills b : list)
			if (b instanceof GiaoDichTienTe)
				count++;
		return count;
	}

	public double tinhTrungBinhThanhTien() {
		double avgTotal = 0;
		double total = 0;
		for (Bills b : list)
			if (b instanceof GiaoDichTienTe)
				total += ((GiaoDichTienTe) b).thanhTien();
		avgTotal = total / tinhTongGDTien();
		return avgTotal;
	}

	public DanhSachGiaoDich layGDTren1Ty() {
		DanhSachGiaoDich ds1Ty = new DanhSachGiaoDich();
		for (Bills b : list) {
			if (b instanceof GiaoDichVang) {
				if (b.getDonGia() > 1000000000)
					ds1Ty.addGiaoDich(b);
			}
			if (b instanceof GiaoDichTienTe) {
				if (b.getDonGia() > 1000000000)
					ds1Ty.addGiaoDich(b);
			}
		}
		return ds1Ty;
	}
}
