package tranTrungTien.bai05;

import java.text.DecimalFormat;

public class BasePlus_Commission_Employee extends Commission_Employee {
	private double baseSalary;

	public BasePlus_Commission_Employee() {
		super();
		this.baseSalary = 0;
	}

	public BasePlus_Commission_Employee(String firtName, String lastName, String sSN, int grossSales,
			double commissionRate, double baseSalary) {
		super(firtName, lastName, sSN, grossSales, commissionRate);
		setBaseSalary(baseSalary);
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary >= 0)
			this.baseSalary = baseSalary;
		else
			this.baseSalary = 0;
	}

	public double getMoney() {
		return super.getMoney() + baseSalary;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		String s = "";
		s += "\nBaseplus " + super.toString() + String.format("%15s|", df.format(baseSalary));
		return s + "\n";
	}

}