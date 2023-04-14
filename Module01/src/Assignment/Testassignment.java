package Assignment;

import java.util.Scanner;

public class Testassignment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		Danhsachnhanvien dsnv = new Danhsachnhanvien();
		do {
			System.out.println("Menu chuc nang");
			System.out.println("1: Nhap danh sach nhan vien");
			System.out.println("2: Xuat danh sach nhan vien");
			System.out.println("3: Tim nhan vien theo ma");
			System.out.println("4: Xoa nhan vien theo ma");
			System.out.println("5: Cap nhat thong tin nhan vien");
			System.out.println("6: Tim kiem nhan vien theo luong");
			System.out.println("7: Sap xep nhan vien theo ten");
			System.out.println("8: Sap xep nhan vien theo thu nhap");
			System.out.println("9: Xuat 5 nhan vien co thu nhap cao nhat");
			System.out.println("0: Thoat");
			System.out.println("Chon chuc nang:");
			a = sc.nextInt();
			sc.nextLine();
			if (a == 1) {
				System.out.println("1:Nhap danh sach nhan vien");
				System.out.println("Nhap ten nhan vien:");
				sc = new Scanner(System.in);
				String hovaten = sc.nextLine();
				System.out.println("Nhap ma nhan vien:");
				sc = new Scanner(System.in);
				String manv = sc.nextLine();
				System.out.println("Nhap luong nhan vien: ");
				double luong = sc.nextDouble();
				Nhanvien nv = new Nhanvien(manv, hovaten, luong);
				dsnv.input(nv);
			} else if (a == 2) {
				System.out.println("2:Xuat danh sach nhan vien");
				System.out.println("Danh sach nhan vien");
				System.out.println(String.format("|%15s|%15s|%20s|%15s|", "Ten nhan vien", "Ma nhan vien",
						"Luong nhan vien", "Tien thue"));
				dsnv.output();
			} else if (a == 3) {
				System.out.println("3:Tim nhan vien theo ma");
				System.out.println("Nhap ma nhan vien: ");
				String manv = sc.nextLine();
				System.out.println("Ket qua" + dsnv.findnv(manv));

			} else if (a == 4) {
				System.out.println("4:Xoa nhan vien theo ma");
				System.out.println("Nhap ma nhan vien: ");
				String manv = sc.nextLine();
				Nhanvien nv = new Nhanvien(manv);
				System.out.println("Ket qua: " + dsnv.delete(nv));
			} else if (a == 5) {
				System.out.println("5:Cap nhat thong tin nhan vien");
				System.out.println("Nhap ma nhan vien can cap nhat:");
				sc = new Scanner(System.in);
				String manv = sc.nextLine();
//				Nhanvien nv=new Nhanvien(manv);
				sc = new Scanner(System.in);
				System.out.println("Nhap luong moi");
				double newluong = sc.nextDouble();
				dsnv.update(manv, newluong);
			} else if (a == 6) {
				System.out.println("6:Tim kiem nhan vien theo ten");
				System.out.println("Nhap ten nhan vien:");
				String hovaten = sc.nextLine();
				System.out
						.println(String.format("|%15s|%15s|%20s|", "Ten nhan vien", "Ma nhan vien", "Luong nhan vien"));
				dsnv.findname(hovaten);
			} else if (a == 7) {
				System.out.println("7:Sap xep nhan vien theo ten");
				dsnv.sortname();
				dsnv.output();
			} else if (a == 8) {
				System.out.println("8:Sap xep nhan vien theo thu nhap");
				dsnv.sortluong();
				dsnv.output();
			} else if (a == 9) {
				System.out.println("9:Xuat 5 nhan vien co thu nhap cao nhat");
				System.out.println(dsnv.maxluong());
			}
		} while (a != 0);

	}
}
