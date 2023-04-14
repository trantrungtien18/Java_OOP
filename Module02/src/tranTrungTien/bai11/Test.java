package tranTrungTien.bai11;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
//		SoTietKiem[] tk = new SoTietKiem[2];
//		tk[0] = new SoTietKiem("111", LocalDate.of(2020, 5, 1), 1000000, 3, 0.005);
//		tk[1] = new SoTietKiem("112", LocalDate.of(2019, 12, 10), 10000000, 6, 0.006);
		KhachHang kh = new KhachHang("KH001", "Nguyen Van An", 2);
		kh.themSoTietKiem("111", LocalDate.of(2020, 5, 1), 1000000, 3, 0.005);
		kh.themSoTietKiem("112", LocalDate.of(2019, 12, 10), 10000000, 6, 0.006);
		System.out.println(kh);
	}

}
