package phan03;

import java.util.Scanner;

/**
 * Viết chương trình kiểm tra số nhập vào có phải là số nguyên tố hay không.
 * 
 * @author Trung Tien
 *
 */

public class Bai06 {

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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao gia tri x: ");
		int x = sc.nextInt();
		boolean tmp = isSoNguyenTo(x);
		if (tmp)
			System.out.println(x + " la so nguyen to");
		else
			System.out.println(x + " khong la so nguyen to");
	}

}
