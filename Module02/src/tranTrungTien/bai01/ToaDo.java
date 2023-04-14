package tranTrungTien.bai01;

public class ToaDo {
	private int x;
	private int y;
	private String name;

	public ToaDo() {
		this.x = 0;
		this.y = 0;
		this.name = "O";
	}

	public ToaDo(int x, int y, String name) {
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
			this.x = 0;
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

	public String getThongTin() {
		return String.format("%s(%d,%d)", name, x, y);
	}

}
