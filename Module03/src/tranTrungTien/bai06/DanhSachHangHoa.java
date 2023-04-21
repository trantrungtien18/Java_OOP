package tranTrungTien.bai06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DanhSachHangHoa {
	private List<Product> list;

	public DanhSachHangHoa() {
		this.list = new ArrayList<Product>();
	}

	public boolean addProduct(Product p) {
		if (list.contains(p)) {
			return false;
		}
		list.add(p);
		return true;
	}

	public String getTitle() {
		return String.format("|%-10s|%-20s|%-15s|%-10s|%20s|%20s|%15s|%15s|%15s|%15s|%15s|\n", "Ma hang", "Ten hang",
				"Don gia", "So luong", "Nha cung cap", "Ngay SX", "Ngay HH", "TG bao hanh", "Cong suat", "Nha san xuat",
				"Ngay nhap kho");
	}

	@Override
	public String toString() {
		String s = getTitle();
		for (Product p : list) {
			s += p + "\n";
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

	public Product searchProduct(String ma) {
		for (Product curProduct : list) {
			if (curProduct.getMaHang().trim().equals(ma)) {
				return curProduct;
			}
		}
		return null;
	}

	public void sortName() {
		Collections.sort(list, new Comparator<Product>() {
			public int compare(Product product1, Product product2) {
				return product1.getTenHang().compareToIgnoreCase(product2.getTenHang());
			}
		});
	}

	public void sortHangTonKho() {
		Collections.sort(list, new Comparator<Product>() {
			public int compare(Product product1, Product product2) {
				return Integer.compare(product1.getSoLuong(), product2.getSoLuong());
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

	public boolean removeProduct(String id) {
		return list.removeIf(product -> product.getMaHang().equalsIgnoreCase(id));
	}

	public boolean updateInfo(String id, double price) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getMaHang().trim().equalsIgnoreCase(id)) {
				list.get(i).setDonGia(price);
				return true;
			}
		}
		return false;
	}
}
