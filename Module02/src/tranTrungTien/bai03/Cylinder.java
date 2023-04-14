package tranTrungTien.bai03;

public class Cylinder {
	private int radius;
	private int height;

	public Cylinder() {
		this.radius = 1;
		this.height = 1;
	}

	public Cylinder(int radius, int height) {
		setRadius(radius);
		setheight(height);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		if (radius <= 0) {
			this.radius = 1;
		} else {
			this.radius = radius;
		}
	}

	public int getheight() {
		return height;
	}

	public void setheight(int height) {
		if (height <= 0) {
			this.height = 1;
		} else {
			this.height = height;
		}
	}

	public double tinhDienTichXungQuanh() {
		double S = 2 * 3.14 * radius * height;
		return S;
	}

	public double tinhDienTichToanPhan() {
		double S = tinhDienTichXungQuanh() + (2 * 3.14 * radius * radius);
		return S;
	}

	public double tinhTheTich() {
		double V = 3.14 * radius * radius * height;
		return V;
	}

	@Override
	public String toString() {
		return String.format("ban kinh: %s, chieu cao: %s", radius, height);
	}

}
