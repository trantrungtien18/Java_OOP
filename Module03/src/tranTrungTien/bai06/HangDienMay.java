package tranTrungTien.bai06;

public class HangDienMay extends Product {
	private int thoiGianBaoHanh;
	private int congSuat;

	public HangDienMay() {
		super();
		this.thoiGianBaoHanh = 0;
		this.congSuat = 0;
	}

	public HangDienMay(String maHang, String tenHang, double donGia, int soLuong, int thoiGianBaoHanh, int congSuat) {
		super(maHang, tenHang, donGia, soLuong);
		setThoiGianBaoHanh(thoiGianBaoHanh);
		setCongSuat(congSuat);
	}

	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		if (!(thoiGianBaoHanh < 0))
			this.thoiGianBaoHanh = thoiGianBaoHanh;
		else
			this.thoiGianBaoHanh = 0;
	}

	public int getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(int congSuat) {
		if (!(congSuat < 0))
			this.congSuat = congSuat;
		else
			this.congSuat = 0;
	}

	public String checkSell() {
		if (getSoLuong() < 3)
			return "Ban duoc";
		else
			return "Khong danh gia";
	}

	public double getVAT() {
		return getDonGia() * 0.1;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("|%20s|%20s|%15s|%15s|%15s|%15s|%15s|", "-", "-", "-", thoiGianBaoHanh,
				congSuat, "-", "-");
	}

}
