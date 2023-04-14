package tranTrungTien.bai09;

public class Car extends Vehicle {
	private String category;
	private int numOfSeat;

	public Car() {
		super();
		this.category = "Chua xac dinh";
		this.numOfSeat = 0;
	}

	public Car(String name, int numOfWheel, double displacement, int weight, double price, String category,
			int numOfSeat) {
		super(name, numOfWheel, displacement, weight, price);
		setCategory(category);
		setNumOfSeat(numOfSeat);
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		if (category.trim().equalsIgnoreCase("truck") || category.trim().equalsIgnoreCase("passenger"))
			this.category = category;
		else
			this.category = "Chua xac dinh";
	}

	public int getNumOfSeat() {
		return numOfSeat;
	}

	public void setNumOfSeat(int numOfSeat) {
		if (numOfSeat > 0)
			this.numOfSeat = numOfSeat;
		else
			this.numOfSeat = 0;
	}

	public double getTax() {
		double tax = 0;
		if (category.trim().equalsIgnoreCase("passenger")) {
			if (numOfSeat >= 5) {
				tax = super.getPrice() * (0.3 + 0.1 + 0.2);
			} else {
				tax = super.getPrice() * (0.5 + 0.1 + 0.2);
			}
		} else {
			tax = super.getPrice() * (0.1 + 0.02);
		}
		return tax;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-15s|%10s|", category, numOfSeat);
	}

}
