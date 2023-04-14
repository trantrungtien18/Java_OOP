package phan03;

/**
 * Viết chương trình in ra những số lẻ từ 1 đến 99.
 * 
 * @author Trung Tien
 *
 */

public class Bai12 {

	public static void inSoLe() {
		for (int i = 1; i <= 99; i++) {
			if (i % 2 != 0) {
				System.out.printf("%d  ", i);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("So le tu 1-99: ");
		inSoLe();
	}

}
