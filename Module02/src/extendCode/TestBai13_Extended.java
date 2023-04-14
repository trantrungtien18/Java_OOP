package extendCode;

import java.util.Scanner;

public class TestBai13_Extended {

	public static CongNhan add1CN() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao Ho Cong nhan: ");
		String hoCN = sc.nextLine();
		System.out.print("Nhap vao Ten Cong nhan: ");
		String tenCN = sc.nextLine();
		System.out.print("Nhap vao so luong san pham: ");
		int soSP = sc.nextInt();
		CongNhan cn = new CongNhan(hoCN, tenCN, soSP);
		return cn;
	}

	public static void main(String[] args) {
		DanhSachCongNhan listCN = new DanhSachCongNhan(0);
		Scanner sc = new Scanner(System.in);
		int key;
		do {
			System.out.println("1. Khoi tao danh sach Cong nhan");
			System.out.println("2. Them Cong nhan");
			System.out.println("3. In danh sach Cong nhan");
			System.out.println("4. In danh sach Cong nhan co tren 200 san pham");
			System.out.println("5. Sap xep Cong nhan theo so luong san pham giam dan");
			System.out.println("0. Thoat");
			System.out.print("Nhap vao cong viec: ");
			key = sc.nextInt();
			switch (key) {
			case 1: {
				System.out.print("Nhap vao so luong Cong nhan: ");
				int n = sc.nextInt();
				listCN = new DanhSachCongNhan(n);
				break;
			}
			case 2: {
				listCN.addCN(add1CN());
				break;
			}
			case 3: {
				System.out.println("Danh sach cong nhan:");
				System.out.println(listCN);
				break;
			}
			case 4: {
				System.out.println(listCN.getCN200SP());
				break;
			}
			case 5: {
				listCN.sortCongNhan();
				break;
			}
			default:
				break;
			}
		} while (key != 0);
	}

}
