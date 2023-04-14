package phan03;

import java.util.Scanner;

/**
 * Viết chương trình nhập vào số nguyên n và thực hiện: Xuất ra màn hình n số
 * đầu tiên của chuỗi Fibonaci (có hai giá trị đầu là 1 và 1).
 * 
 * @author Trung Tien
 *
 */

public class Bai11 {

	public static int fibonacci(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return (fibonacci(n - 1) + fibonacci(n - 2));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao gia tri n: ");
		int n = sc.nextInt();
		int f = 1;
		System.out.println(n + " so dau tien day fibonacci: ");
		for (int i = 1; i <= n; i++) {
			System.out.println(fibonacci(f));
			f++;
		}
	}

}
