package tranTrungTien.bai06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham extends Product {
	private String nhaCungCap;
	private LocalDate ngaySX;
	private LocalDate ngayHH;

	public HangThucPham() {
		super();
		this.nhaCungCap = "Chua xac dinh";
		this.ngaySX = LocalDate.now();
		this.ngayHH = ngaySX;
	}

	public HangThucPham(String maHang, String tenHang, double donGia, int soLuong, String nhaCungCap, LocalDate ngaySX,
			LocalDate ngayHH) {
		super(maHang, tenHang, donGia, soLuong);
		setNhaCungCap(nhaCungCap);
		setNgaySX(ngaySX);
		setNgayHH(ngayHH);
	}

	public String getNhaCungCap() {
		return nhaCungCap;
	}

	public void setNhaCungCap(String nhaCungCap) {
		if (!(nhaCungCap.trim().equals("")))
			this.nhaCungCap = nhaCungCap;
		else
			this.nhaCungCap = "Chua xac dinh";
	}

	public LocalDate getNgaySX() {
		return ngaySX;
	}

	public void setNgaySX(LocalDate ngaySX) {
		if (!(ngaySX.isAfter(LocalDate.now())))
			this.ngaySX = ngaySX;
		else
			this.ngaySX = LocalDate.now();
	}

	public LocalDate getNgayHH() {
		return ngayHH;
	}

	public void setNgayHH(LocalDate ngayHH) {
		if (!(ngayHH.isBefore(ngaySX)))
			this.ngayHH = ngayHH;
		else
			this.ngayHH = ngaySX;
	}

	public String checkSell() {
		if (getSoLuong() > 0 && LocalDate.now().isAfter(ngayHH))
			return "Kho ban";
		else
			return "Khong danh gia";
	}

	public double getVAT() {
		return getDonGia() * 0.05;
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String s = "";
		s += String.format("|%-10s|%-20s|%-15s|%-10s|%-20s|%-20s|%-15s|", "Ma hang", "Ten hang", "Don gia", "So luong",
				"Nha cung cap", "Ngay san xuat", "Ngay het han") + "\n" + super.toString()
				+ String.format("|%-20s|%20s|%15s|", nhaCungCap, dtf.format(ngaySX), dtf.format(ngayHH))
				+ "\n----------------------------------------------------------------------------------------------------------------------\n";
		return s;
	}

}
