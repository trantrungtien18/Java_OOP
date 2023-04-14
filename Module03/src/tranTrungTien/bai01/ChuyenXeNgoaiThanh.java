package tranTrungTien.bai01;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
	private String noiDen;
	private int soNgayDiDuoc;
	
	public ChuyenXeNgoaiThanh() {
		super();
		this.noiDen = "Chua xac dinh";
		this.soNgayDiDuoc = 1;
	}

	public ChuyenXeNgoaiThanh(String maChuyen, String hoTen, String soXe, double doanhThu, String noiDen,
			int soNgayDiDuoc) {
		super(maChuyen, hoTen, soXe, doanhThu);
		setNoiDen(noiDen);
		setSoNgayDiDuoc(soNgayDiDuoc);
	}

	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		if (!(noiDen.trim().equals("")))
			this.noiDen = noiDen;
		else
			this.noiDen = "Chua xac dinh";
	}

	public int getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}

	public void setSoNgayDiDuoc(int soNgayDiDuoc) {
		if (!(soNgayDiDuoc <= 0))
			this.soNgayDiDuoc = soNgayDiDuoc;
		else
			this.soNgayDiDuoc = 1;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%20s|%20s|", noiDen, soNgayDiDuoc);
	}

}
