package phan03;

import java.util.Scanner;

public class Bai15 {

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

	public static void max_min(int a[], int n) {
		int max = a[0];
		int min = a[0];
		for (int i = 0; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("\nMax: " + max + "\tMin: " + min);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap vao so phan tu mot mang: ");
		n = sc.nextInt();
		int a[] = new int[n];
		nhapMang(a, n);
		xuatMang(a, n);
		max_min(a, n);

	}

}
