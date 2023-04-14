package tranTrungTien.bai11;

import java.time.LocalDate;

public class KhachHang {
	private String maKH;
	private String hoTenKH;
	private SoTietKiem[] dsSoTietKiem;
	private int soLuongSoHienCo;

	public KhachHang(String maKH, String hoTenKH, int n) {
		this.maKH = maKH;
		setHoTenKH(hoTenKH);
		this.soLuongSoHienCo = 0;
		this.dsSoTietKiem = new SoTietKiem[n];
	}

	public String getHoTenKH() {
		return hoTenKH;
	}

	public void setHoTenKH(String hoTenKH) {
		if (!(hoTenKH.trim().equals("")))
			this.hoTenKH = hoTenKH;
		else
			this.hoTenKH = "Chua xac dinh";
	}

	public String getMaKH() {
		return maKH;
	}

	public SoTietKiem[] getDsSoTietKiem() {
		return dsSoTietKiem;
	}

	public int getSoLuongSoHienCo() {
		return soLuongSoHienCo;
	}

	public boolean themSoTietKiem(String maSo, LocalDate ngayMoSo, double soTienGoi, int kyHan, double laiSuat) {
		if (soLuongSoHienCo < dsSoTietKiem.length) {
			dsSoTietKiem[soLuongSoHienCo++] = new SoTietKiem(maSo, ngayMoSo, soTienGoi, kyHan, laiSuat);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String s = String.format("Khach hang: %s - %s", maKH, hoTenKH) + "\n";
		for (int i = 0; i < soLuongSoHienCo; i++) {
			s += dsSoTietKiem[i] + "\n";
		}
		return s;
	}

}
