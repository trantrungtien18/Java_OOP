package tranTrungTien.bai13;

import java.text.DecimalFormat;

public class CongNhan {
	private String mHo;
	private String mTen;
	private int mSoSP;

	public CongNhan() {
		this.mHo = "xxx";
		this.mTen = "xxx";
		this.mSoSP = 0;
	}

	public CongNhan(String mHo, String mTen, int mSoSP) {
		setmHo(mHo);
		setmTen(mTen);
		setmSoSP(mSoSP);
	}

	public String getmHo() {
		return mHo;
	}

	public void setmHo(String mHo) {
		if (!(mHo.trim().equals("")))
			this.mHo = mHo;
		else
			this.mHo = "xxx";
	}

	public String getmTen() {
		return mTen;
	}

	public void setmTen(String mTen) {
		if (!(mTen.trim().equals("")))
			this.mTen = mTen;
		else
			this.mTen = "xxx";
	}

	public int getmSoSP() {
		return mSoSP;
	}

	public void setmSoSP(int mSoSP) {
		if (mSoSP >= 0)
			this.mSoSP = mSoSP;
		else
			this.mSoSP = 0;
	}

	public double getSalary() {
		double kq = 0;
		if (mSoSP > 600)
			kq = mSoSP * 0.65;
		else if (mSoSP >= 400)
			kq = mSoSP * 0.6;
		else if (mSoSP >= 200)
			kq = mSoSP * 0.55;
		else
			kq = mSoSP * 0.5;
		return kq;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		String s = mHo + " " + mTen;
		return String.format("%-20s|%10s|%15s", s, mSoSP, df.format(getSalary()));
	}

}
