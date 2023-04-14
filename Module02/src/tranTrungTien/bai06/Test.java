package tranTrungTien.bai06;

public class Test {

	public static void main(String[] args) {
		try {
			ThongTinDangKyXe xe1 = new ThongTinDangKyXe("Nguyen Thu Loan", "Future Neo", 35000000, 100);
			ThongTinDangKyXe xe2 = new ThongTinDangKyXe("Le Minh Tinh", "Ford Ranger", 250000000, 3000);
			ThongTinDangKyXe xe3 = new ThongTinDangKyXe("Nguyen Minh Triet", "SH-mode", 1000000000, 1500);
			System.out.println(String.format("%-20s%-13s%-15s%-15s%10s", "Ten chu xe", "Loai xe", "Dung tich",
					"Tri gia", "Thue phai nop"));
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println(xe1);
			System.out.println(xe2);
			System.out.println(xe3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
