package tranTrungTien.bai03;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		DanhSachSach list = new DanhSachSach();
		list.addBook(new SachGiaoKhoa("SGK01", LocalDate.of(2022, 12, 12), 20000, 10, "GD-VN", true));
		list.addBook(new SachGiaoKhoa("SGK02", LocalDate.of(2002, 12, 15), 30000, 15, "GD-VN", false));
		list.addBook(new SachThamKhao("STK01", LocalDate.of(2022, 12, 2), 50000, 10, "Kim Dong", 5.5));
		System.out.println(list);
		System.out.println("Tong giao dich Sach giao khoa: " + df.format(list.sumOfTotalSGK()));
		System.out.println("Tong giao dich Sach tham khao: " + df.format(list.sumOfTotalSTK()));
		System.out.println("Max giao dich: " + df.format(list.findMaxTotal()));
		System.out.print("Nhap vao ten nha xuat ban muon tim sach: ");
		String NXB = sc.nextLine();
		System.out.println(list.searchSGKTheoNXB(NXB).toString());
	}
}
