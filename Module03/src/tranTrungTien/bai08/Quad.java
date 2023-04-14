package tranTrungTien.bai08;

public class Quad extends Shape {
	public String draw() {
		return "Ve tu giac";
	}

	public String arase() {
		return "Xoa tu giac";
	}

	public String move(int x, int y) {
		return "Di chuyen hinh tu vi tri " + x + " sang vi tri " + y;
	}
}
