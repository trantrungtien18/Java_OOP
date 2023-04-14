package tranTrungTien.bai05;

public class Test {

	public static void main(String[] args) {
		Triangle a = new Triangle(0, 0, 0);
		Triangle b = new Triangle(0, 0, 0);
		Triangle c = new Triangle(1, 5, 1);
		Triangle d = new Triangle(5, 5, 5);
		Triangle e = new Triangle(5, 9, 6);
		System.out.println(String.format("%5s|%5s|%5s|%20s|%10s|%15s", "ma", "mb", "mc", "Kieu tam giac", "Chu vi", "Dien tich"));
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
