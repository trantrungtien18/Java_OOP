package tranTrungTien.bai06;

import java.util.Arrays;
import java.util.Comparator;

public class DanhSachHangHoa {
	private Product[] list;
	private int count;

	public DanhSachHangHoa(int n) {
		this.list = new Product[n];
		this.count = 0;
	}

	public Product checkProduct(Product p) {
		for (int i = 0; i < count; i++) {
			if (p.getMaHang().equals(list[i].getMaHang())) {
				return list[i];
			}
		}
		return null;
	}

	public boolean addProduct(Product p) {
		if (list.length > count || checkProduct(p) == null) {
			list[count] = p;
			count++;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String s = "";
		for (Product p : list) {
			s += p;
		}
		return s;
	}

	public String getHangThucPham() {
		String s = "";
		for (Product p : list) {
			if (p instanceof HangThucPham) {
				s += p + "\n";
			}
		}
		return s;
	}

	public String getHangDienMay() {
		String s = "";
		for (Product p : list) {
			if (p instanceof HangDienMay) {
				s += p + "\n";
			}
		}
		return s;
	}

	public String getHangSanhSu() {
		String s = "";
		for (Product p : list) {
			if (p instanceof HangSanhSu) {
				s += p + "\n";
			}
		}
		return s;
	}

	public String searchProduct(String tmp) {
		for (Product p1 : list) {
			if (p1.getMaHang().trim().equals(tmp)) {
				return p1.toString();
			}
		}
		return "Khong tim thay";
	}

//	public void sortName() {
//		for (int i = 0; i < count; i++) {
//			for (int j = i + 1; j < count; j++) {
//				if (list[i].getMaHang().compareTo(list[j].getMaHang()) > 0) {
//					Product tmp = list[i];
//					list[i] = list[j];
//					list[j] = tmp;
//				}
//			}
//		}
//	}

	public void sortName() {
		Arrays.sort(list, new Comparator<Product>() {
			public int compare(Product o1, Product o2) {
				return o1.getTenHang().compareToIgnoreCase(o2.getTenHang());
			}
		});
	}

	public void sortHangTonKho() {
		Arrays.sort(list, new Comparator<Product>() {
			public int compare(Product o1, Product o2) {
				return Integer.compare(o1.getSoLuong(), o2.getSoLuong());
			}
		});
	}

	public String getlistKhoBan() {
		String s = "";
		for (Product p : list) {
			if (p instanceof HangThucPham) {
				if (p.checkSell().equalsIgnoreCase("kho ban")) {
					s += p.toString();
				}
			}
			if (p instanceof HangDienMay) {
				if (p.checkSell().equalsIgnoreCase("khong danh gia")) {
					s += p.toString();
				}
			}
			if (p instanceof HangSanhSu) {
				if (p.checkSell().equalsIgnoreCase("ban cham")) {
					s += p.toString();
				}
			}
		}
		return s;
	}

	public int findPosition(String tmp) {
		for (int i = 0; i < count; i++) {
			if (list[i].getMaHang().equalsIgnoreCase(tmp)) {
				return i;
			}
		}
		return -1;
	}

	public boolean removeProduct(String tmp) {
		int pos = findPosition(tmp);
		if (pos != -1) {
			for (int i = pos; i < count - 1; i++) {
				list[i] = list[i + 1];
			}
			this.count--;
			return true;
		}
		return false;
	}

	public void updateInfo(String tmp, double price) {
		int pos = findPosition(tmp);
		if (pos != -1) {
			list[pos].setDonGia(price);
		}
	}
}
