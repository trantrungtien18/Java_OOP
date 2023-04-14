package tranTrungTien.bai06;

public class ThongTinDangKyXe {
	private String chuXe;
	private String loaiXe;
	private int triGiaXe;
	private int dungTich;

	public ThongTinDangKyXe() {
		this.chuXe = "Chua xac dinh";
		this.loaiXe = "Chua xac dinh";
		this.triGiaXe = 0;
		this.dungTich = 0;
	}

	public ThongTinDangKyXe(String chuXe, String loaiXe, int triGiaXe, int dungTich) throws Exception {
		setChuXe(chuXe);
		setLoaiXe(loaiXe);
		setTriGiaXe(triGiaXe);
		setDungTich(dungTich);
	}

	public String getChuXe() {
		return chuXe;
	}

	public void setChuXe(String chuXe) throws Exception {
		if (chuXe.trim().equals("")) {
			throw new Exception("Phai co ten cua chu xe");
		} else {
			this.chuXe = chuXe;
		}
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) throws Exception {
		if (loaiXe.trim().equals("")) {
			throw new Exception("Loai xe khong duoc bo trong!");
		} else {
			this.loaiXe = loaiXe;
		}
	}

	public int getTriGiaXe() {
		return triGiaXe;
	}

	public void setTriGiaXe(int triGiaXe) throws Exception {
		if (triGiaXe < 0) {
			throw new Exception("Tri gia xe phai lon hon 0!");
		} else {
			this.triGiaXe = triGiaXe;
		}
	}

	public int getDungTich() {
		return dungTich;
	}

	public void setDungTich(int dungTich) throws Exception {
		if (dungTich < 0) {
			throw new Exception("Dung tich Xillanh phai lon hon 0!");
		} else {
			this.dungTich = dungTich;
		}
	}

	public double getThue() {
		double thue = 0;
		if (dungTich < 100) {
			thue = triGiaXe * 0.9;
		} else if (dungTich >= 100 && dungTich <= 200) {
			thue = triGiaXe * 0.3;
		} else {
			thue = triGiaXe * 0.5;
		}
		return thue;
	}

	@Override
	public String toString() {
		return String.format("%-20s%-17s%5s%13s%20.2f", chuXe, loaiXe, dungTich, triGiaXe, getThue());
	}

}
