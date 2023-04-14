package phan03;

import java.util.Scanner;

/**
 * Viết chương trình giải phương trình bậc 1.
 * 
 * @author Trung Tien
 *
 */

public class Bai04 {

	public static double giaiPhuongTrinhB1(int a, int b) throws Exception {
		double x;
		if (a == 0 && b == 0) {
			throw new Exception("Phuong trinh vo so nghiem");
		} else if (a == 0 && b != 0) {
			throw new Exception("Phuong trinh vo nghiem");
		} else {
			x = -b / (double) a;
		}
		return x;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		try {
			System.out.print("Nhap vao gia tri a: ");
			a = sc.nextInt();
			System.out.print("Nhap vao gia tri b: ");
			b = sc.nextInt();
			double result = giaiPhuongTrinhB1(a, b);
			System.out.println("Nghiem cua phuong trinh la: x = " + result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}
}
