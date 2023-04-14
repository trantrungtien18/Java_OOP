package tranTrungTien.bai12;

import java.util.Scanner;

public class Test {

	public static CD inputCD() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao MaCD: ");
		int macd = sc.nextInt();
		System.out.print("Nhap vao TuaCD: ");
		sc = new Scanner(System.in);
		String tuacd = sc.nextLine();
		System.out.print("Nhap vao so luong bai hat: ");
		int sobaihat = sc.nextInt();
		System.out.print("Nhap vao gia CD: ");
		double giaCD = sc.nextDouble();
		CD cd = new CD(macd, tuacd, sobaihat, giaCD);
		return cd;
	}

	public static void main(String[] args) {
		CDList ds = new CDList(0);
		Scanner sc = new Scanner(System.in);
		int tmp;
		int key;
		//
		do {
			System.out.println("\n---Menu---");
			System.out.println("1: Khoi tao lop CDList");
			System.out.println("2: Them CD vao danh sach");
			System.out.println("3: Tinh so luong CD trong danh sach");
			System.out.println("4: Xoa CD theo MaCD");
			System.out.println("5: Tong gia thanh cac CD");
			System.out.println("6: Tim kiem theo MaCD");
			System.out.println("7: Sap xep theo Gia thanh");
			System.out.println("8: Sap xep theo TuaCD");
			System.out.println("9: Xuat CDList");
			System.out.println("0: Thoat");
			System.out.print("Chon cong viec: ");
			key = sc.nextInt();
			switch (key) {
			case 1: {
				System.out.println("Nhap vao so luong phan tu: ");
				int n = sc.nextInt();
				ds = new CDList(n);
				break;
			}
			case 2: {
				try {
					if (ds.themCD(inputCD()))
						System.out.println("Da them thanh cong\n");
					else
						System.out.println("Trung ma khong the them\n");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			case 3: {
				System.out.println("So luong cua CDList: " + ds.getSoLuongCD());
				break;
			}
			case 4: {
				System.out.print("Nhap vao MaCD muon xoa: ");
				tmp = sc.nextInt();
				ds.xoaCD(tmp);
				break;
			}
			case 5: {
				System.out.println("Tong gia thanh cua CD: " + ds.sumOfPrice());
				break;
			}
			case 6: {
				System.out.print("Nhap vao MaCD muon tim: ");
				tmp = sc.nextInt();
				ds.searchID(tmp);
				break;
			}
			case 7: {
				ds.sortPrice();
				break;
			}
			case 8: {
				ds.sortName();
				break;
			}
			case 9: {
				System.out.println("Danh sach cac CD trong List:");
				System.out.println(ds);
				break;
			}
			default:
				break;
			}
		} while (key != 0);
	}
}
