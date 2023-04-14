package phan03;

import java.util.Scanner;

/**
 * Viết chương trình cho nhập vào mảng các chuỗi, kiểm tra xem có chuỗi nào đó
 * trong mảng không.
 * 
 * @author Trung Tien
 *
 */

public class Bai16 {

	public static void nhapMang(String a[], int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap gia tri cho mang: ");
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap chuoi thu " + i + ": ");
			a[i] = sc.nextLine();
		}
	}

	public static void xuatMang(String a[], int n) {
		System.out.println("Xuat mang: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + "\n");
		}
	}

	public static boolean searchString(String[] a, int n, String s) {
		for (int j = 0; j < n; j++) {
			if (a[j].trim().equals(s)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhap vao so phan tu mot mang: ");
		n = sc.nextInt();
		String[] a = new String[n];
		nhapMang(a, n);
		xuatMang(a, n);
		System.out.print("Nhap vao chuoi muon tim: ");
		sc = new Scanner(System.in);
		String s = sc.nextLine();
		if (searchString(a, n, s))
			System.out.println("Tim thay");
		else
			System.out.println("Khong tim thay");
	}

}
