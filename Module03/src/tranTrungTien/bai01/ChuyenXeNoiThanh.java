package tranTrungTien.bai01;

import java.text.DecimalFormat;

public class ChuyenXeNoiThanh extends ChuyenXe {
	private int soTuyen;
	private int quangDuong;

	public ChuyenXeNoiThanh() {
		super();
		this.soTuyen = 1;
		this.quangDuong = 0;
	}
	
	public ChuyenXeNoiThanh(String maChuyen, String hoTen, String soXe, double doanhThu, int soTuyen, int quangDuong) {
		super(maChuyen, hoTen, soXe, doanhThu);
		setSoTuyen(soTuyen);
		setQuangDuong(quangDuong);
	}

	public int getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(int soTuyen) {
		if (!(soTuyen <= 0))
			this.soTuyen = soTuyen;
		else
			this.soTuyen = 1;
	}

	public int getQuangDuong() {
		return quangDuong;
	}

	public void setQuangDuong(int quangDuong) {
		if (!(quangDuong < 0))
			this.quangDuong = quangDuong;
		else
			this.quangDuong = 0;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,## Km");
		return super.toString() + String.format("%20s|%20s|", soTuyen, df.format(quangDuong));
	}

}
