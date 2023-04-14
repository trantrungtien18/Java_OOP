package phan03;

import java.util.Scanner;

/**
 * Viết chương trình cho nhập vào 1 mảng và kiểm tra xem có giá trị k nào đó hay
 * không.
 * 
 * @author Trung Tien
 *
 */

public class Bai14 {

	public static void nhapMang(int a[], int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap gia tri cho mang: ");
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap phan tu thu " + i + ": ");
			a[i] = sc.nextInt();
		}
	}

	public static void xuatMang(int a[], int n) {
		System.out.println("Xuat mang: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + "\t");
		}
	}

	public static boolean search(int a[], int n, int x) {
		for (int j = 0; j < n; j++) {
			if (a[j] == x) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap vao so phan tu mot mang: ");
		n = sc.nextInt();
		int a[] = new int[n];
		nhapMang(a, n);
		xuatMang(a, n);
		System.out.println("\nNhap vao so muon tim: ");
		int x = sc.nextInt();
		if (search(a, n, x)) {
			System.out.println("Tim thay!!");
		} else {
			System.out.println("Khong tim thay!!");
		}
	}

}
