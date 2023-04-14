package tranTrungTien.bai12;

import java.text.DecimalFormat;

public class CD {
	private int maCD;
	private String tuaCD;
	private int soBaiHat;
	private double giaThanh;
	
	public CD() {
		this.maCD = 999999;
		this.tuaCD = "Chua xac dinh";
		this.soBaiHat = 1;
		this.giaThanh = 1;
	}

	public CD(int maCD, String tuaCD, int soBaiHat, double giaThanh) {
		setMaCD(maCD);
		setTuaCD(tuaCD);
		setSoBaiHat(soBaiHat);
		setGiaThanh(giaThanh);
	}

	public int getMaCD() {
		return maCD;
	}

	public void setMaCD(int maCD) {
		if (maCD <= 0)
			this.maCD = 999999;
		else
			this.maCD = maCD;
	}

	public String getTuaCD() {
		return tuaCD;
	}

	public void setTuaCD(String tuaCD) {
		if (tuaCD.trim().equals(""))
			this.tuaCD = "Chua xac dinh";
		else
			this.tuaCD = tuaCD;
	}

	public int getSoBaiHat() {
		return soBaiHat;
	}

	public void setSoBaiHat(int soBaiHat) {
		if (!(soBaiHat <= 0))
			this.soBaiHat = soBaiHat;
		else
			this.soBaiHat = 1;
	}

	public double getGiaThanh() {
		return giaThanh;
	}

	public void setGiaThanh(double giaThanh) {
		if (!(giaThanh <= 0))
			this.giaThanh = giaThanh;
		else
			this.giaThanh = 1;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		return String.format("%10s|%-15s|%10s|%15s", maCD, tuaCD, soBaiHat, df.format(giaThanh));
	}

}
