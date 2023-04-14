package tranTrungTien.bai10;

public class Test {

	public static void main(String[] args) {
		SinhVien[] dsSV = new SinhVien[4];
		dsSV[0] = new SinhVien("123", "Nguyen Van A");
		dsSV[1] = new SinhVien("543", "Nguyen Van B");
		dsSV[2] = new SinhVien("321", "Nguyen Van C");
		dsSV[3] = new SinhVien("789", "Nguyen Van D");
		LopHocPhan lp1 = new LopHocPhan("123456", "LT Huong doi tuong", "Co Ha", "Thu 7, tiet 4-6, phong A1.1", dsSV);
		System.out.println(lp1);
	}
}
