package tranTrungTien.bai05;

import java.text.DecimalFormat;

public class Hourly_Employee extends Employee {
	private double wage;
	private int hours;

	public Hourly_Employee() {
		super();
		this.wage = 0;
		this.hours = 0;
	}

	public Hourly_Employee(String firtName, String lastName, String sSN, double wage, int hours) {
		super(firtName, lastName, sSN);
		setWage(wage);
		setHours(hours);
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if (!(wage < 0))
			this.wage = wage;
		else
			this.wage = 0;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (!(hours < 0))
			this.hours = hours;
		else
			this.hours = 0;
	}

	public double getMoney() {
		if (hours <= 40)
			return wage * hours;
		else
			return 40 * wage + (hours - 40) * wage * 1.5;
	}

	public String getTitle() {
		return String.format("|%-10s|%-15s|%-15s|%-15s|%-15s|", "Name", "SSN", "Wage", "Hour", "Salary");
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		String s = "";
		s += super.toString() + String.format("%15s|%15s|%15s|", wage, hours, df.format(getMoney()));
//		s += "Hourly Employee: " + super.toString() + "\n" + String
//				.format("Hourly wage: %s; hours worked: %s", df.format(wage), hours) + "\n";
		return "Hourly Employee:\n" + getTitle() + "\n" + s + "\n";
	}
}
//+ "\n------------------------------------------------------------------------------------\n"