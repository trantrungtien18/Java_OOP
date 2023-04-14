package tranTrungTien.bai08;

public class Triangle extends Shape {
	public String draw() {
		return "Ve tam giac";
	}

	public String arase() {
		return "Xoa tam giac";
	}

	public String move(int x, int y) {
		return "Di chuyen hinh tu vi tri " + x + " sang vi tri " + y;
	}
}
