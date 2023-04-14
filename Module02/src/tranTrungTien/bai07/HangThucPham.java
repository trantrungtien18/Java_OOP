package tranTrungTien.bai07;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
	private String maHang;
	private String tenHang;
	private int donGia;
	private LocalDate ngaySX;
	private LocalDate ngayHH;

	public HangThucPham(String maHang) throws Exception {
		setMaHang(maHang);
		this.tenHang = "xxx";
		this.donGia = 0;
		this.ngaySX = LocalDate.now();
		this.ngayHH = ngaySX;
	}

	public HangThucPham(String maHang, String tenHang, int donGia, LocalDate ngaySX, LocalDate ngayHH)
			throws Exception {
		setMaHang(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setNgaySX(ngaySX);
		setNgayHH(ngayHH);
	}

	public String getMaHang() {
		return maHang;
	}

	private void setMaHang(String maHang) throws Exception {
		if (maHang.trim().equals("")) {
			throw new Exception("Ma hang khong duoc rong!");
		} else {
			this.maHang = maHang;
		}
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		if (tenHang.trim().equals("")) {
			this.tenHang = "xxx";
		} else {
			this.tenHang = tenHang;
		}
	}

	public int getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) {
		if (donGia < 0) {
			this.donGia = 0;
		} else {
			this.donGia = donGia;
		}
	}

	public LocalDate getNgaySX() {
		return ngaySX;
	}

	public void setNgaySX(LocalDate ngaySX) {
		if (ngaySX.isBefore(LocalDate.now()))
			this.ngaySX = ngaySX;
		else
			this.ngaySX = LocalDate.now();
	}

	public LocalDate getNgayHH() {
		return ngayHH;
	}

	public void setNgayHH(LocalDate ngayHH) {
		if (ngayHH.isAfter(ngaySX))
			this.ngayHH = ngayHH;
		else
			this.ngayHH = ngaySX;
	}

	public boolean isOutOfDate() {
		if (getNgayHH().isAfter(LocalDate.now()))
			return false;
		else
			return true;
	}

	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,###.00 VND");
		String s = String.format("%-10s%-13s%20s%30s%30s", maHang, tenHang, df.format(donGia), dtf.format(ngaySX),
				dtf.format(ngayHH));
		if (isOutOfDate()) {
			s += String.format("%26s", "Hang het hang");
		}
		return s;
	}
}
