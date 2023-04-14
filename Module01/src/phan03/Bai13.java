package phan03;

/**
 * Viết chương trình in ra tổng của 10 số chẵn đầu tiên.
 * 
 * @author Trung Tien
 *
 */

public class Bai13 {

	public static int tinhTongChan() {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int result = tinhTongChan();
		System.out.println("Tong cua 10 so chan dau tien: " + result);
	}

}
