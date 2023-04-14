package tranTrungTien.bai04;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Bills {
	private String maGD;
	private LocalDate ngayGD;
	private double donGia;
	private int soLuong;

	public Bills() {
		this.maGD = "xxx";
		this.ngayGD = LocalDate.now();
		this.donGia = 0;
		this.soLuong = 0;
	}

	public Bills(String maGD, LocalDate ngayGD, double donGia, int soLuong) {
		setMaGD(maGD);
		this.ngayGD = ngayGD;
		setDonGia(donGia);
		setSoLuong(soLuong);
	}

	public String getMaGD() {
		return maGD;
	}

	public void setMaGD(String maGD) {
		if (!(maGD.trim().equals("")))
			this.maGD = maGD;
		else
			this.maGD = "Chua xac dinh";
	}

	public LocalDate getNgayGD() {
		return ngayGD;
	}

	public void setNgayGD(LocalDate ngayGD) {
		this.ngayGD = ngayGD;
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

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		return String.format("|%-5s|%13s|%25s|%10s|", maGD, dtf.format(ngayGD), df.format(donGia), soLuong);
	}

}
