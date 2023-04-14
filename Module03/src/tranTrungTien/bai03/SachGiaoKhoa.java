package tranTrungTien.bai03;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class SachGiaoKhoa extends Book {
	private boolean tinhTrang;

	public SachGiaoKhoa() {
		super();
		this.tinhTrang = true;
	}

	public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan,
			boolean tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		setTinhTrang(tinhTrang);
	}

	public boolean isTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public double tinhTien() {
		double total = 0;
		if (tinhTrang)
			total = getSoLuong() * getDonGia();
		else
			total = getSoLuong() * getDonGia() * 0.5;
		return total;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		String s = "";
		if (tinhTrang)
			s += "Moi";
		else
			s += "Cu";
		return super.toString() + String.format("%-20s|%20s|", s, df.format(tinhTien()));
	}

}
