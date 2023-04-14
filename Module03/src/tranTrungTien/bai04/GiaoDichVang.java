package tranTrungTien.bai04;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class GiaoDichVang extends Bills {
	private String loaiVang;

	public GiaoDichVang() {
		super();
		this.loaiVang = "Chua xac dinh";
	}

	public GiaoDichVang(String maGD, LocalDate ngayGD, double donGia, int soLuong, String loaiVang) {
		super(maGD, ngayGD, donGia, soLuong);
		setLoaiVang(loaiVang);
	}

	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		if (!(loaiVang.trim().equals("")))
			this.loaiVang = loaiVang;
		else
			this.loaiVang = "Chua xac dinh";
	}

	public double thanhTien() {
		return getSoLuong() * getDonGia();
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		String s = "";
		s += super.toString() + String.format("%-20s|%10s|%25s|", loaiVang, "", df.format(thanhTien()));
		return s;
	}

//	String.format("|%-5s|%13s|%25s|%10s|%10s|%-10s|%25s", "Ma GD", "Ngay GD", "Don gia", "So luong",
//			"Loai vang", "", "Thanh tien");
}
