package tranTrungTien.bai02;

public class Test {

	public static void main(String[] args) {
		Point a = new Point();
		Point b = new Point(1, 5, "B");
		Point c = new Point(3, 7, "C");
		System.out.println("Toa do: ");
		System.out.println(a);
		System.out.println(a.negate());
		System.out.println("Khoang cach: " + a.getDistace());
		System.out.println("\nToa do diem B: ");
		System.out.println(b);
		System.out.println("Toa do doi xung diem B: " + b.negate());
		System.out.println("Khoang cach: " + b.getDistace());
		System.out.println(c);
		System.out.println("Khoang cach giua B va C:");
		System.out.println(b.getDistace(c));
	}

}
