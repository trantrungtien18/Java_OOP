package phan03;

import java.util.Scanner;

/**
 * Viết chương trình tìm USCLN của 2 số nhập vào
 * 
 * @author Trung Tien
 *
 */

public class Bai05 {

	public static int timUCLN(int a, int b) {
		int gcd = 1;
		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("Nhap vao a: ");
		a = sc.nextInt();
		System.out.print("Nhap vao b: ");
		b = sc.nextInt();
		System.out.println("UCLN: " + timUCLN(a, b));
	}
}
