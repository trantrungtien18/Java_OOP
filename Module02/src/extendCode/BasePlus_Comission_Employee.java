package extendCode;

import java.text.DecimalFormat;

import tranTrungTien.bai05.Employee;

public class BasePlus_Comission_Employee extends Employee {
	private double grossSales;
	private double commissionRate;
	private double baseSalary;

	public BasePlus_Comission_Employee() {
		super();
		this.grossSales = 0;
		this.commissionRate = 0;
		this.baseSalary = 0;
	}

	public BasePlus_Comission_Employee(String firtName, String lastName, String sSN, double grossSales,
			double commissionRate, double baseSalary) {
		super(firtName, lastName, sSN);
		setGrossSales(grossSales);
		setCommissionRate(commissionRate);
		setBaseSalary(baseSalary);
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
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

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (!(baseSalary < 0))
			this.baseSalary = baseSalary;
		else
			this.baseSalary = 0;
	}

	public double getMoney() {
		return (commissionRate * grossSales) + baseSalary;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		String s = "";
		s += "Base salaried commission employee: " + super.toString() + "\n" + "Gross sales: " + df.format(grossSales)
				+ "\n" + "Commission rate: " + commissionRate + "\n" + "Base salary: " + df.format(baseSalary)
				+ "\n------------------------------------------------------------------------------------\n";
		return s;
	}

}
