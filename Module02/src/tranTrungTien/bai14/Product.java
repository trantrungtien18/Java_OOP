package tranTrungTien.bai14;

import java.text.DecimalFormat;

public class Product {
	private String description;
	private String productID;
	private double price;

	public Product() {
		this.description = "Chua xac dinh";
		this.productID = "spX";
		this.price = 0;
	}

	public Product(String description, String productID, double price) {
		setDescription(description);
		setProductID(productID);
		setPrice(price);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		if (!(description.trim().equals("")))
			this.description = description;
		else
			this.description = "Chua xac dinh";
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		if (!(productID.trim().equals("")))
			this.productID = productID;
		else
			this.productID = "spX";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (!(price < 0))
			this.price = price;
		else
			this.price = 0;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return String.format("%-8s| %-15s| %10s", productID, description, df.format(price));
	}

}