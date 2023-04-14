package tranTrungTien.bai08;

public class Retangle extends Quad {
	public String draw() {
		return "Ve hinh chu nhat";
	}

	public String arase() {
		return "Xoa hinh chu nhat";
	}

	public String move(int x, int y) {
		return "Di chuyen hinh tu vi tri " + x + " sang vi tri " + y;
	}
}
