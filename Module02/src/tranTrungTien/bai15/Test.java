package tranTrungTien.bai15;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		DanhSachHocVien ds = new DanhSachHocVien(3);
		ds.addHV("Nguyễn Văn A", LocalDate.of(2003, 5, 16), 7, 7, 7, 7, 7);
		ds.addHV("Nguyễn Văn B", LocalDate.of(2003, 3, 3), 8, 9, 7, 10, 6);
		ds.addHV("Nguyễn Văn C", LocalDate.of(2003, 12, 9), 8, 9, 7, 10, 5);
		System.out.println("Danh sach hoc vien:");
		System.out.println(ds);
	}

}
