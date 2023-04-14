package tranTrungTien.bai03;

import java.util.ArrayList;
import java.util.List;

public class DanhSachSach {
	private List<Book> listSach;
	private int count;

	public DanhSachSach() {
		this.listSach = new ArrayList<>();
	}

	public boolean addBook(Book b) {
		return listSach.add(b);
	}

	public String getTitle() {
		return String.format("|%-10s|%-15s|%-20s|%-10s|%-20s|%-20s|%-20s|", "Ma Sach", "Ngay Nhap", "Don Gia",
				"So Luong", "Nha San Xuat", "Tinh trang/Thue", "Thanh tien");
	}

	@Override
	public String toString() {
		String s = "";
		for (Book b : listSach)
			s += b + "\n";
		return getTitle() + "\n" + s;
	}

	public double sumOfTotalSGK() {
		double total = 0;
		for (Book b : listSach)
			if (b instanceof SachGiaoKhoa)
				total += ((SachGiaoKhoa) b).tinhTien();
		return total;
	}

	public double sumOfTotalSTK() {
		double total = 0;
		for (Book b : listSach)
			if (b instanceof SachThamKhao)
				total += ((SachThamKhao) b).tinhTien();
		return total;
	}

	public DanhSachSach searchSGKTheoNXB(String nxb) {
		DanhSachSach dsSGK = new DanhSachSach();
		for (int i = 0; i < listSach.size(); i++) {
			if (listSach.get(i) instanceof SachGiaoKhoa) {
				if (listSach.get(i).getNhaXuatBan().equalsIgnoreCase(nxb)) {
					dsSGK.addBook(listSach.get(i));
				}
			}
			if (listSach.get(i) instanceof SachThamKhao) {
				if (listSach.get(i).getNhaXuatBan().equalsIgnoreCase(nxb)) {
					dsSGK.addBook(listSach.get(i));
				}
			}
		}
		return dsSGK;
	}

	public double findMaxTotal() {
		double max = 0;
		for (Book b : listSach) {
			if (b instanceof SachGiaoKhoa)
				if (((SachGiaoKhoa) b).tinhTien() > max)
					max = ((SachGiaoKhoa) b).tinhTien();
			if (b instanceof SachThamKhao)
				if (((SachThamKhao) b).tinhTien() > max)
					max = ((SachThamKhao) b).tinhTien();
		}
		return max;
	}
}
