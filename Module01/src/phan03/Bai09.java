package phan03;

import java.util.Scanner;

public class Bai09 {

	public static String[] getChuoi(String s) {
		String ss = s.trim();
		while (ss.contains("  "))
			ss = ss.replaceAll("  ", " ");
		String[] kq = ss.split(" ");
		return kq;
	}

	public static void inHoa(String s) {
		String[] a = getChuoi(s);
		char upCase;
		for (int i = 0; i < a.length; i++) {
			upCase = String.valueOf(a[i]).toUpperCase().charAt(0);
			System.out.println(upCase);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao chuoi a: ");
		String s = sc.nextLine();

		System.out.println("ket qua sau khi tach chuoi: ");
//		String[] a = getChuoi(s);
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		
		inHoa(s);
	}

}
