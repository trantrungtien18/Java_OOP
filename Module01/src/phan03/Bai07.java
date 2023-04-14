package phan03;

import java.util.Scanner;

/**
 * Tính tổng các số nguyên tố nhỏ hơn N.
 * 
 * @author Trung Tien
 *
 */

public class Bai07 {

	public static boolean isSoNguyenTo(int x) {
		int tmp = 0;
		if (x < 2) {
			return false;
		}
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				tmp++;
			}
		}
		if (tmp == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static int tinhTongSNT(int n) {
		int sum = 0;
		for (int i = 2; i < n; i++) {
			if (isSoNguyenTo(i))
				sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao n: ");
		int n = sc.nextInt();
		int result = tinhTongSNT(n);
		System.out.println("Tong cac SNT trong khoang " + n + " la: " + result);
	}

}
