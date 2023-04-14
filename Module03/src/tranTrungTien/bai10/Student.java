package tranTrungTien.bai10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Student {
	private String id;
	private String name;
	private LocalDate dob;
	private String address;

	public Student() {
		this.id = "xxx";
		this.name = "xxx";
		this.dob = LocalDate.now();
		this.address = "xxx";
	}

	public Student(String id, String name, LocalDate dob, String address) {
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (!(id.trim().equals("")))
			this.id = id;
		else
			this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!(name.trim().equals("")))
			this.name = name;
		else
			this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		if (dob.isAfter(LocalDate.now()))
			this.dob = LocalDate.now();
		else
			this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (!(address.trim().equals("")))
			this.address = address;
		else
			this.address = "xxx";
	}

	public abstract String getBangCap();

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("|%10s|%15s|%12s|%15s|", id, name, dtf.format(dob), address);
	}

}
