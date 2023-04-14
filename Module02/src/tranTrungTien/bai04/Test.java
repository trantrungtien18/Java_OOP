package tranTrungTien.bai04;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ma3;
		String name3;
		double diem3LT;
		double diem3TH;
		DiemSinhVien sv1 = new DiemSinhVien(11111, "Nguyen Thanh An", 7, 8);
		DiemSinhVien sv2 = new DiemSinhVien();
		DiemSinhVien sv3;

		System.out.println("Nhap MaSV cho sv3: ");
		ma3 = sc.nextInt();
		sc = new Scanner(System.in);
		System.out.println("Nhap ten cho sv3: ");
		name3 = sc.nextLine();
		sc = new Scanner(System.in);
		System.out.println("Nhap diem LT: ");
		diem3LT = sc.nextDouble();
		System.out.println("Nhap diem TH:");
		diem3TH = sc.nextDouble();
		sv3 = new DiemSinhVien(ma3, name3, diem3LT, diem3TH);

		System.out.println("Danh sach sinh vien:");
		System.out.println(String.format("%-10s%-20s%-10s%-10s%-10s", "MaSV", "HoTen", "DiemLT", "DiemTH", "DiemTB"));
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
	}

}
