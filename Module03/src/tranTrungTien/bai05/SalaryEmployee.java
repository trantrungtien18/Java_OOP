package tranTrungTien.bai05;

import java.text.DecimalFormat;

public class SalaryEmployee extends Employee {
	private double weeklySalary;

	public SalaryEmployee() {
		super();
		this.weeklySalary = 0;
	}

	public SalaryEmployee(String firtName, String lastName, String sSN, double weeklySalary) {
		super(firtName, lastName, sSN);
		setWeeklySalary(weeklySalary);
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		if (!(weeklySalary < 0))
			this.weeklySalary = weeklySalary;
		else
			this.weeklySalary = 0;
	}

	public double getMoney() {
		return weeklySalary;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		return super.toString()
				+ String.format("%15s|%15s|%15s|%15s|%15s|%15s|", "-", "-", "-", "-", df.format(weeklySalary), "-");
	}
}
