package tranTrungTien.bai11;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class SoTietKiem {
	private String maSo;
	private LocalDate ngayMoSo;
	private double soTienGoi;
	private int kyHan;
	private double laiSuat;

	public SoTietKiem(String maSo, LocalDate ngayMoSo, double soTienGoi, int kyHan, double laiSuat) {
		setMaSo(maSo);
		setNgayMoSo(ngayMoSo);
		setSoTienGoi(soTienGoi);
		setKyHan(kyHan);
		setLaiSuat(laiSuat);
	}

	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		if (maSo.trim().equals(""))
			this.maSo = "xxxx";
		else
			this.maSo = maSo;
	}

	public LocalDate getNgayMoSo() {
		return ngayMoSo;
	}

	public void setNgayMoSo(LocalDate ngayMoSo) {
		this.ngayMoSo = ngayMoSo;
	}

	public double getSoTienGoi() {
		return soTienGoi;
	}

	public void setSoTienGoi(double soTienGoi) {
		if (soTienGoi <= 0)
			this.soTienGoi = 1;
		else
			this.soTienGoi = soTienGoi;
	}

	public int getKyHan() {
		return kyHan;
	}

	public void setKyHan(int kyHan) {
		if (kyHan <= 0)
			this.kyHan = 1;
		else
			this.kyHan = kyHan;
	}

	public double getLaiSuat() {
		return laiSuat;
	}

	public void setLaiSuat(double laiSuat) {
		this.laiSuat = laiSuat;
	}

	public int tinhSoThangGoiThuc() {
		Period age = Period.between(ngayMoSo, LocalDate.now());
		int dt_Year = age.getYears();
		int dt_Month = age.getMonths();
		int soThangGoi = dt_Year * 12 + dt_Month;
		if (soThangGoi % kyHan == 0)
			return soThangGoi;
		else
			return soThangGoi / kyHan * kyHan;
	}

	public double tinhTienLai() {
		return soTienGoi * laiSuat * (tinhSoThangGoiThuc() / kyHan);
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,###.00");
		String s = String.format(
				"STK: %s[%s-%s]KH %d thang, so thang tinh lai: %d, ls %f, so tien: %s --> Tien lai: %s", maSo,
				dtf.format(ngayMoSo), dtf.format(LocalDate.now()), kyHan, tinhSoThangGoiThuc(), laiSuat,
				df.format(soTienGoi), df.format(tinhTienLai()));
		return s;
	}
}
