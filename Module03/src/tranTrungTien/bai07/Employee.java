package tranTrungTien.bai07;

import java.text.DecimalFormat;

public class Employee extends Person {
	private double rateWage;

	public Employee() {
		super();
		this.rateWage = 0;
	}

	public Employee(String name, String address, double rateWage) {
		super(name, address);
		setRateWage(rateWage);
	}

	public double getRateWage() {
		return rateWage;
	}

	public void setRateWage(double rateWage) {
		if (rateWage < 0)
			this.rateWage = 0;
		else
			this.rateWage = rateWage;
	}

	public double getSalary() {
		return rateWage * 500000;
	}

	public String danhGia() {
		if (rateWage >= 5)
			return "He so luong cao";
		else if (rateWage >= 2)
			return "He so luong trung binh";
		else
			return "He so luong thap";
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		return super.toString() + String.format("%15s|%15s|%15s|%15s|%20s|%15s|%15s|", "-", "-", "-", rateWage,
				df.format(getSalary()), "-", "-");
	}

}
