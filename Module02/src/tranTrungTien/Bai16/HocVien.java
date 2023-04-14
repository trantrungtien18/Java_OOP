package tranTrungTien.Bai16;

public class HocVien {
	private String name;
	private String address;
	private String phoneNumber;

	public HocVien(String name, String address, String phoneNumber) {
		super();
		setName(name);
		setAddress(address);
		setPhoneNumber(phoneNumber);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!(name.trim().equals("")))
			this.name = name;
		else
			this.name = "Hoc vien X";
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (!(address.trim().equals("")))
			this.address = address;
		else
			this.address = "Chua xac dinh";
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		if (!(phoneNumber.trim().equals("")))
			this.phoneNumber = phoneNumber;
		else
			this.phoneNumber = "xxxxxxxxxx";
	}

	@Override
	public String toString() {
		return String.format("%-20s|%-30s|%20s", name, address, phoneNumber);
	}

}
