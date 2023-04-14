package tranTrungTien.bai02;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class SachThamKhao extends Book {
	private double thue;

	public SachThamKhao() {
		super();
		this.thue = 0;
	}

	public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		setThue(thue);
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
