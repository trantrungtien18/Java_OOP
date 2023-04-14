package tranTrungTien.bai07;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {
		try {
			HangThucPham tp1 = new HangThucPham("001", "Gao", 7100000, LocalDate.of(2018, 7, 10),
					LocalDate.of(2023, 7, 10));
			HangThucPham tp2 = new HangThucPham("002", "Mi", 5000, LocalDate.of(2018, 3, 1), LocalDate.of(2023, 9, 1));
			HangThucPham tp3 = new HangThucPham("003", "Nuoc", 10000, LocalDate.of(2017, 3, 1),
					LocalDate.of(2022, 12, 1));
			System.out.println(String.format("%-10s%-26s%-24s%-31s%-25s%-20s", "Ma_Hang", "Ten_Hang", "Don_Gia",
					"Ngay_San_Xuat", "Ngay_Het_Han", "Ghi_chu"));
			System.out.println(
					"----------------------------------------------------------------------------------------------------------------------------------");
			System.out.println(tp1);
			System.out.println(tp2);
			System.out.println(tp3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}