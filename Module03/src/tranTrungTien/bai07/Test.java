package tranTrungTien.bai07;

import java.util.Scanner;

public class Test {

	public static Person inputPerson(int key) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao ten: ");
		String name = sc.nextLine();
		System.out.print("Nhap vao dia chi: ");
		sc = new Scanner(System.in);
		String address = sc.nextLine();
		if (key == 1) {
			sc = new Scanner(System.in);
			System.out.print("Nhap vao diem 1: ");
			double diem1 = sc.nextDouble();
			System.out.print("Nhap vao diem 2: ");
			double diem2 = sc.nextDouble();
			Person sv = new Student(name, address, diem1, diem2);
			return sv;
		} else if (key == 2) {
			System.out.print("Nhap vao he so luong: ");
			double hsLuong = sc.nextDouble();
			Person emp = new Employee(name, address, hsLuong);
			return emp;
		} else {
			sc = new Scanner(System.in);
			System.out.print("Nhap vao ten cong ty: ");
			String companyName = sc.nextLine();
			sc = new Scanner(System.in);
			System.out.print("Nhap vao tri gia hoa don: ");
			double triGiaHoaDon = sc.nextDouble();
			Person kh = new Customer(name, address, companyName, triGiaHoaDon);
			return kh;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key = 0;
		Management list = new Management();
		do {
			System.out.println("---Menu---");
			System.out.println("1. Them sinh vien");
			System.out.println("2. Them nhan vien");
			System.out.println("3. Them khach hang");
			System.out.println("4. Xuat danh sach");
			System.out.println("5. Xoa danh sach theo ten");
			System.out.println("6. Sap xep theo ten");
			System.out.println("7. Cap nhat lai dai chi");
			System.out.println("0. Thoat!");
			System.out.print("Chon cong viec: ");
			key = sc.nextInt();
			switch (key) {
			case 1: {
				Person p = inputPerson(key);
				list.addPerson(p);
				break;
			}
			case 2: {
				Person p = inputPerson(key);
				list.addPerson(p);
				break;
			}
			case 3: {
				Person p = inputPerson(key);
				list.addPerson(p);
				break;
			}
			case 4: {
				System.out.println("Xuat danh sach: ");
				System.out.println(list.toString());
				break;
			}
			case 5: {
				System.out.print("Nhap ten muon xoa: ");
				sc = new Scanner(System.in);
				String ten = sc.nextLine();
				boolean result = list.delPerson(ten);
				if (result)
					System.out.println("Da xoa thanh cong!");
				else
					System.out.println("Khong tim thay ten can xoa (hoac xoa khong thanh cong)!");
				break;
			}
			case 6: {
				list.sortTheoTen();
				break;
			}
			case 7: {
				sc = new Scanner(System.in);
				String ten = sc.nextLine();
				sc = new Scanner(System.in);
				String newaddress = sc.nextLine();
				list.update(ten, newaddress);
				break;
			}
			case 0: {
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + key);
			}
		} while (key != 0);

	}
}
