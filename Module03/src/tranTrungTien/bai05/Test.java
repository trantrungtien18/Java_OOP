package tranTrungTien.bai05;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1 = new SalaryEmployee("Nguyen", "A", "111", 10000);
		Employee e2 = new Hourly_Employee("Nguyen", "B", "222", 5000, 8);
		Employee e3 = new Commission_Employee("Nguyen", "C", "333", 15000, 2.5);
		Employee e4 = new BasePlus_Commission_Employee("Nguyen", "D", "444", 20000, 1.5, 15000);
		Employee e5 = new BasePlus_Commission_Employee("Nguyen", "F", "445", 30000, 1.5, 25000);
		Employee e6 = new Hourly_Employee("Nguyen", "G", "225", 2000, 10);
		ListEmployee ds = new ListEmployee();
		ds.addEmployee(e1);
		ds.addEmployee(e2);
		ds.addEmployee(e3);
		ds.addEmployee(e4);
		ds.addEmployee(e5);
		ds.addEmployee(e6);
		System.out.println(ds);
		System.out.print("Nhap SSN cua nhan vien muon xoa: ");
		String ssnXoa = sc.nextLine();
		
	}

}
