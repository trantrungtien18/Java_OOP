package phan03;

import java.util.Scanner;

/**
 * Viết chương trình nhập vào M và N, xuất ra các hình sau (dùng cấu trúc lặp):
 * 
 * @param args
 */

public class Bai17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = 0;
		System.out.print("Nhap M: ");
		int m = sc.nextInt();
		System.out.print("Nhap N: ");
		int n = sc.nextInt();
		System.out.println();
		for (int i = m; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//
		for (int i = n; i >= m; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		//
		System.out.println();
		for (int i = m; i <= n; i++, k = 0) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			while (k != 2 * i - 1) {
				System.out.print("* ");
				++k;
			}
			System.out.println();
		}
	}

}
