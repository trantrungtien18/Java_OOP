package tranTrungTien.bai08;

public class Test {

	public static void main(String[] args) {
		Shape[] s = new Shape[5];
		s[0] = new Circle();
		s[1] = new Quad();
		s[2] = new Retangle();
		s[3] = new Triangle();
		s[4] = new Polygon();
//		for (Shape shape : s) {
//			System.out.println(shape.draw());
//		}
		Drawing d = new Drawing();
		System.out.println(d.drawShape(s[0]));
		System.out.println(d.drawShape(s[1]));
		System.out.println(d.drawShape(s[2]));
		System.out.println(d.drawShape(s[3]));
		System.out.println(d.drawShape(s[4]));
	}
}
