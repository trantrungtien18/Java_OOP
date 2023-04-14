package tranTrungTien.bai02;

import java.time.LocalDate;

public class TestThuVien {

	public static void main(String[] args) {
		Book[] tv = new Book[3];
		tv[0] = new SachGiaoKhoa("SGK01", LocalDate.of(2022, 12, 12), 20000, 10, "GD-VN", "moi");
		tv[1] = new SachGiaoKhoa("SGK02", LocalDate.of(2002, 12, 15), 30000, 15, "GD-VN", "cu");
		tv[2] = new SachThamKhao("STK01", LocalDate.of(2022, 12, 2), 50000, 100, "Kim Dong", 5.5);
		System.out.println(String.format("|%-10s|%-15s|%-20s|%-10s|%-20s|%-20s|%-20s|", "Ma sach", "Ngay nhap",
				"Don gia", "So luong", "Nha san xuat", "Tinh trang/Thue", "Thanh tien"));
		for (Book sach : tv)
			System.out.println(sach);
	}

}