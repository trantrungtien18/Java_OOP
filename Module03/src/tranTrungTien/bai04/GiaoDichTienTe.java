package tranTrungTien.bai04;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class GiaoDichTienTe extends Bills {
	private double tiGia;
	private String loaiTien;

	public GiaoDichTienTe() {
		super();
		this.tiGia = 0;
		this.loaiTien = "Chua xac dinh";
	}

	public GiaoDichTienTe(String maGD, LocalDate ngayGD, double donGia, int soLuong, double tiGia, String loaiTien) {
		super(maGD, ngayGD, donGia, soLuong);
		setTiGia(tiGia);
		setLoaiTien(loaiTien);
	}

	public double getTiGia() {
		return tiGia;
	}

	public void setTiGia(double tiGia) {
		if (!(tiGia < 0))
			this.tiGia = tiGia;
		else
			this.tiGia = 0;
	}

	public String getLoaiTien() {
		return loaiTien;
	}

	public void setLoaiTien(String loaiTien) {
		if (!(loaiTien.trim().equals("")))
			this.loaiTien = loaiTien;
		else
			this.loaiTien = "Chua xac dinh";
	}

	public double thanhTien() {
		double total = 0;
		if (loaiTien.trim().equals("USD") || loaiTien.trim().equals("Euro"))
			total = getSoLuong() * getDonGia() * tiGia;
		else
			total = getSoLuong() * getDonGia();
		return total;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		String s = "";
		s += super.toString() + String.format("%20s|%-10s|%25s|", tiGia, loaiTien, df.format(thanhTien()));
		return s;
	}

//	String.format("|%-5s|%13s|%25s|%10s|%8s|%-10s|%25s", "Ma GD", "Ngay GD", "Don gia", "So luong",
//			"Ti gia", "Loai tien", "Thanh tien")

}
