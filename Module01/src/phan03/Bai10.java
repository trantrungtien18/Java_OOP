package phan03;

import java.util.Scanner;

/**
 * Viết chương trình để đếm số lượng ký tự là số có trong chuỗi s. Chuỗi s được
 * nhập từ bàn phím
 * 
 * @author Trung Tien
 *
 */

public class Bai10 {

	public static int demSoLuong(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao chuoi a: ");
		String a = sc.nextLine();
		int result = demSoLuong(a);
		System.out.println("So luong chu so trong chuoi " + "'" + a + "'" + " : " + result);
	}

}
