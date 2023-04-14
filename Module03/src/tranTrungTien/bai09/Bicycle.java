package tranTrungTien.bai09;

public class Bicycle extends Vehicle {
	private String category;

	public Bicycle() {
		super();
		this.category = "Chua xac dinh";
	}

	public Bicycle(String name, int numOfWheel, double displacement, int weight, double price, String category) {
		super(name, numOfWheel, displacement, weight, price);
		setCategory(category);
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		if (category.trim().equalsIgnoreCase("sport") || category.trim().equalsIgnoreCase("child"))
			this.category = category;
		else
			this.category = "Chua xac dinh";
	}

	public double getTax() {
		return 0;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-15s|%10s|", category, "");
	}

}
