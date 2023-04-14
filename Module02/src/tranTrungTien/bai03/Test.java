package tranTrungTien.bai03;

public class Test {

	public static void main(String[] args) {
		Cylinder a = new Cylinder();
		Cylinder b = new Cylinder(5, 6);
		System.out.println("Thong tin hinh tru: " + a);
		System.out.println("Thong tin hinh tru: " + b);
		System.out.println("Dien tich xung quanh: " + b.tinhDienTichXungQuanh());
		System.out.println("Dien tich toan phan: " + b.tinhDienTichToanPhan());
		System.out.println("The tich: " + b.tinhTheTich());
	}

}
