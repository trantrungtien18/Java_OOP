package test;

public class Test {

	public static void main(String[] args) {
		DanhSachSinhVien ds = new DanhSachSinhVien();
		ds.themSV(new SinhVien(5, "nguyen a", 5));
		ds.themSV(new SinhVien(2, "nguyen van a", 4));
		ds.themSV(new SinhVien(1, "nguyen thi c", 3));
		ds.themSV(new SinhVien(3, "nguyen thi c", 1991));
		System.out.println(ds);

//		if (ds.xoaSV(40)) {
//			System.out.println("Xoa thanh cong, sau khi xoa:");
//			System.out.println(ds);
//		}
//		else
//			System.out.println("Khong co ma de xoa"
//					+ "");
		System.out.println(ds.sapXepTheoMaTangDan());
//		System.out.println("Danh sach sau khi sap");
//		System.out.println(ds);
//		DanhSachSinhVien kq= ds.tim("van");
//		if (kq.getLength()==0)
//			System.out.println("Khong tim thay");
//		else {
//			System.out.println("Tim thay. Danh sach la:");
//			System.out.println(kq);
//		}
//		SinhVien kq = ds.tim(20);
//		if (kq == null)
//			System.out.println("Khong tim thay");
//		else {
//			System.out.println("Da tim thay");
//			System.out.println(kq);
//		}
//		boolean k = ds.sua(3, "Nguyen Van A", 1990);
//		if (!k)
//			System.out.println("khong co ma can sua");
//		else {
//			System.out.println("Sau khi sua");
//			System.out.println(ds);
//		}

//		ds.xoaSVTheoNamSinh(1990);
//		System.out.println("sau khi xoa");
//		System.out.println(ds);
	}

}
