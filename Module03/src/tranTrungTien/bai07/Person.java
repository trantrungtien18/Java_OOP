package tranTrungTien.bai07;

public abstract class Person {
	private String name;
	private String address;

	public Person() {
		this.name = "xxx";
		this.address = "Chua xac dinh";
	}

	public Person(String name, String address) {
		setName(name);
		setAddress(address);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.trim().equals(""))
			this.name = "xxx";
		else
			this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (address.trim().equals(""))
			this.address = "Chua xac dinh";
		else
			this.address = address;
	}

	public abstract String danhGia();

	@Override
	public String toString() {
		return String.format("|%15s|%20s|", name, address);
	}

}
