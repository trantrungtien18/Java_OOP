package tranTrungTien.bai03;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class SachThamKhao extends Book {
	private double thue;

	public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		this.thue = thue;
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		if (!(thue < 0))
			this.thue = thue;
		else
			this.thue = 0;
	}

	public double tinhTien() {
		return getSoLuong() * getDonGia() * thue;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		return super.toString() + String.format("%20s|%20s|", thue, df.format(tinhTien()));
	}

}
