package tranTrungTien.bai09;

public class HinhTron {
	private ToaDo tam;
	private double banKinh;

	public HinhTron() {
		this.tam = new ToaDo();
		this.banKinh = 0;
	}

	public HinhTron(ToaDo tam, double banKinh) {
		this.tam = tam;
		setBanKinh(banKinh);
	}

	public ToaDo getTam() {
		return tam;
	}

	public void setTam(ToaDo tam) {
		this.tam = tam;
	}

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		if (banKinh >= 0)
			this.banKinh = banKinh;
		else
			this.banKinh = 0;
	}

	public double tinhChuVIi() {
		return 2 * 3.14 * banKinh;
	}

	public double tinhDienTich() {
		return 3.14 * banKinh * banKinh;
	}

	@Override
	public String toString() {
		return String.format("Dien tich va chu vi cua hinh tron tam %s co ban kinh %.2fm la %.3f va %.3f", tam, banKinh,
				tinhDienTich(), tinhChuVIi());
	}

}
