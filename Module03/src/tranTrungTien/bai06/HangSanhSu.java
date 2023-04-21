package tranTrungTien.bai06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangSanhSu extends Product {
	private String nhaSanXuat;
	private LocalDate ngayNhapKho;

	public HangSanhSu() {
		super();
		this.nhaSanXuat = "Chua xac dinh";
		this.ngayNhapKho = LocalDate.now();
	}

	public HangSanhSu(String maHang, String tenHang, double donGia, int soLuong, String nhaSanXuat,
			LocalDate ngayNhapKho) {
		super(maHang, tenHang, donGia, soLuong);
		this.nhaSanXuat = nhaSanXuat;
		this.ngayNhapKho = ngayNhapKho;
	}

	public String getNhaSanXuat() {
		return nhaSanXuat;
	}

	public void setNhaSanXuat(String nhaSanXuat) {
		if (!(nhaSanXuat.trim().equals("")))
			this.nhaSanXuat = nhaSanXuat;
		else
			this.nhaSanXuat = "Chua xac dinh";
	}

	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}

	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		if (!(ngayNhapKho.isAfter(LocalDate.now())))
			this.ngayNhapKho = ngayNhapKho;
		else
			this.ngayNhapKho = LocalDate.now();
	}

	public String checkSell() {
		if (getSoLuong() > 50 && ((LocalDate.now().getDayOfYear() - ngayNhapKho.getDayOfYear()) > 10))
			return "Ban cham";
		else
			return "Khong danh gia";
	}

	public double getVAT() {
		return getDonGia() * 0.1;
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return super.toString() + String.format("|%20s|%20s|%15s|%15s|%15s|%15s|%15s|", "-", "-", "-", "-", "-",
				nhaSanXuat, dtf.format(ngayNhapKho));
	}

}
