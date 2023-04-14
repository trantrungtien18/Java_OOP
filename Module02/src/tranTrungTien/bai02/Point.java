package tranTrungTien.bai02;

public class Point {
	private int x;
	private int y;
	private String name;

	public Point() {
		this.x = 0;
		this.y = 0;
		this.name = "O";
	}

	public Point(int x, int y, String name) {
		setX(x);
		setY(y);
		setName(name);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x >= 0)
			this.x = x;
		else
			this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if (y >= 0)
			this.y = y;
		else
			this.y = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.trim().equals("")) {
			this.name = "O";
		} else {
			this.name = name;
		}
	}

	public Point negate() {
		Point p = new Point();
		p.name = this.name + "'";
		p.x = -(this.x);
		p.y = -(this.y);
		return p;
	}

	public double getDistace() {
		double distance = Math.sqrt((x - 0) * (x - 0) + (y - 0) * (y - 0));
		return distance;
	}

	public double getDistace(Point a) {
		double distanceAB = Math.sqrt((x - a.getX()) * (x - a.getX()) + (y - a.getY()) * (y - a.getY()));
		return distanceAB;
	}

	public String toString() {
		return String.format("%s(%d,%d)", name, x, y);
	}

}
