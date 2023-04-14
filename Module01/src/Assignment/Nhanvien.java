package Assignment;

import java.text.DecimalFormat;
import java.util.Objects;

public class Nhanvien implements Comparable<Nhanvien> {
	private String manv;
	private String hovaten;
	private double luong;

	public Nhanvien(String manv, String hovaten, double luong) {
		setManv(manv);
		setHovaten(hovaten);
		setLuong(luong);
	}

	public Nhanvien(String manv) {
		this.manv = manv;
	}

	public String getManv() {
		return manv;
	}

	public void setManv(String manv) {
		this.manv = manv;
	}

	public String getHovaten() {
		return hovaten;
	}

	public void setHovaten(String havaten) {
		this.hovaten = havaten;
	}

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}

	public double tinhthue() {
		double thue = 0;

		if (this.luong < 9) {
			thue = 0;
		} else if (this.luong < 15) {
			thue = this.luong * 0.1;
		}
		if (this.luong > 15) {
			thue = this.luong * 0.12;
		}

		return thue;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00VND");
		return String.format("|%15s|%15s|%20s|%15s|", hovaten, manv, df.format(luong), tinhthue());
	}

	@Override
	public int compareTo(Nhanvien o) {
		// TODO Auto-generated method stub
		return this.manv.compareTo(o.manv);
	}

	@Override
	public int hashCode() {
		return Objects.hash(hovaten, luong, manv);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nhanvien other = (Nhanvien) obj;
		return Objects.equals(manv, other.manv);
	}

}
