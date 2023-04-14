package tranTrungTien.bai09;

public class ToaDo {
	private String ten;
	private float x;
	private float y;

	public ToaDo() {
		this.ten = "O";
		this.x = 0;
		this.y = 0;
	}

	public ToaDo(String ten, float x, float y) {
		setTen(ten);
		setX(x);
		setY(y);
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		if (!(ten.trim().equals("")))
			this.ten = ten;
		else
			this.ten = "O";
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public String toString() {
		return String.format("%s(%s,%s)", ten, x, y);
	}

}
