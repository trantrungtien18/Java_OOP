package tranTrungTien.bai02;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Book {
	private String maSach;
	private LocalDate ngayNhap;
	private double donGia;
	private int soLuong;
	private String nhaXuatBan;

	public Book() {
		this.maSach = "xxx";
		this.ngayNhap = LocalDate.now();
		this.donGia = 0;
		this.soLuong = 0;
		this.nhaXuatBan = "Chua xac dinh";
	}

	public Book(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
		setMaSach(maSach);
		this.ngayNhap = ngayNhap;
		setDonGia(donGia);
		setSoLuong(soLuong);
		setNhaXuatBan(nhaXuatBan);
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		if (!(maSach.trim().equals("")))
			this.maSach = maSach;
		else
			this.maSach = "Chua xac dinh";
	}

	public LocalDate getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		if (!(donGia < 0))
			this.donGia = donGia;
		else
			this.donGia = 0;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		if (!(soLuong < 0))
			this.soLuong = soLuong;
		else
			this.soLuong = 0;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		if (!(nhaXuatBan.trim().equals("")))
			this.nhaXuatBan = nhaXuatBan;
		else
			this.nhaXuatBan = "Chua xac dinh";
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		return String.format("|%-10s|%15s|%20s|%10s|%-20s|", maSach, dtf.format(ngayNhap), df.format(donGia), soLuong,
				nhaXuatBan);
	}

}
