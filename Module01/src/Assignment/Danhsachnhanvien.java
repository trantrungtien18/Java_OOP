package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Danhsachnhanvien {
	private ArrayList<Nhanvien> Danhsach;

	public Danhsachnhanvien() {
		this.Danhsach = new ArrayList<Nhanvien>();
	}

//	public Danhsachnhanvien(ArrayList<Nhanvien> danhsach) {
//		this.Danhsach = danhsach;
//	}

	public void input(Nhanvien nv) {
		this.Danhsach.add(nv);
	}

	public void output() {
		for (Nhanvien nhanvien : Danhsach) {
			System.out.println(nhanvien);
		}
	}

	public String findnv(String mnv) {
		for (Nhanvien nhanvien : Danhsach) {
			if (nhanvien.getManv().equalsIgnoreCase(mnv)) {
				return nhanvien.toString();
			}
		}
		return "Khong tim thay";

	}

	public boolean delete(Nhanvien nv) {
		return this.Danhsach.remove(nv);
	}

	public String findname(String ten) {
		for (Nhanvien nhanvien : Danhsach) {
			if (nhanvien.getHovaten().equalsIgnoreCase(ten)) {
				System.out.println(nhanvien);
			}
		}
		return "Khong tim thay";
	}

	public boolean update(String mnv, double newluong) {
		for (int i = 0; i < Danhsach.size(); i++) {
			if (!(findnv(mnv).equalsIgnoreCase("khong tim thay"))) {
				Danhsach.get(i).setLuong(newluong);
				return true;
			}
		}
		return false;
	}

	public void sortname() {
		Collections.sort(this.Danhsach, new Comparator<Nhanvien>() {
			@Override
			public int compare(Nhanvien nv1, Nhanvien nv2) {

				return nv1.getHovaten().compareToIgnoreCase(nv2.getHovaten());
			}
		});
	}

	public void sortluong() {
		Collections.sort(this.Danhsach, new Comparator<Nhanvien>() {

			@Override
			public int compare(Nhanvien nv1, Nhanvien nv2) {
				if (nv1.getLuong() > nv2.getLuong()) {
					return -1;
				} else if (nv1.getLuong() < nv2.getLuong()) {
					return 0;
				} else {
					return 0;
				}
			}

		});
	}

	public String maxluong() {
		String s = "";
		for (int i = 0; i < 5; i++) {
			s += Danhsach.get(i).toString() + "\n";
		}
		return s;
	}

//	public void sortmaxLuong() {
//		double maxluong=0;
//		Collections.sort(this.Danhsach, new Comparator<Nhanvien>() {
//			@Override
//			public int compare(Nhanvien nv1, Nhanvien nv2) {
//				for (int i = 0; i < 5; i++) {
//					if (nv1.getLuong() > nv2.getLuong()) {
//						
//					}
//				}
//				return ;
//			}
//
//		});
//	}
}
