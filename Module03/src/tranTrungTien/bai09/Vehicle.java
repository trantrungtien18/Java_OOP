package tranTrungTien.bai09;

import java.text.DecimalFormat;

public abstract class Vehicle {
	private String name;
	private int numOfWheel;
	private double displacement;
	private int weight;
	private double price;

	public Vehicle() {
		this.name = "xxx";
		this.numOfWheel = 0;
		this.displacement = 0;
		this.weight = 0;
		this.price = 0;
	}

	public Vehicle(String name, int numOfWheel, double displacement, int weight, double price) {
		setName(name);
		setNumOfWheel(numOfWheel);
		setDisplacement(displacement);
		setWeight(weight);
		setPrice(price);
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

	public int getNumOfWheel() {
		return numOfWheel;
	}

	public void setNumOfWheel(int numOfWheel) {
		if (numOfWheel > 0)
			this.numOfWheel = numOfWheel;
		else
			this.numOfWheel = 0;
	}

	public double getDisplacement() {
		return displacement;
	}

	public void setDisplacement(double displacement) {
		if (displacement > 0)
			this.displacement = displacement;
		else
			this.displacement = 0;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if (weight > 0)
			this.weight = weight;
		else
			this.weight = 0;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0)
			this.price = price;
		else
			this.price = 0;
	}

	public abstract double getTax();

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return String.format("|%-15s|%12s|%13s|%12s|%20s|", name, numOfWheel, displacement, weight, df.format(price));
	}

}
