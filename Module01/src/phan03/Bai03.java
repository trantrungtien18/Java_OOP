package phan03;

import java.util.Scanner;

/**
 * Viết chương trình in ra tổng 1+3+5+…+n nếu n là số lẻ, 2+4+6+…+n nếu n là số
 * chẵn
 * 
 * @author Trung Tien
 *
 */

public class Bai03 {

	public static final int getSum(int x, int y) {
		return x + y;
	}

	public static int tinhTong(int n) {
		int sum = 0;
		if (n % 2 == 0) {
			for (int i = 2; i <= n; i += 2) {
				sum += i;
			}
		} else {
			for (int i = 0; i <= n; i++) {
				if (i % 2 != 0)
					sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao gia tri n: ");
		int n = sc.nextInt();
		int result = tinhTong(n);
		System.out.println(result);
	}
}
