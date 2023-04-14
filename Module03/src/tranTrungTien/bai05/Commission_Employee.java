package tranTrungTien.bai05;

import java.text.DecimalFormat;

public class Commission_Employee extends Employee {
	private int grossSales;
	private double commissionRate;

	public Commission_Employee() {
		super();
		this.grossSales = 0;
		this.commissionRate = 0;
	}

	public Commission_Employee(String firtName, String lastName, String sSN, int grossSales, double commissionRate) {
		super(firtName, lastName, sSN);
		setGrossSales(grossSales);
		setCommissionRate(commissionRate);
	}

	public int getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(int grossSales) {
		if (!(grossSales < 0))
			this.grossSales = grossSales;
		else
			this.grossSales = 0;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if (!(commissionRate < 0))
			this.commissionRate = commissionRate;
		else
			this.commissionRate = 0;
	}

	public double getMoney() {
		return commissionRate * grossSales;
	}

	public String getTitle() {
		return String.format("|%-10s|%-15s|%-15s|%-15s|%-15s|%15s|", "Name", "SSN", "GrossSales", "CommissionRate",
				"Salary", "BaseSalary");
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		String s = "";
		s += super.toString() + String.format("%15s|%15s|%15s|", grossSales, commissionRate, df.format(getMoney()));
//		s += "Commission employee: " + super.toString() + "\n"
//				+ String.format("Gross sales: %s;\nCommission rate: %s", df.format(grossSales),
//						commissionRate)
//				+ "\n";
		return "Commission Employee:\n" + getTitle() + "\n" + s;
	}

}