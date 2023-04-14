package tranTrungTien.bai01;

import java.text.DecimalFormat;

public class ChuyenXe {
	private String maChuyen;
	private String hoTen;
	private String soXe;
	private double doanhThu;

	public ChuyenXe() {
		this.maChuyen = "xxx";
		this.hoTen = "Chua xac dinh";
		this.soXe = "xxx";
		this.doanhThu = 0;
	}

	public ChuyenXe(String maChuyen, String hoTen, String soXe, double doanhThu) {
		setMaChuyen(maChuyen);
		setHoTen(hoTen);
		setSoXe(soXe);
		setDoanhThu(doanhThu);
	}

	public String getMaChuyen() {
		return maChuyen;
	}

	public void setMaChuyen(String maChuyen) {
		if (!(maChuyen.trim().equals("")))
			this.maChuyen = maChuyen;
		else
			this.maChuyen = "xxx";
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		if (!(hoTen.trim().equals("")))
			this.hoTen = hoTen;
		else
			this.hoTen = "Chua xac dinh";
	}

	public String getSoXe() {
		return soXe;
	}

	public void setSoXe(String soXe) {
		if (!(soXe.trim().equals("")))
			this.soXe = soXe;
		else
			this.soXe = "Chua xac dinh";
	}

	public double getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(double doanhThu) {
		if (!(doanhThu < 0))
			this.doanhThu = doanhThu;
		else
			this.doanhThu = 0;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		return String.format("|%-10s|%-20s|%10s|%20s|", maChuyen, hoTen, soXe, df.format(doanhThu));
	}

}
