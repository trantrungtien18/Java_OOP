package tranTrungTien.bai15;

import java.time.LocalDate;

public class DanhSachHocVien {
	private DiemHocVien[] dsHV;
	private int soLuong;

	public DanhSachHocVien(int n) {
		this.dsHV = new DiemHocVien[n];
		this.soLuong = 0;
	}

	public boolean addHV(String name, LocalDate dob, double scoreSub1, double scoreSub2, double scoreSub3,
			double scoreSub4, double scoreSub5) {
		if (soLuong < 0)
			return false;
		dsHV[soLuong++] = new DiemHocVien(name, dob, scoreSub1, scoreSub2, scoreSub3, scoreSub4, scoreSub5);
		return true;
	}

	public boolean isBelow5(DiemHocVien hv) {
		if (hv.getDiemMon1() > 5 && hv.getDiemMon2() > 5 && hv.getDiemMon3() > 5 && hv.getDiemMon4() > 5
				&& hv.getDiemMon5() > 5) {
			return true;
		}
		return false;
	}

	public String xetThiLai(DiemHocVien hv) {
		if (hv.getDiemMon1() < 5)
			return "Thi lai mon 1";
		if (hv.getDiemMon2() < 5)
			return "Thi lai mon 2";
		if (hv.getDiemMon3() < 5)
			return "Thi lai mon 3";
		if (hv.getDiemMon4() < 5)
			return "Thi lai mon 4";
		else
			return "Thi lai mon 5";
	}

	public String xetDuyet(DiemHocVien hv) {
		if (hv.getDTB() > 7 && isBelow5(hv) == true)
			return "Sinh vien được làm luận văn";
		else if (hv.getDTB() <= 7 && isBelow5(hv) == true)
			return "Sinh vien duoc thi tot nghiep";
		return xetThiLai(hv);
	}

	private String getTitle() {
		return String.format("%-15s|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s|%-11s|%-25s", "Ho va ten", "Ngay sinh",
				"Diem mon 1", "Diem mon 2", "Diem mon 3", "Diem mon 4", "Diem mon 5", "DTB", "Ghi chu");
	}

	@Override
	public String toString() {
		String s = "";
		for (DiemHocVien hv : dsHV)
			s += hv + xetDuyet(hv) + "\n";
		return getTitle() + "\n" + s;
	}

}
