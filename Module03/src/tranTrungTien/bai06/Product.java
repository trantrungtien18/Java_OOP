package tranTrungTien.bai06;

import java.text.DecimalFormat;
import java.util.Objects;

public abstract class Product {
	private String maHang;
	private String tenHang;
	private double donGia;
	private int soLuong;

	public Product() {
		this.maHang = "xxx";
		this.tenHang = "chua xac dinh";
		this.donGia = 0;
		this.soLuong = 0;
	}

	public Product(String maHang, String tenHang, double donGia, int soLuong) {
		setMaHang(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setSoLuong(soLuong);
	}

	@Override
	public int hashCode() {
		return Objects.hash(maHang);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(maHang, other.maHang);
	}

	public String getMaHang() {
		return maHang;
	}

	private void setMaHang(String maHang) {
		if (!(maHang.trim().equals("")))
			this.maHang = maHang;
		else
			this.maHang = "Chua xac dinh";
	}

	public String getTenHang() {
		return tenHang;
	}

	private void setTenHang(String tenHang) {
		if (!(tenHang.trim().equals("")))
			this.tenHang = tenHang;
		else
			this.tenHang = "xxx";
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

	public abstract String checkSell();

	public abstract double getVAT();

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		return String.format("|%-10s|%-20s|%15s|%10s", maHang, tenHang, df.format(donGia), soLuong);
	}

}
