package tranTrungTien.bai06;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachHangHoa list = new DanhSachHangHoa();
		list.addProduct(
				new HangThucPham("001", "Gao", 10000, 10, "VN", LocalDate.of(2023, 1, 30), LocalDate.of(2023, 5, 20)));
		list.addProduct(new HangDienMay("002", "Laptop", 500000, 5, 5, 200));
		list.addProduct(new HangSanhSu("003", "Chau hoa", 1000, 50, "Bat Trang", LocalDate.now()));
		list.addProduct(
				new HangThucPham("004", "Khoai", 5000, 20, "VN", LocalDate.of(2023, 1, 30), LocalDate.of(2023, 5, 20)));
		int key = 0;
		do {
			System.out.println("--Menu--");
			System.out.println("1. Lay danh sach Hang thuc pham");
			System.out.println("2. Lay danh sach Hang dien may");
			System.out.println("3. Lay danh sach Hang sanh su");
			System.out.println("4. Xuat toan bo danh sach");
			System.out.println("5. Tim kiem hang hoa theo ma hang");
			System.out.println("6. Sap xep hang hoa theo ten tang dan");
			System.out.println("7. Sap xep hang hoa theo so luong ton giam dan");
			System.out.println("8. Lay danh sach cac loai hang thuc pham kho ban");
			System.out.println("9. Xoa hang hoa khi biet ma hang");
			System.out.println("10. Sua thong tin khi biet ma hang");
			System.out.println("0. Thoat!");
			System.out.println("Chon cong viec: ");
			key = sc.nextInt();
			switch (key) {
			case 1: {
				System.out.println("Danh sach Hang thuc pham:");
				System.out.println(list.getHangThucPham());
				break;
			}
			case 2: {
				System.out.println("Danh sach Hang dien may:");
				System.out.println(list.getHangDienMay());
				break;
			}
			case 3: {
				System.out.println("Danh sach Hang sanh su:");
				System.out.println(list.getHangSanhSu());
				break;
			}
			case 4: {
				System.out.println("Xuat danh sach:");
				System.out.println(list);
				break;
			}
			case 5: {
				sc = new Scanner(System.in);
				System.out.print("Nhap ma hang muon tim:");
				String id = sc.nextLine();
				System.out.println(list.searchProduct(id));
				break;
			}
			case 6: {
				System.out.println("Sap xep hang hoa theo ten tang dan:");
				list.sortName();
				break;
			}
			case 7: {
				System.out.println("Sap xep hang hoa theo so luong ton kho giam dan:");
				list.sortHangTonKho();
				break;
			}
			case 8: {
				System.out.println("Xuat danh sach cac loai Hang thuc pham kho ban:");
				System.out.println(list.getlistKhoBan());
				break;
			}
			case 9: {
				sc = new Scanner(System.in);
				System.out.print("Nhap ma hang hoa muon xoa:");
				String id = sc.nextLine();
				list.removeProduct(id);
				break;
			}
			case 10: {
				sc = new Scanner(System.in);
				System.out.print("Nhap ma hang muon sua: ");
				String id = sc.nextLine();
				System.out.print("Nhap don gia muon sua: ");
				double price = sc.nextDouble();
				list.updateInfo(id, price);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + key);
			}
		} while (key != 0);
//		
//		list.sortHangTonKho();
//		System.out.println(list);
//		System.out.print("Nhap vao ma hang can tim: ");
//		String id1 = sc.nextLine();
//		System.out.println(list.searchProduct(id1));
//		System.out.println("Danh sach hang kho ban:\n");
//		System.out.println(list.getlistKhoBan());
//		sc = new Scanner(System.in);
//		System.out.print("Nhap vao ma hang can sua: ");
//		String id2 = sc.nextLine();
//		System.out.print("Nhap vao gia muon thay: ");
//		double price = sc.nextDouble();
//		System.out.println("Danh sach sau khi xoa theo ma: " + id2);
//		list.removeProduct(id2);
//		System.out.println(list);
//		list.updateInfo(id2, price);
//		System.out.println(list);
	}

}
