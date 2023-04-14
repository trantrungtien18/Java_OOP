package tranTrungTien.bai10;

import java.time.LocalDate;

public class AffiliatedCollege extends Student {
	private String nat;

	public AffiliatedCollege() {
		super();
		this.nat = "xxx";
	}

	public AffiliatedCollege(String id, String name, LocalDate dob, String address, String nat) {
		super(id, name, dob, address);
		this.nat = nat;
	}

	public String getNat() {
		return nat;
	}

	public void setNat(String nat) {
		if (nat.trim().equalsIgnoreCase("austraulia") || nat.trim().equalsIgnoreCase("usa"))
			this.nat = nat;
		else
			this.nat = "xxx";
	}

	public String getBangCap() {
		return "Bang quoc te";
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%10s|%15s|", nat, getBangCap());
	}

}
