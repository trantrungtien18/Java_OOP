package tranTrungTien.bai01;

import java.text.DecimalFormat;

public class TestChuyenXe {

	public static double getTong(ChuyenXe[] dsXe) {
		double total = 0;
		for (ChuyenXe xe : dsXe) {
			total += xe.getDoanhThu();
		}
		return total;
	}

	public static double getTongDoanhThuNoiT(ChuyenXe[] dsXe) {
		double total = 0;
		for (ChuyenXe xe : dsXe) {
			if (xe instanceof ChuyenXeNoiThanh)
				total += xe.getDoanhThu();
		}
		return total;
	}

	public static double getTongDoanhThuNgoaiT(ChuyenXe[] dsXe) {
		double total = 0;
		for (ChuyenXe xe : dsXe) {
			if (xe instanceof ChuyenXeNgoaiThanh)
				total += xe.getDoanhThu();
		}
		return total;
	}

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		ChuyenXe[] dsXe = new ChuyenXe[4];
		dsXe[0] = new ChuyenXeNoiThanh("148", "BusDriver148", "148", 50000, 3, 20);
		dsXe[1] = new ChuyenXeNoiThanh("24", "BusDriver24", "24", 300000, 10, 50);
		dsXe[2] = new ChuyenXeNgoaiThanh("50", "BusDriver50", "50", 20000, "Lap Vo", 3);
		dsXe[3] = new ChuyenXeNgoaiThanh("10", "BusDriver10", "10", 30000, "An Giang", 4);
		System.out.println(String.format("|%-10s|%-20s|%-10s|%-20s|%-20s|%-20s|", "Ma chuyen", "Ho ten", "So xe",
				"Doanh thu", "So tuyen/Noi den", "So Km/So ngay"));
		for (ChuyenXe xe : dsXe) {
			System.out.println(xe);
		}
		System.out.println();
		System.out.println("Tong doanh thu: " + df.format(getTong(dsXe)));
		System.out.println("Tong doanh thu noi thanh: " + df.format(getTongDoanhThuNoiT(dsXe)));
		System.out.println("Tong doanh thu noi thanh: " + df.format(getTongDoanhThuNgoaiT(dsXe)));
	}

}
