package tranTrungTien.bai14;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		Order hd = new Order(1, LocalDate.of(2022, 12, 28));
		hd.addLineItems(new Product("Nuoc tuong", "sp4", 8000), 10);
		hd.addLineItems(new Product("Gao", "sp1", 18000), 5);
		hd.addLineItems(new Product("Duon", "sp3", 10000), 1);
		hd.addLineItems(new Product("Gao", "sp1", 18000), 1);
		System.out.println(hd);
	}

}