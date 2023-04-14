package tranTrungTien.bai14;

import java.text.DecimalFormat;

public class OrderDetail {
	private int quantity;
	private Product product;

	public OrderDetail(int quantity, Product product) {
		setquantity(quantity);
		this.product = product;
	}

	public int getquantity() {
		return quantity;
	}

	public void setquantity(int quantity) {
		if (!(quantity < 0))
			this.quantity = quantity;
		else
			this.quantity = 0;
	}

	public double calcTotalPrice() {
		return quantity * product.getPrice();
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		return String.format("%-20s | %10s | %15s", product, quantity, df.format(calcTotalPrice()));
	}
}