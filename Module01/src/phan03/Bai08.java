package phan03;

import java.util.Scanner;

/**
 * Viết chương trình in ra số lần kí tự ‘a’ xuất hiện trong một chuỗi.
 * 
 * @author Trung Tien
 *
 */

public class Bai08 {

	public static int tinhSoLanXuatHien(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao chuoi a: ");
		String a = sc.nextLine();
		int result = tinhSoLanXuatHien(a);
		System.out.println("So lan xuat hien cua ky tu 'a': " + result);
	}

}
