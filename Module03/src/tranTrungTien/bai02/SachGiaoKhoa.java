package tranTrungTien.bai02;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class SachGiaoKhoa extends Book {
	private String tinhTrang;

	public SachGiaoKhoa() {
		super();
		this.tinhTrang = "Chua xac dinh";
	}

	public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan,
			String tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		setTinhTrang(tinhTrang);
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		if (!((tinhTrang.trim().equals(""))) && (tinhTrang.trim().equals("moi") || tinhTrang.trim().equals("cu")))
			this.tinhTrang = tinhTrang;
		else
			this.tinhTrang = "Chua xac dinh";
	}

	public double tinhTien() {
		double total = 0;
		if (tinhTrang.trim().equals("moi"))
			total = getSoLuong() * getDonGia();
		else
			total = getSoLuong() * getDonGia() * 0.5;
		return total;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		return super.toString() + String.format("%-20s|%20s|", tinhTrang, df.format(tinhTien()));
	}

}
