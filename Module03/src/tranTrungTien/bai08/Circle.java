package tranTrungTien.bai08;

public class Circle extends Shape {
	public String draw() {
		return "Ve hinh tron";
	}

	public String arase() {
		return "Xoa hinh tron";
	}

	public String move(int x, int y) {
		return "Di chuyen hinh tu vi tri " + x + " sang vi tri " + y;
	}
}
