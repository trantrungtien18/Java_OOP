package tranTrungTien.bai05;

public class Triangle {
	private int ma;
	private int mb;
	private int mc;

	public Triangle() {
		this.ma = 1;
		this.mb = 1;
		this.mc = 1;
	}

	public boolean isTriangle() {
		if (ma < 0 || mb < 0 || mc < 0 || ((ma + mb < mc) && (ma + mc < mb) && (mb + mc < ma))) {
			return false;
		} else {
			return true;
		}
	}

//  (a + b > c) && (a + c > b) && (b + c > a) => 1 tam giac
	public Triangle(int ma, int mb, int mc) {
		if (!isTriangle()) {
			this.ma = 0;
			this.mb = 0;
			this.mc = 0;
		} else {
			this.ma = ma;
			this.mb = mb;
			this.mc = mc;
		}
	}

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		if (ma > 0) {
			this.ma = ma;
		} else {
			this.ma = 0;
		}
	}

	public int getMb() {
		return mb;
	}

	public void setMb(int mb) {
		if (mb > 0) {
			this.mb = mb;
		} else {
			this.mb = 0;
		}
	}

	public int getMc() {
		return mc;
	}

	public void setMc(int mc) {
		if (mc > 0) {
			this.mc = mc;
		} else {
			this.mc = 0;
		}
	}

	public int getPerimeter() {
		return ma + mb + mc;
	}

	public double getArea() {
		double p = getPerimeter() / 2;
		double s = Math.sqrt(p * (p - ma) * (p - mb) * (p - mc));
		return s;
	}

	public String checkTriagle() {
		if (ma == mb && mb == mc) {
			return "Tam giac deu!";
		} else if ((ma == mb) || (ma == mc) || (mc == mb)) {
			return "Tam giac can";
		} else if (isTriangle()) {
			return "Tam giac thuong";
		} else {
			return "Khong la tam giac";
		}
	}

	//@Override
	public String toString() {
		return String.format("%5s|%5s|%5s|%20s|%10s|%15.2f", ma, mb, mc, checkTriagle(), getPerimeter(), getArea());
	}

}
