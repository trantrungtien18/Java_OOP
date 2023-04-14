package tranTrungTien.bai08;

public class Polygon extends Shape {
	public String draw() {
		return "Ve da giac";
	}

	public String arase() {
		return "Xoa da giac";
	}

	public String move(int x, int y) {
		return "Di chuyen hinh tu vi tri " + x + " sang vi tri " + y;
	}
}
