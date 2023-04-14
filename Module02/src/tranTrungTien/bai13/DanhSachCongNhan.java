package tranTrungTien.bai13;

public class DanhSachCongNhan {
	private CongNhan[] dsCN;
	private int soCN;

	public DanhSachCongNhan(int n) {
		this.dsCN = new CongNhan[n];
		this.soCN = 0;
	}

	public boolean addCN(CongNhan cnMoi) {
		if (soCN < 0)
			return false;
		dsCN[soCN] = cnMoi;
		soCN++;
		return true;
	}

	private String getTitle() {
		return String.format("%-20s|%-10s|%-15s", "Ho va Ten", "So luong", "Luong");
	}

	@Override
	public String toString() {

		String s = "";
		for (int i = 0; i < soCN; i++)
			s += dsCN[i] + "\n";
		return getTitle() + "\n" + s;
	}

	public int getSoLuong() {
		return soCN;
	}

	public String getCN200SP() {
		String s = "";
		for (CongNhan cn : dsCN) {
			if (cn.getmSoSP() >= 200)
				s += cn + "\n";
		}
		return String.format("Danh sach CN lam tren 200 SP:\n") + getTitle() + "\n" + s;
	}

	public void sortCongNhan() {
		for (int i = 0; i < (dsCN.length - 1); i++)
			for (int j = i + 1; j < dsCN.length; j++)
				if (dsCN[i].getmSoSP() < dsCN[j].getmSoSP()) {
					CongNhan temp = dsCN[j];
					dsCN[j] = dsCN[i];
					dsCN[i] = temp;
				}
	}
}
