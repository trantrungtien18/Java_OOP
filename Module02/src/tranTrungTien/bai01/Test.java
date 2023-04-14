package tranTrungTien.bai01;

public class Test {
	public static void main(String[] args) {
		ToaDo A = new ToaDo();
		ToaDo B = new ToaDo(5, 7, "B");
		System.out.println("Toa do diem: " + A.getThongTin());
		System.out.println("Toa do diem: " + B.getThongTin());
	}
}