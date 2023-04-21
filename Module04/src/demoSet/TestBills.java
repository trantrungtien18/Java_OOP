package demoSet;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class TestBills {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		DanhSachGiaoDich list = new DanhSachGiaoDich();
		list.addGiaoDich(new GiaoDichVang("V1", LocalDate.of(2022, 2, 10), 1000000, 3, "A18"));
		list.addGiaoDich(new GiaoDichVang("V2", LocalDate.of(2022, 5, 22), 1000000001, 1, "V24"));
		list.addGiaoDich(new GiaoDichTienTe("TT1", LocalDate.of(2022, 10, 23), 2000, 5, 2.4, "USD"));
		list.addGiaoDich(new GiaoDichTienTe("TT2", LocalDate.of(2022, 6, 12), 500000, 2, 0.7, "Euro"));
		System.out.println(list);
		System.out.println("Tong so luong giao dich vang: " + list.tinhTongGDVang());
		System.out.println("Tong so luong giao dich tien te: " + list.tinhTongGDTien());
		System.out.println("Trung binh thanh tien giao dich tien te: " + df.format(list.tinhTrungBinhThanhTien()));
		System.out.println("So giao dich tren 1 ty: \n" + list.layGDTren1Ty().toString());
	}

}
