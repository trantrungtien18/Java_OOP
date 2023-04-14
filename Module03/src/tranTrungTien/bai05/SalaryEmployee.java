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

	public String getTitle() {
		return String.format("|%-10s|%-15s|%-15s|%-15s|%-15s|", "Name", "SSN", "", "", "Salary");
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		String s = "";
		s += super.toString() + String.format("%15s|%15s|%15s|", "", "", df.format(weeklySalary));
//		s += "Salaried employee: " + super.toString() + "\n"
//				+ String.format("Weekly salary: %s", df.format(weeklySalary)) + "\n";
		return "Salary Employee:\n" + getTitle() + "\n" + s + "\n";
	}
}
//+ "\n------------------------------------------------------------------------------------\n"