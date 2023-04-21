package tranTrungTien.bai05;

public abstract class Employee {
	private String firtName;
	private String lastName;
	private String SSN;

	public Employee() {
		this.firtName = "chua xac dinh";
		this.lastName = "chua xac dinh";
		this.SSN = "xxx";
	}

	public Employee(String firtName, String lastName, String sSN) {
		setFirtName(firtName);
		setLastName(lastName);
		setSSN(sSN);
	}

	public String getFirtName() {
		return firtName;
	}

	public void setFirtName(String firtName) {
		if (!(firtName.trim().equals("")))
			this.firtName = firtName;
		else
			this.firtName = "Chua xac dinh";
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (!(lastName.trim().equals("")))
			this.lastName = lastName;
		else
			this.lastName = "Chua xac dinh";
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		if (!(sSN.trim().equals("")))
			SSN = sSN;
		else
			this.SSN = "Chua xac dinh";
	}

	public abstract double getMoney();

//	private String getTitle() {
//		return String.format("|%-10s|%-10s|%-5s|%-15s|%-15s|%-15s", "FirstName", "LastName", "SSN", "Money",
//				"Hour/C.Rate", "BaseSalary");
//	}
//	public abstract String getTitle();

	@Override
	public String toString() {
		String name = firtName + " " + lastName;
		return String.format("|%15s|%-15s|", name, SSN);

//		String s = String.format("%s %s", firtName, lastName) + "\n"
//				+ String.format("Social security number: %-10s", SSN);
//		return s;
	}

}
