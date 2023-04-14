package tranTrungTien.bai10;

public class LopHocPhan {
	private String maLHP;
	private String tenLHP;
	private String tenGV;
	private String thongTinLopHoc;
	private SinhVien[] dsSV;

	public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongTinLopHoc, SinhVien[] dsSV) {
		setMaLHP(maLHP);
		setTenLHP(tenLHP);
		setTenGV(tenGV);
		setThongTinLopHoc(thongTinLopHoc);
		this.dsSV = dsSV;
	}

	public String getMaLHP() {
		return maLHP;
	}

	public void setMaLHP(String maLHP) {
		if (maLHP.trim().equals(""))
			this.maLHP = "000";
		else
			this.maLHP = maLHP;
	}

	public String getTenLHP() {
		return tenLHP;
	}

	public void setTenLHP(String tenLHP) {
		if (tenLHP.trim().equals(""))
			this.tenLHP = "xxx";
		else
			this.tenLHP = tenLHP;
	}

	public String getTenGV() {
		return tenGV;
	}

	public void setTenGV(String tenGV) {
		if (tenGV.trim().equals(""))
			this.tenGV = "xxx";
		else
			this.tenGV = tenGV;
	}

	public String getThongTinLopHoc() {
		return thongTinLopHoc;
	}

	public void setThongTinLopHoc(String thongTinLopHoc) {
		if (thongTinLopHoc.trim().equals(""))
			this.thongTinLopHoc = "xxx";
		else
			this.thongTinLopHoc = thongTinLopHoc;
	}

	public SinhVien[] getDsSV() {
		return dsSV;
	}

	public void setDsSV(SinhVien[] dsSV) {
		this.dsSV = dsSV;
	}

	public int getSoLuong() {
		int count = 0;
		count = dsSV.length;
		return count;
	}

	@Override
	public String toString() {
		String s = String.format("%s%s\n%s%s\n%s%s\n%s%s\n\nDanh sach sinh vien\n", "Ma LHP: ", maLHP, "Ten LHP: ",
				tenLHP, "Ten GV: ", tenGV, "Thong tin buoi hoc: ", thongTinLopHoc);
		for (SinhVien sv : dsSV) {
			s += sv + "\n";
		}
		s += "Tong so sinh vien: " + getSoLuong();
		return s;
	}

}
