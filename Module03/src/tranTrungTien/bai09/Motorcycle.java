package tranTrungTien.bai09;

public class Motorcycle extends Vehicle {
	private String fuelType;

	public Motorcycle() {
		super();
		this.fuelType = "Chua xac dinh";
	}

	public Motorcycle(String name, int numOfWheel, double displacement, int weight, double price, String fuelType) {
		super(name, numOfWheel, displacement, weight, price);
		setFuelType(fuelType);
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		if (fuelType.trim().equalsIgnoreCase("electric") || fuelType.trim().equalsIgnoreCase("petrol"))
			this.fuelType = fuelType;
		else
			this.fuelType = "Chua xac dinh";
	}

	public double getTax() {
		return super.getPrice() * (0.1 + 0.05);
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-15s|%10s|", fuelType, "");
	}

}
