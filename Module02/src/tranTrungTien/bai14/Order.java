package tranTrungTien.bai14;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Order {
	private int orderID;
	private LocalDate orderDate;
	private OrderDetail[] lineItems;
	private int count;

	public Order(int orderID, LocalDate orderDate) {
		this.orderID = orderID;
		this.orderDate = orderDate;
		this.lineItems = new OrderDetail[10];
		this.count = 0;
	}

	public int getOrderID() {
		return orderID;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public OrderDetail[] getLineItems() {
		return lineItems;
	}

	public void addLineItems(Product sp, int sl) {
		if (count > 20) {
			System.out.println("So luong toi da chi co 20 sap pham");
			return;
		}
		lineItems[count] = new OrderDetail(sl, sp);
		count++;
//		lineItems.add(new OrderDetail(sl, sp));
	}

	public double calcTotalCharge() {
		double total = 0;
		for (int i = 0; i < count; i++) {
			total += lineItems[i].calcTotalPrice();
		}
		return total;
	}

	public String getTitle() {
		return String.format("%s | %-7s| %-15s| %10s | %10s | %14s\n", "STT", "Mã SP", "Mô tả", "Đơn Giá", "S Lượng",
				"Thành Tiền");
	}

	@Override
	public String toString() {
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String sngay = dft.format(orderDate);
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		String s = String.format("");
		s += "Ma HD: " + orderID + "\n";
		s += "Ngay lap hoa don: " + sngay + "\n";
		s += getTitle();

		for (int i = 0; i < count; i++) {
			s += " " + (i+1) + "  |" + lineItems[i] + "\n";
		}

		s += "Tong tien thanh toan: " + df.format(calcTotalCharge());
		return s;
	}

}