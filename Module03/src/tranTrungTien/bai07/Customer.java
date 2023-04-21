package tranTrungTien.bai07;

public class Customer extends Person {
	private String companyName;
	private double triGiaHoaDon;

	public Customer() {
		super();
		this.companyName = "Chua xac dinh";
		this.triGiaHoaDon = 0;
	}

	public Customer(String name, String address, String companyName, double triGiaHoaDon) {
		super(name, address);
		setCompanyName(companyName);
		setTriGiaHoaDon(triGiaHoaDon);
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		if (companyName.trim().equals(""))
			this.companyName = "Chua xac dinh";
		else
			this.companyName = companyName;
	}

	public double getTriGiaHoaDon() {
		return triGiaHoaDon;
	}

	public void setTriGiaHoaDon(double triGiaHoaDon) {
		if (triGiaHoaDon < 0)
			this.triGiaHoaDon = 0;
		else
			this.triGiaHoaDon = triGiaHoaDon;
	}

	public String danhGia() {
		return "";
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%15s|%15s|%15s|%15s|%20s|%15s|%15s|", "-", "-", "-", "-", "-",
				companyName, triGiaHoaDon);
	}

}
