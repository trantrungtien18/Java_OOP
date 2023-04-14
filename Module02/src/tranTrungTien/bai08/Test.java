package tranTrungTien.bai08;

public class Test {
	public static void main(String[] args) {
		Account acc1 = new Account(72354, "Ted Murphy", 100000);
		Account acc2 = new Account(69713, "Jane Smith", 40000);
		Account acc3 = new Account(93757, "Edward Demsey", 700000);
		acc1.deposit(250000);
		acc2.deposit(500000);
		acc2.withdraw(430000, 2000);
		acc3.addInterest();
		System.out.println(String.format("%-20s%-20s%30s", "Account_Number", "Name", "Balance"));
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
		System.out.println("----------------------------------------------------------------------------");
		acc1.transfer(acc2, 100000);
		System.out.println("Thong tin cac account sau khi chuyen tien:");
		System.out.println(String.format("%-20s%-20s%30s", "Account_Number", "Name", "Balance"));
		System.out.println(acc1);
		System.out.println(acc2);
	}
}
